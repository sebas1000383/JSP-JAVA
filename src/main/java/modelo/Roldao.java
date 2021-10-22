package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.Conexion;

public class Roldao {
	// Define variables 
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	String sql;
	Conexion c= new Conexion();
	
	
	// Methods to perfom operations over database 
	public List Listarusuarios() throws SQLException {
	List<RolVo> Usuarios= new ArrayList<>();
	sql="SELECT * FROM  tbusuario";
	try {
		con=c.getConnection(); // opening the connection to database 
		ps=con.prepareStatement(sql); // prepare that sentence 
		ps.executeQuery(sql); // en sentencias select siempre va el executeQuery
		rs=ps.executeQuery();
		
		// y el execute update va a ser utilizado en sentencias  de insert,update y delete.
		
	while (rs.next()) {
		
		RolVo r = new RolVo();
		r.setIdusuario(rs.getInt("idusuario")); // se puede usar la posicion de la columna  o el nombre de la columna  que quremos obtener
		r.setNombreUsuario(rs.getString("NombreUsuario"));
		r.setApellidoUsuario(rs.getString("ApellidoUsuario")); 
		r.setContraseña(rs.getString("contraseña"));
		r.setCorreo(rs.getString("correo"));
	
		
		
		
		Usuarios.add(r);
		System.out.println("Consulta exitosa ");
		
		
	}
	ps.close();
		
		
	} catch (Exception e) {
		System.out.println("Consulta no exitosa "+e.getMessage());
		
	}
	finally {
		con.close();
	}
	return Usuarios;
		
	}
}
