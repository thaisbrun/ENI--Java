package fr.ecole.eni.Natation.Application;

import fr.eni.ecole.Natation.Gui.InterfaceGui;
import fr.eni.ecole.Natation.Model.Bassin;
import fr.eni.ecole.Natation.Model.Course;
import fr.eni.ecole.Natation.Model.Nageur;

public class Jeu implements InterfaceGui{
	
	// Propriétés 
	
	Boolean victoire = false;
	
	//Fonction principale qui exécute les instructions dans la console. 
	
	public static void main(String[] args) { 
		Nageur nageur1 = new Nageur("Les p'tit poissons", "Maxime", "Bousquet", "Papillon", 0);
		Nageur nageur2 = new Nageur("Les p'tit poissons", "Thibault", "Le Veau", "Brasse", 0);	
		Nageur nageur3 = new Nageur("Shark's & Co", "Julie", "Dubosc", "Crawl", 0);
		
		Bassin bassin1 = new Bassin();
		
		Course course1 = new Course(bassin1);
	
		course1.lesNageurs.add(nageur1);
		course1.lesNageurs.add(nageur2);
		course1.lesNageurs.add(nageur3);
		
		
		course1.jetDeForce(nageur1);
		course1.jetDeForce(nageur1);
		
		course1.afficherNageurGui();
		
		course1.lesNageurs.forEach(nageur -> {
			course1.afficherPositionNageur();
		});
		
		//TEST
		bassin1.afficherBassin(course1);
		//System.out.println(bassin1.bassinHaut);
		//System.out.println(bassin1);
	};
}

