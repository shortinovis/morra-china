import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args) {
	    Scanner t=new Scanner(System.in);
	    Random n=new Random();
		String giocatore1;
		int giocatore2=n.nextInt(3);
		String scelta1;
		String scelta2="";
		System.out.println("dimmi nome giocatore");
		giocatore1 = t.nextLine();
		System.out.println("dimmi mossa del giocatore");
		scelta1 = t.nextLine();
		if(!scelta1.equalsIgnoreCase ("carta") && !scelta1.equalsIgnoreCase ("forbice") && !scelta1.equalsIgnoreCase ("sasso")){
		    	System.out.println("devi mettere sasso,carta o forbice");
		}
		switch (giocatore2){
		    case 0:
		        scelta2 = "sasso";
		        break;
		    case 1:
		        scelta2 = "carta";
		        break;
		    case 2:
		        scelta2 = "forbice";
		        break;
		}
		if(scelta1.equalsIgnoreCase ("forbice") && scelta2.equalsIgnoreCase ("carta")){
		    System.out.println("vince " + giocatore1);
		}else if(scelta1.equalsIgnoreCase("carta") && scelta2.equalsIgnoreCase ("forbice")){
		    System.out.println("vince computer");
		}else if(scelta1.equalsIgnoreCase ("forbice") && scelta2.equalsIgnoreCase ("sasso")){
		    System.out.println("vince computer");
		}else if(scelta1.equalsIgnoreCase ("sasso") && scelta2.equalsIgnoreCase ("forbice")){
		    System.out.println("vince " + giocatore1);
		}else if(scelta1.equalsIgnoreCase ("sasso") && scelta2.equalsIgnoreCase ("carta")){
		    System.out.println("vince computer");
		}else if(scelta1.equalsIgnoreCase ("carta") && scelta2.equalsIgnoreCase ("sasso")){
		    System.out.println("vince " + giocatore1);
		}else if(scelta1.equalsIgnoreCase ("sasso") && scelta2.equalsIgnoreCase ("sasso")){
		    System.out.println("pareggio");
		}else if(scelta1.equalsIgnoreCase ("carta") && scelta2.equalsIgnoreCase ("carta")){
		    System.out.println("pareggio");
		}else if(scelta1.equalsIgnoreCase ("forbice") && scelta2.equalsIgnoreCase ("forbice")){
		    System.out.println("pareggio");
		}
	
	}
}
