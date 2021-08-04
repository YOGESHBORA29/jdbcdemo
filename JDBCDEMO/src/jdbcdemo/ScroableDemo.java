package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScroableDemo {

	public static void main(String[] args) {
		Connection con =null;
		Statement stmt;
		ResultSet rs;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","123");
        stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rs=stmt.executeQuery("SELECT *from skills");
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+""+rs.getString(2));
        }
        System.out.println("*********************************************DISPLAY RESULT FROM BOTTON******************************");
        rs.afterLast();//curser to last
        
        while(rs.previous())
        {
        	System.out.println(rs.getInt(1)+""+rs.getString(2));
        }
        System.out.println("_________________________________Movie to 3 record__________________________________________________________________________________");
        rs.absolute(3);//movie the cercuir to 3
        System.out.println(rs.getInt(1)+""+rs.getString(2));
        
        System.out.println("_________________________________Movie to 2 record useing relative meathod____________________________________________________________");
        rs.relative(-1);//movie the curser to 2
        System.out.println(rs.getInt(1)+""+rs.getString(2));
con.close();
		}
          catch(Exception e )
{System.out.println(e);


	}
	}
	}

