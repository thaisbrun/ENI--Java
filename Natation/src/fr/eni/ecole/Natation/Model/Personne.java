package fr.eni.ecole.Natation.Model;

public abstract class Personne extends Club{
	//La classe abstraite Personne hérite de la classe Club et est elle-même classe mère. 
	
	//Propriétés 
	private String prenom;
	private String nom;
	
	//Accesseurs
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//Constructeur
	public Personne(String nomClub, String prenom, String nom) {
		super(nomClub);
		this.prenom = prenom;
		this.nom = nom;
	}

}
