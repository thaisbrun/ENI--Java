package fr.eni.ecole.Natation.Model;

import java.util.*;

public class Course {
	
	//Propriétés
	int tailleCourse;
	public static List<Nageur> lesNageurs = new ArrayList<>() ;  

	//Getters et setters 
	
	public int getTailleCourse() {
return tailleCourse;
}
	//Constructeur 
	public Course(int tailleCourse) {
		this.tailleCourse = tailleCourse;
	}
	
	//Méthodes 
	
	public static void afficherNageurs() {
		lesNageurs.forEach(nageur -> {
			System.out.println(nageur.nom + " =#o " + nageur.force + " / 50");
		});
	}
	
}
