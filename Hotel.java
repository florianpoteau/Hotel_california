package HotelCalifornia;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
		
		System.out.println("Bienvenue au centre de gestion de l'hotel California");
		System.out.println("Combien etes vous?");

		Scanner scan = new Scanner (System.in);
		
		
		
		
	
		int nb = scan.nextInt();
		
		
//		Condition nombre de personne
		
		
		if(nb == 1) {
			System.out.println("Vous etes 1");
			categorie();
		}
		
		else if(nb == 2) {
			System.out.println("Vous etes 2");
			categorie();
		}
		
		else if(nb == 3) {
			System.out.println("Vous etes 3");
			categorie();
		}
		
		else if(nb == 4) {
			System.out.println("Vous etes 4");
			categorie();
			
		}
		
		else {
			System.out.println("Désolé, les chambre peuvent recevoir de 1 à 4 personnes");
			categorie();

	}
		
	}
	
//	Categorie
	
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
	       
//	       constructor (class TestCategorie.java)
	       
	       
	       TestCategorie testCategorie = new TestCategorie(" Un lavabo"," wc"," une télévision"," une cabine douche"," Une salle de bain"," 2 pièces");
	 
	       
//	       Condition numéro de catégorie
	       
	       
	        if(nb == 1){
	            System.out.println("La chambre contien" + testCategorie.lavabo );
	        }
	        
	        else if (nb == 2) {
	        	System.out.println("La chambre contient" + testCategorie.wc + testCategorie.télévision);
	        }
	        
	        else if (nb == 3) {
	        	System.out.println("La chambre contient" + testCategorie.douche + testCategorie.télévision);
	        }
	        
	        else if (nb == 4) {
	        	System.out.println("La chambre contient" +testCategorie.wc +testCategorie.douche +testCategorie.télévision);
	        }
	        
	        else if (nb == 5) {
	        	System.out.println("La chambre contient" +testCategorie.wc +testCategorie.bain +testCategorie.douche + testCategorie.télévision);
	        }
	        
	        else if (nb == 6) {
	        	System.out.println("La chambre contient" +testCategorie.deuxpièces + testCategorie.bain + testCategorie.douche + testCategorie.wc +testCategorie.télévision);
	        	
	        }
	        
	        else  {
	        	System.out.println("Désolé, cette catégorie n'existe pas");
	        	categorie();
	        }
	 
	}

}
