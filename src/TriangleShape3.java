
public class TriangleShape3 {
	/*
	 * procédure qui nous affiche un triangle réctangle avec le sommet en haut
	 */
	public static void displayTraingleRec() {

		for (int i = 0; i < 5; i++) { // boucle externe
			
			for (int j = 0; j <= i; j++) { // boucle interne
				System.out.print("*");
			}
			System.out.println(); // saut de ligne à chaque sortie de la boucle interne
		}
		

	}

	public static void main(String[] args) {
		displayTraingleRec();
	}

}
