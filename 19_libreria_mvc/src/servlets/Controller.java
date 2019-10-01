package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("op");
		String url="login.jsp";
                switch(op){
                    case "doLogin":
                    	request.getRequestDispatcher("LoginAction").include(request, response);
                        url=(Boolean)request.getAttribute("resultado")?"temas.jsp":"login.jsp"; 
                        break;
                    case "doRegistro":
                    	request.getRequestDispatcher("RegistroAction").include(request, response);
                        url="login.jsp";
                        break; 
                    case "doTemas":                  	
                    	request.getRequestDispatcher("TemasAction").include(request, response);
                        url="temas.jsp"; 
                        break;
                    case "doLibros":
                    	request.getRequestDispatcher("LibrosAction").include(request, response);
                        url="libros.jsp";
                        break;
                    case "toRegistro":
                        url="registro.html";
                        break; 
                    
                    
                }
		
                request.getRequestDispatcher(url).forward(request, response);
	}

}
