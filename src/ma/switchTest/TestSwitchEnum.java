package ma.switchTest;



public class TestSwitchEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(Cards cards:Cards.values()){
			switch(cards.toString()){
			case"CLUB":
				System.out.println("CLUB");
				break;
			}
		}

	}

}
