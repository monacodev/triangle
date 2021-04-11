
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleShape2 {

	public static void main(String[] args) {

		int size; // Nombre de lignes

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Entrer le nombre de lignes que comportera votre triangle");

			size = sc.nextInt();

			// Numerical input: if the number is < 2 the default size will be 2
			if (size < 2) {
				size = 2;
			}
			
			// Boucle for pour créer le triangle

						for (int ligne = 0; ligne < size; ligne++) { // Boucle externe loop outern
							for (int i = 0; i < ligne; i++) {
								System.out.print(" ");
							}
							for (int j = 0; j < size - ligne; j++) { // Boucle interne loop inside
								System.out.print("*");
							}

							for (int j = 1; j < size - ligne; j++) { // Boucle interne loop inside
								System.out.print("*");
							}
							System.out.println(); // Saut de ligne après chaque tour de la boucle externe
						}

			
		} catch (InputMismatchException e) { // exception si on saisie un mauvais format
			System.out.println("La saisie ne correspond pas au bon format, le nombre doit être un entier ");
		}

	}

}
