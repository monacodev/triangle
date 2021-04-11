
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


		} catch (InputMismatchException e) { // exception si on saisie un mauvais format
			System.out.println("La saisie ne correspond pas au bon format, le nombre doit être un entier ");
		}

	}

}
