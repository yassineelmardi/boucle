package ma.split;

import java.util.regex.Pattern;

class Split {
	public static void main(String[] args) {

		String date1 = "01-02-2000";
		String[] dateParts = date1.split("-");
		for (String value : dateParts) {
			System.out.println(value + " ");
		}
		
		Pattern datePetern=Pattern.compile("-");
		dateParts=datePetern.split(date1);
		for(String val:dateParts){
			System.out.println(val);
		}
		
		
	}
}
