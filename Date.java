package TP8;
import java.util.Scanner;
public class Date {

	 private int jour;
	    private int mois;
	    private int an;
	    public Date() {
	    	Scanner s=new Scanner(System.in);
	    	int j=s.nextInt();
	    	int m=s.nextInt();
	    	int a=s.nextInt();
	    	try {
	         if (j < 1|| j >31) throw new Jour("jourincorrect");
	         if (m < 1 || m>12)  throw new Mois("mois incorrect");
	         jour=j;  mois=m;   an=a;
	         System.out.println(jour +  "/"+mois+"/"+an);
	        		
	         }
	         catch(Jour e)
	    		{
	        	 System.out.println(e.ch);
	        	 }
	         catch( Mois e)
	        	    {
	        	     System.out.println(e.ch);
	        	    }
	    }
}
