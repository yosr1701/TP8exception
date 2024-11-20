package TP8;

class Factorielle{

	public static void main (String[] args)
	{
		int i, nbEntiers=0, factorielle=1; 
		int ancien; 
		try {
		nbEntiers= Integer.parseInt(args[0]);
		if (nbEntiers<0) throw  new negative ();  
		
		for (i=2;i<= nbEntiers;i++)
		{
		ancien=factorielle; 
		factorielle *= i;
		}
		System.out.println(" Voila la factorielle des "+ nbEntiers +
		" premiers entiers : "+ factorielle );
		}
		
		catch(NumberFormatException e)
		{
		System.out.println("**erreur : données doit etre entier !");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("**erreur : vide!");
		}
		catch(negative e)
		{
			e.verif();
		}
	}
}
