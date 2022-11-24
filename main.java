package HotelCalifornia;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		System.out.println("Bienvenue au centre de gestion de l'hotel California");
		System.out.println("Combien etes vous?");
		
		
		Scanner scann = new Scanner (System.in);
		int cato = scann.nextInt();		Personne.personne();
		System.out.println("Saisissez la catégorie( 1; 2; 3; 4; 5; 6)");
		int cat = scann.nextInt();
		System.out.println("vous etes " + cat);

		}
	
	

	
	

}
