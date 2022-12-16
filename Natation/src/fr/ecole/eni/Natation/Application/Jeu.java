package fr.ecole.eni.Natation.Application;

import java.util.Random;

import fr.eni.ecole.Natation.Model.*;

public class TestNatation {
	
	public static void main(String[] args) {  
		Nageur nageur1 = new Nageur("Maxime", "Bousquet", "Papillon");
		Nageur nageur2 = new Nageur("Thibault", "Le Veau", "Brasse");
		Nageur nageur3 = new Nageur("Julie", "Dubosc", "Crawl");
		
	Course course1 = new Course(50);
	
	course1.lesNageurs.add(nageur1);
	course1.lesNageurs.add(nageur2);
	course1.lesNageurs.add(nageur3);
	ajoutForce(course1);
	course1.afficherNageurs();
	
	
	};
	
public static void ajoutForce(Course course) {
		course.lesNageurs.forEach(nageur -> {	
			for(int i = 0 ; i < course.getTailleCourse() ; i++) {
			Random random = new Random();
			i = nageur.setForce(nageur.getForce() + random.nextInt(4));
			break;
			}

		});
	}
}
