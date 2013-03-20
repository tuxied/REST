package home;
import java.sql.*;
public class Test {
    public static void main(String[] a) throws Exception {
        Class.forName("org.h2.Driver");
		ResultSet resultSet = null;
		Statement statement = null;
		Connection conn = null;
		
        try{
//	        conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");   
	        conn = DriverManager.getConnection("jdbc:h2:mem:", "sa", "");
	        statement = conn.createStatement();
	        
	        //test 1
//			resultSet = statement.executeQuery("SELECT EMPNAME FROM EMPLOYEEDETAILS");
//			while (resultSet.next()) {
//				System.out.println("EMPLOYEE NAME:"
//						+ resultSet.getString("EMPNAME"));
//			}
	        
	        //test 2
	        statement.execute("create table test(id int primary key, name varchar(255))");
	        statement.execute("insert into test values(1, 'Hello')");
	        ResultSet rs;
	        rs = statement.executeQuery("select * from test");
	        while (rs.next()) {
	            System.out.println(rs.getString("name"));
	        }		
	        
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}
        