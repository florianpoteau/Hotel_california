package HotelCalifornia;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Bienvenue au centre de gestion de l'hotel California");
		System.out.println("Combien etes vous?");
		
		Categorie categorie = new Categorie();
		Scanner scan = new Scanner (System.in);
		
		TestCategorie testCategorie = new TestCategorie(1,2,3,4,5,6);
		
		
	
		int nb = scan.nextInt();
		
		if(nb == 1) {
			System.out.println("Vous etes 1");
			Categorie.categorie();
		}
		
		else if(nb == 2) {
			System.out.println("Vous etes 2");
			Categorie.categorie();
		}
		
		else if(nb == 3) {
			System.out.println("Vous etes 3");
			Categorie.categorie();
		}
		
		else if(nb == 4) {
			System.out.println("Vous etes 4");
			Categorie.categorie();
			
		}
		
		else {
			System.out.println("Désolé, les chambre peuvent recevoir de 1 à 4 personnes");
			Categorie.categorie();

	}
	}

}
