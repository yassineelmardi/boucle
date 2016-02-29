package ma.chaines;

public class CompareChaines {
	public static void main(String[] args) {
		String chaine = "El Mardi";
		String chaine2 = new String("El Mardi");
		String chaine3 = new String("El Mardi");
		
		if (chaine == chaine2) {
			System.out.println("chaine equal à chaine2");
		} else {
			System.out.println("chaine différent de chaine2");
		}
		if(chaine==chaine3){
			System.out.println("chaine==chaine3");
		}else{
			System.out.println("chaine <> chaine3");
			
		}

		// chaine2="fffff";
		// System.out.println(chaine3);
		// System.out.println(chaine2);
		// System.out.println(chaine == chaine2);
		// System.out.println(chaine3 == chaine2);

	}

}
