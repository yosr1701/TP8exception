package TP8;

import java.io.*;

public class Clavier {
	//1 chaine 
	public static String lireChaine() {
		String ligne_lue=null;
	try 
		{
			InputStreamReader lecteur=new InputStreamReader(System.in);
			BufferedReader entree=new BufferedReader(lecteur);
			ligne_lue=entree.readLine();
		}
	catch (IOException err)
	{ System.out.println("***Erreur de données ***"); }
	return ligne_lue;
	}
	//2 float
	public static float lireFloat() {
	float x=0; 
	try
	{
		String ligne_lue=lireChaine();
		x=Float.parseFloat(ligne_lue);
	}
	catch (NumberFormatException err)
	{ System.out.println("***Erreur de données, Réel attendu***"); }
	return x;
	}
	//3 double 
	public static double lireDouble() {
	double x=0;
	try {
	String ligne_lue=lireChaine();
	x=Double.parseDouble(ligne_lue);
	}
	catch (NumberFormatException err)
	{ System.out.println("***Erreur de données, Double attendu***"); }
	return x;
	}
	//4 FLOAT 
	public static int lireEntier() {
	int x=0;
	try 
		{
		String ligne_lue=lireChaine();
		x=Integer.parseInt(ligne_lue);
		}
	catch(NumberFormatException err)
		{ System.out.println("***Erreur de données, Entier attendu***"); }
	return x;
	}
}