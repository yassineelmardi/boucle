package ma.Boucle;

public class Boucle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Salam cv");
		int tableau[] = { 1, 2, 3, 4, 5 };
		String tab[] = new String[3];
		tab[0] = "coucou";
		tab[1] = "Yassine";
		tab[2] = "El Mardi";
		// int i;
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
		}

		for (int j = 0; j < tab.length; j++) {
			System.out.println(tab[j]);

		}
	}

}
