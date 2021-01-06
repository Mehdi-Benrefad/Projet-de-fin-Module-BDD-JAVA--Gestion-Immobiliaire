package ConnectionB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connected 
{
	
	public static Connection ConnexionMethode() throws Exception
	{
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		 String connectionUrl = "jdbc:sqlserver://HP-PC;database=GestionImmobiliére;integratedSecurity=true;";
	     Connection conn = DriverManager.getConnection(connectionUrl);
	   	 return conn;
	}
	

}
