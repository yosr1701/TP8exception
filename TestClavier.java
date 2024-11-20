package TP8;

public class TestClavier {

	public static void main(String[] args) {
		//chaine  
		 System.out.println("Saisir une chaîne : ");
	     String chaine = Clavier.lireChaine();
	     System.out.println("Chaine saisi : " + chaine);
	     
	     
	    //float 
	     System.out.println("Saisir un float : ");
	     float flot = Clavier.lireFloat();
	     System.out.println("le nombre = " + flot);  
	   
	     //double
	     System.out.println("Saisir un double : ");
	     double doubl = Clavier.lireDouble();
	     System.out.println("le nombre = " + doubl);
	     
	     //entiier 
	     System.out.println("Saisir un entier : ");
	     int entier = Clavier.lireEntier();
	     System.out.println("l'entier = " + entier);
	}

}
