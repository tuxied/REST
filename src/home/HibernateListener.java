//package home;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//
//
//
//public class HibernateListener implements ServletContextListener {
// 
//    private EntityManagerFactory entityManagerFactory;
//
//	public void contextInitialized(ServletContextEvent event) {
////        HibernateUtil.getSessionFactory(); // Just call the static initializer of that class
//        entityManagerFactory = Persistence.createEntityManagerFactory("JSFCrudPU");
//        System.out.println("contextInitialized");
//    }
// 
//    public void contextDestroyed(ServletContextEvent event) {
////        HibernateUtil.getSessionFactory().close(); // Free all resources
//        entityManagerFactory.close();
//        System.out.println("contextDestroyed");
//    }
//}