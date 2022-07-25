<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
  <div align="center">
  <h1>Authentification</h1>

  <form action="MonServlet2" method="post">
  <table>
  <tr>
  <td>Pseudo :</td>
  <td><input type="text" name ="pseudo" required></td>
  </tr>
  
  <tr><td>Mot de passe :</td>
   <td><input type="password" name ="mdp" required></td>
  </tr>
  <tr> <td><input type="submit" value="Se connecter"  required></td>
  <td><input type="reset"></td>
  </tr>

  </table>
  
  </form>
    </div>
</body>
</html>