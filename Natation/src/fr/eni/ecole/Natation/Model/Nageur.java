package fr.eni.ecole.Natation.Model;

public class Nageur extends Personne {
	
	//Propriétés 
	
	public String nage;
	public int force = 0; 
	public int score; 
	
	//Constructeur 
	
	public Nageur() {}

	public Nageur(String prenom, String nom, String nage) {
		super(prenom, nom);
		this.nage = nage;
	}

	public int getForce() {
		return force;
	}

	public int setForce(int force) {
		return this.force = force;
	}

	
	
	
}
