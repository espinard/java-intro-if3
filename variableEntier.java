public class Interface3{

     public static void main(String []args){
        

         
        String messageBienvenue = "Bienvenue" ;
		String nomRestaurant = "Sel et Miel"; 
		
        System.out.println(messageBienvenue + " chez " + nomRestaurant); 
        
        /**
         * Objectif: 
         * 
         * 1. déclarer variable (entier): nombre de personnes. Valeur: au choix 
         * 2. déclarer variable prix d'une crêpe.(entier). Nom au choix 
         * 3. afficher le prix de total : nombre de personnes x le prix unitairr
         */ 
        
        
        int nbPersonnes = 2; 
        int prixUnitaireCrepe = 10;
        
        int prixTotal = nbPersonnes * prixUnitaireCrepe; 
        System.out.println("Le prix total est " + prixTotal + " EUR "); 
        
        //Alternative
        //  System.out.println("Le prix total est " + (nbPersonnes * prixUnitaireCrepe) + " EUR "); 



     }
}