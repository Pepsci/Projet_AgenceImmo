package controllers;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BienDao;
import model.Bien;

/**
 * Servlet implementation class Formajoutbien
 */
@WebServlet("/formajoutbien")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024
* 5, maxRequestSize = 1024 * 1024 * 5 * 5)
public class Formajoutbien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formajoutbien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/admin/formBien.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException, NumberFormatException {
		
		try {
			Bien bien = new Bien();
			
			bien.setTypeDeBien(request.getParameter("typeDeBien"));
			bien.setStatut(request.getParameter("statut"));
			bien.setAdresse(request.getParameter("adresse"));
			bien.setPrix(Float.parseFloat(request.getParameter("prix")));
			bien.setSurface(Float.parseFloat(request.getParameter("surface")));
			bien.setNbrPiece(Integer.parseInt(request.getParameter("nbrPiece")));
			
			
			BienDao biendao = new BienDao();
			System.out.println("prix");
			if (biendao.create(bien)) {
				request.setAttribute("bien", "Bien ajouté");
				
				request.getRequestDispatcher("/admin/formBien.jsp").forward(request, response);
			}else {
				request.setAttribute("bien", "Oups, erreur lors de l'ajout");
			}
		} catch (NumberFormatException exception ) {
}
		

		
		request.getRequestDispatcher("/admin/formBien.jsp").forward(request, response);
		
	}

}
