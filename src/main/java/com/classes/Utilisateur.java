package com.classes;

public class Utilisateur {

	
   private String nom ;
   private String prenom ;
   private String email ;
   private String pseudo ;
   private String password ;
   private String rpassword ;
   
   
public Utilisateur() {
	super();
}


public Utilisateur(String nom, String prenom, String email, String pseudo, String password) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.pseudo = pseudo;
	this.password = password;

}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getPseudo() {
	return pseudo;
}


public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}








   
   
}
