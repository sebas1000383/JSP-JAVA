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
		try {
			if (accion!=null) {
				switch (accion) {
				case "Listarusuarios":
					Listarusuarios(request,response);
					
					break;

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
		Roldao rdao= new Roldao();
		RolVo r =  new RolVo();
		try {
			 List rol =rdao.Listarusuarios();
			 request.setAttribute("usuarios", rol);// esto es para enviar los resultados de la busqueda 
			 request.getRequestDispatcher("views/Rol.jsp"); // esto es para especificar adonde quiero enviar los datos de una vista 
			
			
		} catch (Exception e) {
			
		}
		finally {
			
		}
}
}
