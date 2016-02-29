package ma.exception.throwstest;

public class Test {
	public static void main(String[] args) {
		try {
			Ville v = new Ville("fddf", 12, "fddfdf");
		} catch (NombreHabitantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
