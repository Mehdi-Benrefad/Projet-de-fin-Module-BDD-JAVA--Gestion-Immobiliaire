package methodes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import ConnectionB.Connected;

public class test {

	public static void main(String[] args) throws Exception 
   {

		Connection conn=Connected.ConnexionMethode();
		CallableStatement cstmt = conn.prepareCall("{call dbo.ModifierMaison(?,?,?,?,?,?,?,?,?,?)}") ;
		cstmt.setDouble(1, 150000);
		cstmt.setInt(2, 50);
		cstmt.setString(3, "smaala pool");
		cstmt.setInt(4, 2);
		cstmt.setInt(5, 2);
		cstmt.setInt(6, 2);
		cstmt.setInt(7, 2);
		cstmt.setInt(8, 2);
		cstmt.setString(9, "SETTAT");
		cstmt.setInt(10, 2);
        cstmt.executeUpdate();
				
	}
	
}
	 