package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TestDao;

/**
 * Servlet implementation class AppartementLocation
 */
@WebServlet("/appartementlocation")
public class AppartementLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AppartementLocation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TestDao dao = new TestDao();
		request.setAttribute("listappartementlocation", dao.readbyappartementlocation());
		request.getRequestDispatcher("/menu/appartementLocation.jsp").forward(request, response);
	}

}

