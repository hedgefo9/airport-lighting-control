package LogAirportLight;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.text.SimpleDateFormat;

public class maction {

    public static void simulate() throws Exception {
        try {
            SessionFactory sf = ActionsToDB.forworkspace_conf(LightActions.class).buildSessionFactory();
            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            LightActions[] a = new LightActions[141];

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

             a[0] = new LightActions(sdf.parse("2019-03-01 17:33"), 11, true);
             a[1] = new LightActions(sdf.parse("2019-03-01 17:33"), 12, true);
             a[2] = new LightActions(sdf.parse("2019-03-01 17:33"), 13, true);
             a[3] = new LightActions(sdf.parse("2019-03-01 17:33"), 14, true);
             a[4] = new LightActions(sdf.parse("2019-03-01 17:36"), 15, true);
             a[5] = new LightActions(sdf.parse("2019-03-01 17:36"), 16, true);
             a[6] = new LightActions(sdf.parse("2019-03-01 17:36"), 17, true);
             a[7] = new LightActions(sdf.parse("2019-03-01 17:36"), 18, true);
             a[8] = new LightActions(sdf.parse("2019-03-01 17:50"), 19, true);
             a[9] = new LightActions(sdf.parse("2019-03-01 17:50"), 20, true);
            a[10] = new LightActions(sdf.parse("2019-03-01 17:50"), 21, true);

            a[11] = new LightActions(sdf.parse("2019-03-01 18:31"), 11, false);
            a[12] = new LightActions(sdf.parse("2019-03-01 18:31"), 12, false);
            a[13] = new LightActions(sdf.parse("2019-03-01 18:31"), 13, false);
            a[14] = new LightActions(sdf.parse("2019-03-01 18:31"), 14, false);
            a[15] = new LightActions(sdf.parse("2019-03-01 18:35"), 15, false);
            a[16] = new LightActions(sdf.parse("2019-03-01 18:35"), 16, false);
            a[17] = new LightActions(sdf.parse("2019-03-01 18:35"), 17, false);
            a[18] = new LightActions(sdf.parse("2019-03-01 18:35"), 18, false);
            a[19] = new LightActions(sdf.parse("2019-03-01 19:05"), 19, false);
            a[20] = new LightActions(sdf.parse("2019-03-01 19:06"), 20, false);
            a[21] = new LightActions(sdf.parse("2019-03-01 19:08"), 21, false);

            a[22] = new LightActions(sdf.parse("2019-03-01 18:40"), 11, true);
            a[23] = new LightActions(sdf.parse("2019-03-01 18:40"), 12, true);
            a[24] = new LightActions(sdf.parse("2019-03-01 18:40"), 13, true);
            a[25] = new LightActions(sdf.parse("2019-03-01 18:40"), 14, true);
            a[26] = new LightActions(sdf.parse("2019-03-01 18:50"), 15, true);
            a[27] = new LightActions(sdf.parse("2019-03-01 18:50"), 16, true);
            a[28] = new LightActions(sdf.parse("2019-03-01 18:50"), 17, true);
            a[29] = new LightActions(sdf.parse("2019-03-01 18:50"), 18, true);
            a[30] = new LightActions(sdf.parse("2019-03-01 19:00"), 22, true);

            a[31] = new LightActions(sdf.parse("2019-03-01 19:10"), 11, false);
            a[32] = new LightActions(sdf.parse("2019-03-01 19:10"), 12, false);
            a[33] = new LightActions(sdf.parse("2019-03-01 19:12"), 13, false);
            a[34] = new LightActions(sdf.parse("2019-03-01 19:12"), 14, false);
            a[35] = new LightActions(sdf.parse("2019-03-01 19:11"), 15, false);
            a[36] = new LightActions(sdf.parse("2019-03-01 19:11"), 16, false);
            a[37] = new LightActions(sdf.parse("2019-03-01 19:13"), 17, false);
            a[38] = new LightActions(sdf.parse("2019-03-01 19:13"), 18, false);
            a[39] = new LightActions(sdf.parse("2019-03-01 19:05"), 22, false);

            a[40] = new LightActions(sdf.parse("2019-03-01 19:20"), 11, true);
            a[41] = new LightActions(sdf.parse("2019-03-01 19:20"), 12, true);
            a[42] = new LightActions(sdf.parse("2019-03-01 19:20"), 13, true);
            a[43] = new LightActions(sdf.parse("2019-03-01 19:20"), 14, true);
            a[44] = new LightActions(sdf.parse("2019-03-01 19:20"), 15, true);
            a[45] = new LightActions(sdf.parse("2019-03-01 19:20"), 16, true);
            a[46] = new LightActions(sdf.parse("2019-03-01 19:20"), 17, true);
            a[47] = new LightActions(sdf.parse("2019-03-01 19:20"), 18, true);
            a[48] = new LightActions(sdf.parse("2019-03-01 19:20"), 19, true);
            a[49] = new LightActions(sdf.parse("2019-03-01 19:20"), 20, true);
            a[50] = new LightActions(sdf.parse("2019-03-01 19:20"), 21, true);

            a[51] = new LightActions(sdf.parse("2019-03-02 07:51"), 11, false);
            a[52] = new LightActions(sdf.parse("2019-03-02 07:51"), 12, false);
            a[53] = new LightActions(sdf.parse("2019-03-02 07:51"), 13, false);
            a[54] = new LightActions(sdf.parse("2019-03-02 07:51"), 14, false);
            a[55] = new LightActions(sdf.parse("2019-03-02 07:51"), 15, false);
            a[56] = new LightActions(sdf.parse("2019-03-02 07:51"), 16, false);
            a[57] = new LightActions(sdf.parse("2019-03-02 07:51"), 17, false);
            a[58] = new LightActions(sdf.parse("2019-03-02 07:51"), 18, false);
            a[59] = new LightActions(sdf.parse("2019-03-02 07:32"), 19, false);
            a[60] = new LightActions(sdf.parse("2019-03-02 07:32"), 20, false);
            a[61] = new LightActions(sdf.parse("2019-03-02 07:32"), 21, false);

            a[62] = new LightActions(sdf.parse("2019-03-02 17:35"), 11, true);
            a[63] = new LightActions(sdf.parse("2019-03-02 17:35"), 12, true);
            a[64] = new LightActions(sdf.parse("2019-03-02 17:35"), 13, true);
            a[65] = new LightActions(sdf.parse("2019-03-02 17:35"), 14, true);
            a[66] = new LightActions(sdf.parse("2019-03-02 17:35"), 15, true);
            a[67] = new LightActions(sdf.parse("2019-03-02 17:35"), 16, true);
            a[68] = new LightActions(sdf.parse("2019-03-02 17:35"), 17, true);
            a[69] = new LightActions(sdf.parse("2019-03-02 17:35"), 18, true);
            a[70] = new LightActions(sdf.parse("2019-03-02 17:24"), 19, true);
            a[71] = new LightActions(sdf.parse("2019-03-02 17:24"), 20, true);
            a[72] = new LightActions(sdf.parse("2019-03-02 17:24"), 21, true);

            a[73] = new LightActions(sdf.parse("2019-03-04 07:46"), 11, false);
            a[74] = new LightActions(sdf.parse("2019-03-04 07:46"), 12, false);
            a[75] = new LightActions(sdf.parse("2019-03-04 07:46"), 13, false);
            a[76] = new LightActions(sdf.parse("2019-03-04 07:46"), 14, false);
            a[77] = new LightActions(sdf.parse("2019-03-04 07:46"), 15, false);
            a[78] = new LightActions(sdf.parse("2019-03-04 07:46"), 16, false);
            a[79] = new LightActions(sdf.parse("2019-03-04 07:46"), 17, false);
            a[80] = new LightActions(sdf.parse("2019-03-04 07:46"), 18, false);
            a[81] = new LightActions(sdf.parse("2019-03-04 07:20"), 19, false);
            a[82] = new LightActions(sdf.parse("2019-03-04 07:20"), 20, false);
            a[83] = new LightActions(sdf.parse("2019-03-04 07:20"), 21, false);

            a[84] = new LightActions(sdf.parse("2019-03-04 17:32"), 11, true);
            a[85] = new LightActions(sdf.parse("2019-03-04 17:32"), 12, true);
            a[86] = new LightActions(sdf.parse("2019-03-04 17:32"), 13, true);
            a[87] = new LightActions(sdf.parse("2019-03-04 17:32"), 14, true);
            a[88] = new LightActions(sdf.parse("2019-03-04 17:32"), 15, true);
            a[89] = new LightActions(sdf.parse("2019-03-04 17:32"), 16, true);
            a[90] = new LightActions(sdf.parse("2019-03-04 17:32"), 17, true);
            a[91] = new LightActions(sdf.parse("2019-03-04 17:32"), 18, true);
            a[92] = new LightActions(sdf.parse("2019-03-04 17:50"), 19, true);
            a[93] = new LightActions(sdf.parse("2019-03-04 17:50"), 20, true);
            a[94] = new LightActions(sdf.parse("2019-03-04 17:50"), 21, true);

             a[95] = new LightActions(sdf.parse("2019-03-05 07:44"), 11, false);
             a[96] = new LightActions(sdf.parse("2019-03-05 07:44"), 12, false);
             a[97] = new LightActions(sdf.parse("2019-03-05 07:44"), 13, false);
             a[98] = new LightActions(sdf.parse("2019-03-05 07:44"), 14, false);
             a[99] = new LightActions(sdf.parse("2019-03-05 07:44"), 15, false);
            a[100] = new LightActions(sdf.parse("2019-03-05 07:44"), 16, false);
            a[101] = new LightActions(sdf.parse("2019-03-05 07:44"), 17, false);
            a[102] = new LightActions(sdf.parse("2019-03-05 07:44"), 18, false);
            a[103] = new LightActions(sdf.parse("2019-03-05 07:40"), 19, false);
            a[104] = new LightActions(sdf.parse("2019-03-05 07:40"), 20, false);
            a[105] = new LightActions(sdf.parse("2019-03-05 07:40"), 21, false);

            a[106] = new LightActions(sdf.parse("2019-03-05 18:00"), 11, true);
            a[107] = new LightActions(sdf.parse("2019-03-05 18:00"), 12, true);
            a[108] = new LightActions(sdf.parse("2019-03-05 18:00"), 13, true);
            a[109] = new LightActions(sdf.parse("2019-03-05 18:00"), 14, true);
            a[110] = new LightActions(sdf.parse("2019-03-05 18:00"), 15, true);
            a[111] = new LightActions(sdf.parse("2019-03-05 18:00"), 16, true);
            a[112] = new LightActions(sdf.parse("2019-03-05 18:00"), 17, true);
            a[113] = new LightActions(sdf.parse("2019-03-05 18:00"), 18, true);
            a[114] = new LightActions(sdf.parse("2019-03-05 18:00"), 19, true);
            a[115] = new LightActions(sdf.parse("2019-03-05 18:00"), 20, true);
            a[116] = new LightActions(sdf.parse("2019-03-05 18:00"), 21, true);
            a[117] = new LightActions(sdf.parse("2019-03-05 18:06"), 22, true);

            a[118] = new LightActions(sdf.parse("2019-03-05 18:10"), 11, false);
            a[119] = new LightActions(sdf.parse("2019-03-05 18:10"), 12, false);
            a[120] = new LightActions(sdf.parse("2019-03-05 18:10"), 13, false);
            a[121] = new LightActions(sdf.parse("2019-03-05 18:10"), 14, false);
            a[122] = new LightActions(sdf.parse("2019-03-05 18:10"), 15, false);
            a[123] = new LightActions(sdf.parse("2019-03-05 18:10"), 16, false);
            a[124] = new LightActions(sdf.parse("2019-03-05 18:10"), 17, false);
            a[125] = new LightActions(sdf.parse("2019-03-05 18:10"), 18, false);
            a[126] = new LightActions(sdf.parse("2019-03-05 18:10"), 19, false);
            a[127] = new LightActions(sdf.parse("2019-03-05 18:10"), 20, false);
            a[128] = new LightActions(sdf.parse("2019-03-05 18:10"), 21, false);
            a[129] = new LightActions(sdf.parse("2019-03-05 18:08"), 22, false);

            a[130] = new LightActions(sdf.parse("2019-03-05 18:20"), 11, true);
            a[131] = new LightActions(sdf.parse("2019-03-05 18:20"), 12, true);
            a[132] = new LightActions(sdf.parse("2019-03-05 18:20"), 13, true);
            a[133] = new LightActions(sdf.parse("2019-03-05 18:20"), 14, true);
            a[134] = new LightActions(sdf.parse("2019-03-05 18:20"), 15, true);
            a[135] = new LightActions(sdf.parse("2019-03-05 18:20"), 16, true);
            a[136] = new LightActions(sdf.parse("2019-03-05 18:20"), 17, true);
            a[137] = new LightActions(sdf.parse("2019-03-05 18:20"), 18, true);
            a[138] = new LightActions(sdf.parse("2019-03-05 18:20"), 19, true);
            a[139] = new LightActions(sdf.parse("2019-03-05 18:20"), 20, true);
            a[140] = new LightActions(sdf.parse("2019-03-05 18:20"), 21, true);

            for (int i = 0; i <  141; i++)
            {
                session.save(a[i]);
                System.out.println(i);

            }
            tx.commit();
            session.close();
            sf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
