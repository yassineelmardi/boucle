package ma.exception.throwstest;

public class Ville {
	int nbreInstanceBis;
	int nbreInstance;

	public Ville(String pNom, int pNbre, String pPays)
			throws NombreHabitantException {
		if (pNbre < 0)
			throw new NombreHabitantException();
		else {

			nbreInstance++;

			nbreInstanceBis++;

			String nomVille = pNom;
			String nomPays = pPays;
			int nbreHabitant = pNbre;
			this.setCategorie();
		}
	}

	private void setCategorie() {
		// TODO Auto-generated method stub

	}
}
