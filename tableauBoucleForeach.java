public class Interface3{

     public static void main(String []args){
        

         
       String messageBienvenue = "Bienvenue" ;
	   String nomRestaurant = "Sel et Miel"; 
		
		System.out.println(messageBienvenue + " chez " + nomRestaurant); 
	 

		System.out.println("--- Notre Menu Crêpes ---"); 

	
      
        /**
         * Objectif: 
         * 
         * 1. déclarer tableau de chaines de caractères. Avec 3 noms de crêpes
         * 2. Afficher le contenu du tableau en utilisant une boucle foreach.
         */ 
        
        String [] menuCrepes = new String [] {"Crepe Cupidon", "Crepe des bois", "Crepe au sucre"}; 
        
        for (String crepe : menuCrepes ) {
            System.out.println(crepe); 

        }


     }
}