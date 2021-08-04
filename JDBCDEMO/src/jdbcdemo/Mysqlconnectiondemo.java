package jdbcdemo;
import java.sql.*;
public class Mysqlconnectiondemo {

	public static void main(String[] args) throws SQLException {
		Connection con;
		Statement stmt;
		ResultSet rs;
		//Load and Register the Driver
		try
		{Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Creat connection get connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","123");
		//creat statment object
		stmt=con.createStatement();
		
		//Execute and store resultset
		rs=stmt.executeQuery("select*from employees");
		//Traverse the result statment
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+""+rs.getString(3)+""+rs.getString("email")+rs.getString(8));
		}
		/*System.out.println("Display the specific record");
		rs.absolute(3);
		con.close();*/
	
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		

	}

}
