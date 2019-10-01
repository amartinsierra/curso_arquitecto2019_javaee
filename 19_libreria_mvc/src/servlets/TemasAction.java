package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factories.FactoryDao;
import modelo.DaoTemas;
import modelo.DaoTemasImpl;


/**
 * Servlet implementation class TemasAction
 */
@WebServlet("/TemasAction")
public class TemasAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoTemas gtemas=FactoryDao.getDaoTemas();
		request.setAttribute("temas", gtemas.obtenerTemas());
		
	}

}
