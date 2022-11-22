package HotelCalifornia;

import java.util.Scanner;

public class Categorie {

	public static void categorie () {
		Scanner scan = new Scanner (System.in);
		
		int nb;
		 
	       System.out.println("Saisissez 1 pour une chambre avec un lavabo");
	       System.out.println("Saisissez 2 pour une chambre avec wc + lavabo");
	       System.out.println("Saisissez 3 pour une chambre avec Cabine Douche + télévision");
	       System.out.println("Saisissez 4 pour une chambre avec wc + Cabine Douche + Télévision");
	       System.out.println("Saisissez 5 pour une chambre avec wc + salle de bain + douche + télévision");
	       System.out.println("Saisissez 6 pour une chambre avec 2 pièces, salle de bain + douche + télévision");
	       System.out.print("Saisissez votre catégorie : ");
	       nb = scan.nextInt();
	       
	  
	 
	        if(nb == 1){
	            System.out.println("La chambre contien un lavabo");
	        }
	        
	        else if (nb == 2) {
	        	System.out.println("La chambre contient WC + télévision");
	        }
	        
	        else if (nb == 3) {
	        	System.out.println("La chambre contient Cabine Douche + télévision");
	        }
	        
	        else if (nb == 4) {
	        	System.out.println("La chambre contient WC + Cabine Douche + Télévision");
	        }
	        
	        else if (nb == 5) {
	        	System.out.println("La chambre contient WC + Salle de bain + douche + Télévision");
	        }
	        
	        else if (nb == 6) {
	        	System.out.println("La chambre contient 2 pièces, Salle de bain + douche + télévision");
	        	
	        }
	        
	        else  {
	        	System.out.println("Désolé, cette catégorie n'existe pas");
	        	categorie();
	        }
	 
	}
}

