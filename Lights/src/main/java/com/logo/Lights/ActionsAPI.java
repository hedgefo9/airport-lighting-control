package com.logo.Lights;

import java.util.List;
import java.util.Properties;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ActionsAPI
{
	@RequestMapping(value="search")
	public ModelAndView search() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/pages/search.jsp");
		return mav;
	}
	
	@RequestMapping(value="getRecordsOfPeriod", method = RequestMethod.POST)
	public @ResponseBody List<LightActions> getRecords(@RequestBody SortActionsByDate sbd)
	{
		System.out.println(sbd.getAfterIt());
		SessionFactory sf = forworkspace_conf(LightActions.class).buildSessionFactory();
	    Session session = sf.openSession();
	    
	    CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<LightActions> cq = cb.createQuery(LightActions.class);
        Root<LightActions> root = cq.from(LightActions.class);
	    
        Predicate p1 = cb.lessThan(root.get("created"), sbd.getBeforeIt());
        Predicate p2 = cb.greaterThan(root.get("created"), sbd.getAfterIt());
        Order o3 = sbd.isDesc() ? cb.desc(root.get("created")) : cb.asc(root.get("created"));
        cq
          .where(p1,p2)
          .orderBy(o3);
        
        List<LightActions> ac = session.createQuery(cq)
        		.getResultList();

        session.close();
        sf.close();
        
		return ac;
	}
	
	public static org.hibernate.cfg.Configuration forworkspace_conf(Class<?> c)
    {
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/workspace");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "main");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.HBM2DDL_AUTO, "update");
        org.hibernate.cfg.Configuration conf = new org.hibernate.cfg.Configuration().addProperties(settings).addAnnotatedClass(c);
        return conf;
    }
	
}


