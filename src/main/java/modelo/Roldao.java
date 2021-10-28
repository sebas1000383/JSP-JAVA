package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

import util.Conexion;

public class Roldao {
	// Define variables 
	Connection con;
	ResultSet rs;
	PreparedStatement ps;
	String sql;
	Conexion c= new Conexion();
	int register;
	int id;
	
	
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
		r.setIdusuario(rs.getInt("idusario")); // se puede usar la posicion de la columna  o el nombre de la columna  que quremos obtener
		r.setNombreUsuario(rs.getString("NombreUsuario"));
		r.setApellidoUsuario(rs.getString("ApellidoUsuario")); 
		r.setContraseña(rs.getString("contraseña"));
		r.setCorreo(rs.getString("correo"));
		System.out.println("Se hizo la consulta ");
		
		
		
		Usuarios.add(r);
		
	
		
		
	}

		
		
	} catch (Exception e) {
		System.out.println("Consulta no exitosa "+e.getMessage());
		ps.close();
		
	}
	finally {
		
	}
	
	return Usuarios;
		
	}
	public int eliminar(int id) throws SQLException {
		System.out.println("Entro a la sentencia preparada  ");
		sql="delete from tbusuario WHERE  idusario="+id;
		try {
			con=c.getConnection(); // opening the connection to database 
			ps=con.prepareStatement(sql); // prepare that sentence 
		
			System.out.println(ps);
			
				
				
			
			
		
			
			
			
			
			ps.executeUpdate(sql); // en sentencias select siempre va el executeQuery 
			System.out.print("Ya hizo la consulta  ");
			// Solo las consultas se guardan en un resulset 
			System.out.println("Entro a la consulta  ");
			
			// y el execute update va a ser utilizado en sentencias  de insert,update y delete.                                                                                      
		// El siguiente paso es asignar los valores de este interrogante 
	
		System.out.println("Se elimino  un usuario ");
	
			
		
		} 
		catch (Exception e) {
			System.out.print("Error al eliminar usuario ");
		}
		return id;
			// TODO: handle exception
		}	


	

	
	
	
	
		
		public int  registrar(RolVo r) throws SQLException {
			System.out.println("Entro a la sentencia preparada  ");
			sql="INSERT INTO tbusuario(NombreUsuario,ApellidoUsuario,correo,contraseña) VALUES (?,?,?,?)";
			try {
				con=c.getConnection(); // opening the connection to database 
				ps=con.prepareStatement(sql); // prepare that sentence 
				
			    ps.setString(1, r.getNombreUsuario());
				ps.setString(2, r.getApellidoUsuario());
				ps.setString(3, r.getCorreo());
				ps.setString(4, r.getContraseña());
				System.out.println(ps);
				if (ps.executeUpdate()==1) {
					System.out.print("Se afecto el nombre");
					
					
					
				}
				
			
				
				
				
				
				ps.executeUpdate(sql); // en sentencias select siempre va el executeQuery 
				System.out.print("Ya hizo la consulta  ");
				// Solo las consultas se guardan en un resulset 
				System.out.println("Entro a la consulta  ");
				
				// y el execute update va a ser utilizado en sentencias  de insert,update y delete.                                                                                      
			// El siguiente paso es asignar los valores de este interrogante 
		
			System.out.println("Se registro un usuario ");
		
				
				
			} 
			                        
			
		                        
		
		
		catch (Exception e) {     
			System.out.println("Error al registrar usuario "+e.getMessage());
			ps.close();
			
			
		}
		finally {
			
			
		}

		
		return register;
			
		
	}
	

		}

