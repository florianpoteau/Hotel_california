package HotelCalifornia;

import java.util.Scanner;

//Constructor


public class Categorie {
	
	String lavabo;
	String wc;
	String télévision;
	String douche;
	String bain;
	String deuxpièces;
	
	public Categorie (String lavabo, String wc, String télévision, String douche, String bain, String deuxpièces){
		
		this.lavabo = lavabo;
		this.wc = wc;
		this.télévision = télévision;
		this.douche = douche;
		this.bain = bain;
		this.deuxpièces = deuxpièces;
		
	}
	
	public static void categorie() {
		Categorie categorie = new Categorie(" Un lavabo"," wc"," une télévision"," une cabine douche"," Une salle de bain"," 2 pièces");
		
		Scanner scanner = new Scanner (System.in);
		
		int nb = scanner.nextInt();
		
		if(nb == 1){
            System.out.println("La chambre contien" + categorie.lavabo  );
        }
        
        else if (nb == 2) {
        	System.out.println("La chambre contient" + categorie.wc + categorie.télévision);
        }
        
        else if (nb == 3) {
        	System.out.println("La chambre contient" + categorie.douche + categorie.télévision);
        }
        
        else if (nb == 4) {
        	System.out.println("La chambre contient" +categorie.wc +categorie.douche +categorie.télévision);
        }
        
        else if (nb == 5) {
        	System.out.println("La chambre contient" +categorie.wc +categorie.bain +categorie.douche + categorie.télévision);
        }
        
        else if (nb == 6) {
        	System.out.println("La chambre contient" +categorie.deuxpièces + categorie.bain + categorie.douche + categorie.wc +categorie.télévision);
        	
        }
        
        else  {
        	System.out.println("Désolé, cette catégorie n'existe pas");
        	categorie();
        }
		
		
		
	}
	

}
