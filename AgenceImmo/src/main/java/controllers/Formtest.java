package controllers;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.jboss.logging.Logger;

import dao.TestDao;
import model.Test;


/**
 * Servlet implementation class Formtest
 */
@WebServlet("/formtest")
@MultipartConfig( fileSizeThreshold = 1024 * 1024, 
maxFileSize = 1024 * 1024 * 5,
maxRequestSize = 1024 * 1024 * 5 * 5 )
public class Formtest extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_FILENAME = "default.jpg";
	private static final String UPLOAD_DIRECTORY = "assets/images/";
	
	static Logger log = Logger.getLogger(Formtest.class);
    
  public Formtest() {
	  super();
  }
  
  public String uploadPath;
  public void init() throws ServletException {
      uploadPath = getServletContext().getRealPath( UPLOAD_DIRECTORY );
      File uploadDir = new File( uploadPath );
      if ( ! uploadDir.exists() ) uploadDir.mkdir();
  }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/admin/test.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	try {
		Test test = new Test();
		
		test.setTypebien(request.getParameter("typebien"));
		test.setAdresse(request.getParameter("adresse"));
		test.setStatus(request.getParameter("status"));
		test.setPrix(Double.valueOf(request.getParameter("prix")));
		test.setSurface(Double.valueOf(request.getParameter("surface")));
		test.setNbrpiece(Integer.parseInt(request.getParameter("nbrpiece")));
		test.setImgcouv(uploadImage(request));

		
		TestDao tDao = new TestDao();

		if (tDao.create(test)) {
			request.setAttribute("success", "Produit ajouté à la base de données avec success");
		}
		request.setAttribute("produit", test);
		request.getRequestDispatcher("/admin/test.jsp").forward(request, response);
	} catch (NumberFormatException | IOException | ServletException ex) {
		ex.printStackTrace();
		request.setAttribute("error", ex.getMessage());
	}

	}
	
	private String uploadImage(HttpServletRequest request) throws IOException, ServletException {
		String uploadPath = getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;
		File uploadDir = new File(uploadPath);

		if (!uploadDir.exists())
			uploadDir.mkdir();

		Part part = request.getPart("imgcouv");
		String fileName = getFileName(part);

		if (fileName != null && !fileName.isEmpty()) {
			part.write(uploadPath + File.separator + fileName);
		}

		return UPLOAD_DIRECTORY + fileName;
	}

	private String getFileName(Part part) {
		for (String content : part.getHeader("content-disposition").split(";")) {
			if (content.trim().startsWith("filename"))
				return content.substring(content.indexOf("=") + 2, content.length() - 1);
		}
		return DEFAULT_FILENAME;
	}

}











