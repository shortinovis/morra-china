import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner t=new Scanner(System.in);
		String giocatore1;
		String giocatore2;
		String scielta1;
		String scielta2;
		System.out.println("dimmi nome del primo giocatore");
		giocatore1 = t.nextLine();
		System.out.println("dimmi nome del secondo giocatore");
		giocatore2 = t.nextLine();
		System.out.println("che mossa scegli " + giocatore1 +"?");
		scielta1 = t.nextLine();
		if(!scielta1.equalsIgnoreCase ("carta") && !scielta1.equalsIgnoreCase ("forbice") && !scielta1.equalsIgnoreCase ("sasso")){
		    	System.out.println("devi mettere sasso,carta o forbice");
		}
		System.out.println("che mossa scegli " + giocatore2 +"?");
		scielta2 = t.nextLine();
		if(!scielta1.equalsIgnoreCase ("carta") && !scielta1.equalsIgnoreCase ("forbice") && !scielta1.equalsIgnoreCase ("sasso")){
		    	System.out.println("devi mettere sasso,carta o forbice");
		}
		if(scielta1.equalsIgnoreCase ("forbice") && scielta2.equalsIgnoreCase ("carta")){
		    System.out.println("vince " + giocatore1);
		}else if(scielta1.equalsIgnoreCase("carta") && scielta2.equalsIgnoreCase ("forbice")){
		    System.out.println("vince " + giocatore2);
		}else if(scielta1.equalsIgnoreCase ("forbice") && scielta2.equalsIgnoreCase ("sasso")){
		    System.out.println("vince " + giocatore2);
		}else if(scielta1.equalsIgnoreCase ("sasso") && scielta2.equalsIgnoreCase ("forbice")){
		    System.out.println("vince " + giocatore1);
		}else if(scielta1.equalsIgnoreCase ("sasso") && scielta2.equalsIgnoreCase ("carta")){
		    System.out.println("vince " + giocatore2);
		}else if(scielta1.equalsIgnoreCase ("carta") && scielta2.equalsIgnoreCase ("sasso")){
		    System.out.println("vince " + giocatore1);
		}else if(scielta1.equalsIgnoreCase ("sasso") && scielta2.equalsIgnoreCase ("sasso")){
		    System.out.println("pareggio");
		}else if(scielta1.equalsIgnoreCase ("carta") && scielta2.equalsIgnoreCase ("carta")){
		    System.out.println("pareggio");
		}else if(scielta1.equalsIgnoreCase ("forbice") && scielta2.equalsIgnoreCase ("forbice")){
		    System.out.println("pareggio");
		}
	
	}
}
