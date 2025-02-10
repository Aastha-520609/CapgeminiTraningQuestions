import java.sql.*;
public class PracticeConnection {
	public static void main(String args[]) {
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create a connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "aastha";
			
			Connection connect = DriverManager.getConnection(url, username, password);
			
			if(connect.isClosed()) {
				System.out.println("Connection is closed");
			}else {
				System.out.println("Connection Created");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
