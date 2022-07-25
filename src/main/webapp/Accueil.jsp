<%@page import="com.classes.Utilisateur"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
 
   <h1> Bienvenu  <%= request.getAttribute("nom") %> </h1>
        
       
        <table>
            <tr> 
                
                <th>NOM</th>
                <th>PRENOM</th>
                <th>PSEUDO</th>
                <th>EMAIL</th>
                   
            </tr>
            <%
            List<Utilisateur> users=(ArrayList<Utilisateur>) session.getAttribute("liste"); 
             for(Utilisateur user : users){
                 %>
            <tr>
            
                
                <td><%out.print(user.getNom());%></td>
                <td><%out.print(user.getPrenom());%></td>
                <td><%out.print(user.getEmail());%></td>
                <td><%out.print(user.getPseudo());%></td>
            
            </tr>
            <%} %>

        </table>
         <form action="MonServlet2" method="post">
        <input type="submit"  value="Déconnecter" >
        </form>
  
  
</body>
</html>