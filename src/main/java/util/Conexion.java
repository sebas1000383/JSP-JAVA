package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	// attribute definition 
	private static final String bd="jdbc:mysql://localhost:3306/ejemplo";
	private static final String username="root";
	private static final String password="";
	private static  Connection con;
	// METHOD OF CONECCTION 
	public static  Connection conectar () {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection(bd, username, password); 
			 System.out.println("Conexi�n exitosa ");
			 
		} catch (Exception e) {
			System.out.println("Falla de conexi�n "+e.getMessage().toString());
		}
		return con;
	}
	
	
}


	   
