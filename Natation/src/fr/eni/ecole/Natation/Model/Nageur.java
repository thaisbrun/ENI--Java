package fr.eni.ecole.Natation.Model;

public class Nageur extends Personne{
	
	// La classe nageur est une classe fille qui hérite d'une classe mère. 
	//Propriétés
	private String typeNage;
	private int force;
	private int score = 0;
	
	//Accesseurs
	public String getTypeNage() {
		return typeNage;
	}
 
	public void setTypeNage(String typeNage) {
		this.typeNage = typeNage;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force; 
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	//Constructeur
	public Nageur(String nomClub, String prenom, String nom, String typeNage, int score) {
		super(nomClub, prenom, nom);
		this.typeNage = typeNage;
		this.score = score;
	}

	
	
}
