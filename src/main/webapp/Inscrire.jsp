<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire</title>
</head>
<body>
 <div align="center">
        <h1>Formulaire d'inscription</h1>
        <form action="MonServlet" method="post">
        <table align="center">
        <tr>
          <td><label>Nom :</label></td>
          <td><input type="text" id="nom" name="nom" required></td>
        </tr>
        <tr>
          <td><label>Prenom :</label></td>
          <td> <input type="text" id="prenom" name="prenom" required></td>
        </tr>
      
        <tr>
          <td><label>Email :</label></td>
          <td> <input type="email" id="email" name="email" required></td>

        </tr>
        
        <tr>
         <td><label>Pseudo :</label></td>
         <td><input type="text" id="pseudo" name="pseudo" required></td>
        </tr>
        
        <tr>
          <td><label>Mot de passe :</label></td>
         <td> <input type="password" id="mdp" name="mdp" required></td>
       
                
               
        
        </tr>
          <td><label>Repeter mot de passe :</label></td> 
         <td> <input type="password" id="rmdp" name="rmdp" required></td>      
        </tr>
        <tr>
        
         <td> <input type="submit" value="Valider"></td>
         <td><input type="reset"></td>
        </tr>
        </table>
           
          
            
         
           
            
            
        </form>
        </div>

</body>
</html>