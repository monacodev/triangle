
public class TriangleShape1 {

	public static void main(String[] args) {

		for (int line = 1; line <= 5; line++) {
			for (int i = 5 - line; i > 0; i--) {
				System.out.print("."); // les étoiles sont affichés 10 fois les unes à coté de la'autre car print
			}
			System.out.println(line);// quand on sort de la boucle interne on fait un saut de ligne
		}

	}
	

}
