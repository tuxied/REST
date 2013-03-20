//package home;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//public class HibernateUtil {
// 
//    private static final SessionFactory sessionFactory;
// 
////    static {
////        try {
////            // Create the SessionFactory from hibernate.cfg.xml
////            sessionFactory = new Configuration().configure().buildSessionFactory();
////        } catch (Throwable ex) {
////            // Make sure you log the exception, as it might be swallowed
////            System.err.println("Initial SessionFactory creation failed." + ex);
////            throw new ExceptionInInitializerError(ex);
////        }
////    }
// static {
//    // A SessionFactory is set up once for an application
//    sessionFactory = new Configuration()
//            .configure() // configures settings from hibernate.cfg.xml
//            .buildSessionFactory();
// }
// 
// 
// 
// 
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
// 
//}