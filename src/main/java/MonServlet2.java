

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MonServlet2
 */
public class MonServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String pseudo = request.getParameter("pseudo");
	     String password = request.getParameter("password");
	        
	        if(pseudo==null){
	            request.getRequestDispatcher("/login.jsp").forward(request, response);
	        }
	        else{
	            request.setAttribute("nom", pseudo);
	         
	         request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
	        }
		
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Recupération  de requette
//			String pseudo = request.getParameter("pseudo");
//			String mdp    = request.getParameter("password");
//			String rmdp    = request.getParameter("rpassword");
			
			//La condition pour verifier le mot de passe
			
				
		this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}

}
