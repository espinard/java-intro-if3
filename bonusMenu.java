/**
         * Objectif: 
         * 
         * 1. déclarer tableau de chaines de caractères. Avec 3 noms de crêpes
         * 2. Afficher le contenu du tableau en utilisant une boucle foreach.
         * 
         * 
         * Le code commenté est pour la version alternative, utlisant un tableau associatif
         */ 


// import java.util.*;


public class Interface3{

     public static void main(String []args){
         
         
         //Pour l'aternative avec tableau associatif (hashmap)
         // constante:  on ne souhaite plus la modifier après déclaration

        // final String ID_CREPE_BOIS = "crepeBois";  
        // final String ID_CREPE_CUPIDON = "crepeCupidon"; 
        // final String ID_CREPE_COCO = "crepeCoco"; 

         
       String messageBienvenue = "Bienvenue" ;
	   String nomRestaurant = "Sel et Miel"; 
		
		System.out.println(messageBienvenue + " chez " + nomRestaurant); 
	 

		System.out.println("--- Notre Menu Crêpes ---"); 

	
      
    
        
        String [] menuCrepes = new String [] {"Crêpe Cupidon", "Crêpe des bois", "Crêpe au sucre"}; 
        int [] prixCrepes = new int [] {15, 12, 13}; 
        
        String espacementCrepePrix = "\t...\t";
        String euro = " EUR "; 
        
        //Comme les deux tableaux ont la même taille, on peut se permettre defaire 
        for (int i =0 ; i< menuCrepes.length; i++) {
            System.out.println(menuCrepes[i] + 
            
                                espacementCrepePrix + 
                                        prixCrepes[i] + euro); 
                                        

        }
        
    
    
    // 	System.out.println("--- Notre Menu Crêpes (alternative avec tableau associatif)---"); 

    
    //     Map<String,String> nomCrepes = new HashMap<String,String>();
        
    

    //     nomCrepes.put(ID_CREPE_BOIS, "Crêpe des Bois"); 
    //     nomCrepes.put(ID_CREPE_CUPIDON, "Crêpe Cupidon"); 
    //     nomCrepes.put(ID_CREPE_COCO, "Crêpe Coconutella"); 
        
    //     Map<String,Integer> prixAssoc= new HashMap<String,Integer>();
        
    //     prixAssoc.put(ID_CREPE_BOIS, new Integer(12)); 
    //     prixAssoc.put(ID_CREPE_CUPIDON, new Integer(15)); 
    //     prixAssoc.put(ID_CREPE_COCO, new Integer(13)); 
        
    //     // nomCrepes.keySet() : récupération des clés utilisées pour le tableau associatif
        
    //     for(String idCrepe : nomCrepes.keySet()){
            
    //     	System.out.println(nomCrepes.get(idCrepe) + 
    //     	                                espacementCrepePrix +
    //     	                                    prixAssoc.get(idCrepe) + euro) ; 

    //     }
        
         
         




     }
}