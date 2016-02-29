package ma.Boucle;

public class TestVarargs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tab[]={2,5,6,8,7};
		System.out.println(additionner(1, 2, 5, 8));
		System.out.println(additionner(tab));
	}

	public static int additionner(int... valeurs) {
		int total = 0;
		for (int t : valeurs)
			total += t;
		return total;

	}
}
