package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.RolVo;
import modelo.Roldao;

/**
 * Servlet implementation class Rolcontroler
 */
@WebServlet("/Rolcontroler")
public class Rolcontroler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Roldao rdao= new Roldao();
	RolVo r =  new RolVo();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Rolcontroler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accion =request.getParameter("accion");
		System.out.print("Entro al controlador esta vez  ");
		
		try {
			if (accion!=null) {
				switch (accion) {
				case "Listarusuarios":
					System.out.println("Entro al metodo listar usuarios");
					
					
					Listarusuarios(request,response);
					
					break;
				case "Agregarusuarios":
					System.out.print("Entro a la opcion agregar usuarios");
					Agregarusuarios(request,response);
					break;
				case "Nuevousuario":
					Nuevousuario(request,response);
					

				default:
					response.sendRedirect("login.jsp");
					break;
				}
			}
			else {
				response.sendRedirect("login.jsp");
			}
			
		} catch (Exception e) {
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private  void Listarusuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			System.out.print("Entro al metodo listarusuarios ");
			
			
		
			 List rol =rdao.Listarusuarios();
			 request.setAttribute("usuarios", rol);// esto es para enviar los resultados de la busqueda
			
			 request.getRequestDispatcher("prueba.jsp") // esto es para especificar adonde quiero enviar los datos de una vista 
			.forward(request, response);
			
		} catch (Exception e) {
			
		}
		finally {
			}
		}
			
		
		private  void Agregarusuarios(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				 System.out.print(" Entro al metodo Registrar ");
			
			 request.getRequestDispatcher("Registrar.jsp") // esto es para especificar adonde quiero enviar los datos de una vista 
			.forward(request, response);
}
			 catch (Exception e) {
				
				 System.out.print(" no Entro al metodo Registrar ");
}
		}



private  void Nuevousuario (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	if (request.getParameter("nombre") !=null) {
		r.setNombreUsuario(request.getParameter("nombre"));
		System.out.println("LLego el nombre ");
		
		
	}
	System.out.println("No llego el nombre ");
	if (request.getParameter("correo") !=null) {
		r.setCorreo(request.getParameter("correo"));
		
	}
	if (request.getParameter("apellido") !=null) {
		r.setApellidoUsuario(request.getParameter("apellido"));
		
	}
	if (request.getParameter("contraseña") !=null) {
		r.setContraseña(request.getParameter("contraseña"));
		
		
	}
	
	try {
		 System.out.print(" Entro al metodo Registrar "+request.getParameter("nombre")+request.getParameter("correo")+request.getParameter("apellido")+request.getParameter("contraseña"));
		 
		 rdao.registrar(r);
		 
	
	 request.getRequestDispatcher("Registrar.jsp") // esto es para especificar adonde quiero enviar los datos de una vista 
	.forward(request, response);
}
	 catch (Exception e) {
		
		 System.out.print(" no Entro al metodo Registrar ");
		
}
}
}
