package ma.exception.throwstest;

public class NombreHabitantException extends Exception {
	public NombreHabitantException() {
		System.out.println("Vous essayez d'instancier un nombre négatif");
	}
}
