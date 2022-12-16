package fr.eni.ecole.Natation.Model;

public class Bassin {
	
	//Propriétés
	int nbCouloir; 
	int taille;
	
	final int TAILLE_LARG = 25;
	final int TAILLE_LONG = 3;
	char[][] drawBassin;
	
	//Accesseurs 
	public int getNbCouloir() {
		return nbCouloir;
	}

	public void setNbCouloir(int nbCouloir) {
		this.nbCouloir = 3;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = 25;
	}
	
	//Constructeur 
	public Bassin() {}

	
	//public char[][] drawingBassin() {
	//	drawBassin = new char[TAILLE_LONG][TAILLE_LARG];
	//	for(int i=0;i<TAILLE_LONG;i++) {
	//		for(int j=0;j<TAILLE_LARG;j++) {
	//			drawBassin[i][j] = 'c';
	//		}
	//	}
	//	return drawBassin;
	//}
	
	//Méthodes 
	public void afficherBassin(Course course) {
		System.out.print("╔");
		for(int i=1;i<=TAILLE_LARG*2;i++) {
			System.out.print("═");
		}
		System.out.println("╗");
		
		for(int i=0;i<TAILLE_LONG;i++) {
			System.out.print("║");
			for(int j=0;j<TAILLE_LARG*2;j++) {
				System.out.print(" ");
			}
			course.afficherNageurGui();
			
		}
		System.out.print("╚");
		for(int i=1;i<=TAILLE_LARG*2;i++) {
			System.out.print("═");
		}
		System.out.println("╝");
	}
	
	
	//public char[] bassinHaut = {'╔', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '╗'};
	//public char[] bassinBas = {'╚', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '╝'};
	
	//public Map<Integer, Map<bassinBas, bassinBas>> bassinMap = new HashMap<Integer, Map<bassinBas, bassinBas>>();
}
