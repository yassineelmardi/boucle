package ma.generic;

public class TestClassGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Première utilisation
		MaClassGeneric<String, Integer> maClass = new MaClassGeneric<String, Integer>(
				"Salam", 45);
		System.out.println(maClass.getParam2());
		System.out.println(maClass.getParm1());
		
		// Deuxième utilisation
		MaClassGeneric<String, String> maClass2 = new MaClassGeneric<String, String>(
				"Yassine", "El Mardi");
		System.out.println(maClass2.getParm1());
		System.out.println(maClass2.getParam2());
		
		// Troixième utilisation avec d'autres types
		MaClassGeneric<Integer, Integer> maClass3 = new MaClassGeneric<Integer, Integer>(
				5, 10);
		System.out.println(maClass3.getParm1());
		System.out.println(maClass3.getParam2());
	}

}
