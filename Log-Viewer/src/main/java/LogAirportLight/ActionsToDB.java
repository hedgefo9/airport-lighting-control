package LogAirportLight;

import de.re.easymodbus.modbusclient.ModbusClient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ActionsToDB {
    public static void main(String[] args) throws Exception {
        logo();
    }

    public static void logo()
    {
        try {
        	ModbusClient mc = new ModbusClient("192.168.0.53",502);
            mc.Connect();
            
        	int[] coilsList = {8,16,24,32,40,48,56,64,72,80,88,96};
        	
            ArrayList<boolean[]> QFromLogoLast = new ArrayList<boolean[]>();
            
            for (int i = 0; i < 12; i++) 
            {
            	QFromLogoLast.add(mc.ReadCoils(coilsList[i]+1, 1));
            }
            
            while (true) {
                ArrayList<boolean[]> QFromLogo = new ArrayList<boolean[]>();
               	
                for (int i = 0; i < 12; i++) 
                {
                	QFromLogo.add(mc.ReadCoils(coilsList[i]+1, 1));
                }
                
                for (int i = 0; i < QFromLogo.size(); i++) {
                	if (QFromLogo.get(i)[0] != QFromLogoLast.get(i)[0]) 
                	{
                		Date d = new Date();
                        LightActions a = new LightActions();
                        a.setEid(i + 11);
                        a.setState(QFromLogo.get(i)[0]);
                        a.setCreated(d);

                        SessionFactory sf = forworkspace_conf(LightActions.class).buildSessionFactory();
                        Session session = sf.openSession();
                        Transaction tx = session.beginTransaction();

                        session.save(a);

                        tx.commit();
                        session.close();
                        sf.close();
                	}
                	
                    System.out.print((QFromLogo.get(i)[0] ? 1 : 0) + " ");
                }
                System.out.println();
                Thread.sleep(1000);
                QFromLogoLast = QFromLogo;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Configuration forworkspace_conf(Class<?> c)
    {
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/workspace");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "main");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.HBM2DDL_AUTO, "update");
        Configuration conf = new Configuration().addProperties(settings).addAnnotatedClass(c);
        return conf;
    }
}
