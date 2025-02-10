import java.sql.*;
public class InsertQuery {
	public static void main(String args[]) {
		try {
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create a connection
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "aastha";
			
			Connection connect = DriverManager.getConnection(url, username, password);
			
			String query = "create table table1(tId int(20) primary key, tName varchar(20) not null, tCity varchar(40))";
			
			Statement statement = connect.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table Created");
			connect.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
