package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
	  private static final String USERNAME="root";
	    private static final String PASSWORD="";
	    private static final String HOST="localhost";
	    private static final String PORT="3306";
	    private static final String DATABASE="prueba";
	    private static final String CLASSNAME="com.mysql.cj.jdbc.Driver";
	    private static final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
	    private Connection con;
	    public Conexion()
	    {
	        try 
	        {
	          Class.forName(CLASSNAME);
	          con=DriverManager.getConnection(URL, USERNAME, PASSWORD);         
	        } 
	        catch (ClassNotFoundException e) 
	        {       
	            System.err.println("ERROR"+e);
	        }
	        catch(SQLException e)
	        {
	            System.err.println("ERROR"+e);
	        }
	    }
	    public Connection getConnection()
	    {
	        return con;
	    }
	    
	   
	
}


	   
