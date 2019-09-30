package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlFinal="entrada.html";
		String op=request.getParameter("op");
		switch(op) {
			case "doContactos":
				urlFinal=obtenerUrl(request,response);
				break;
			case "doAlta":
				request.getRequestDispatcher("AltaAction").include(request,response);
				urlFinal="entrada.html";
				break;
			case "doEliminar":
				request.getRequestDispatcher("EliminarAction").include(request,response);
				urlFinal=obtenerUrl(request,response);
				break;
			case "toDatos":
				urlFinal="datos.html";
				break;
			case "toEntrada":
				urlFinal="entrada.html";
				break;			
		}
		//transferimos la petición a la vista
		request.getRequestDispatcher(urlFinal).forward(request,response);
	}
	private String obtenerUrl(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ContactosAction").include(request,response);
		return ((Integer)request.getAttribute("resultado"))==1?"contactos.jsp":"sincontactos.jsp";
	}
}
