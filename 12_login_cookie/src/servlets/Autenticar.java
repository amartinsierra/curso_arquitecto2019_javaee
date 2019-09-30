package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Persona;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {
			//crear objeto Persona y guardarlo como atributo de sesión
			Persona persona=new Persona(user,"prueba@gmail.com",44);
			HttpSession sesion=request.getSession();
			sesion.setAttribute("persona", persona);
			//creación de la cookie
			generarCookie(response, user);
			rd=request.getRequestDispatcher("preferencias.html");
			rd.forward(request, response);
		}else {
			//rd=request.getRequestDispatcher("Error");
			response.sendRedirect("error.jsp?user="+user+"&pwd="+pwd);
		}	
	}

	private void generarCookie(HttpServletResponse response,String user) {
		Cookie ck=new Cookie("usuario",user);
		ck.setMaxAge(1000000);
		response.addCookie(ck);
	}
	
}
