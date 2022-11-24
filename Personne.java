package HotelCalifornia;

import java.util.Scanner;

public class Personne {
	
	
	
public static void personne(){
	
	Scanner sc = new Scanner (System.in);

	int personne = sc.nextInt(); {	
//	Condition nombre de personne
	
	if(personne == 1) {
		System.out.println("Vous etes 1");
	}
	
	else if(personne == 2) {
		System.out.println("Vous etes 2");
	}
	
	else if(personne == 3) {
		System.out.println("Vous etes 3");
	}
	
	else if(personne == 4) {
		System.out.println("Vous etes 4");
		
	}
	
	else {
		System.out.println("Désolé, les chambres peuvent recevoir de 1 à 4 personnes");
		Categorie.categorie();
}

	}
}

}