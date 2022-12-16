package fr.eni.ecole.Natation.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Course {
	
	//Propriétés
	private int tailleCourse;
	private Bassin bassin;
		
	public List<Nageur> lesNageurs = new ArrayList<>() ; 
	
	//Accesseurs
	public int getTailleCourse() {
		return tailleCourse;
	}
	
	//Constructeur
	public Course(Bassin bassin) {
		this.bassin = bassin;
		this.tailleCourse = 50;
	}
	
	//Méthodes
	public void afficherPositionNageur() {
		System.out.println("=#o");
	}
	
	public void afficherNageurGui() {
		this.lesNageurs.forEach(nageur -> {
			System.out.println(nageur.getNom() + " : " + nageur.getForce() + " / 50" + " - (" + nageur.getNomClub() + ") ");
		});
		System.out.println("");
	}

	public void jetDeForce(Nageur n) {
		this.lesNageurs.forEach(nageur -> {
			Random rand = new Random();
			nageur.setForce(nageur.getForce() + rand.nextInt(4));
		});
	}
}
