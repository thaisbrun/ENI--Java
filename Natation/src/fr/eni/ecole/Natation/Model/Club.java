package fr.eni.ecole.Natation.Model;

public abstract class Club {
	
	//Propriétés
	private String nomClub;

	//Accesseurs 
	public String getNomClub() {
		return nomClub;
	}

	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	
	//Constructeur
	public Club(String nomClub) {
		this.nomClub = nomClub;
	}
	
	
	//Méthodes
	@Override
	public String toString() {
		return this.nomClub;
	}
}
