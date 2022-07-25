

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.classes.Utilisateur;

/**
 * Servlet implementation class MonServlet
 */
@WebServlet("/MonServlet")
public class MonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
	        
		 this.getServletContext().getRequestDispatcher("/Inscrire.jsp").forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		HttpSession session=request.getSession();
        List<Utilisateur> liste=(List<Utilisateur>)session.getAttribute("liste");
        if(liste==null){
            liste= new ArrayList<Utilisateur>();
        }
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String pseudo = request.getParameter("pseudo");
        String email = request.getParameter("email");
        String password = request.getParameter("mdp");
        String rpassword = request.getParameter("rmdp");
   

       /** PrintWriter writer = response.getWriter();
        writer.print("nom = " + nom + " password = " +password);*/
       
       if(password.equals(rpassword)){
           request.setAttribute("nom", nom);
           request.setAttribute("prenom", prenom);
           request.setAttribute("pseudo", pseudo);
           request.setAttribute("email", email);
            
            
            Utilisateur user = new Utilisateur(pseudo, nom, prenom, email, password);
            
            request.setAttribute("user", user);
            liste.add(user);
            request.setAttribute("liste", liste);
            
            session.setAttribute("liste", liste);
            request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
       }else{
            request.getRequestDispatcher("/Inscrire.jsp").forward(request, response);

       }
       
        
		

	}
}
