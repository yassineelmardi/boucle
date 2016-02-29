package ma.Boucle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Date auj = new Date();
		SimpleDateFormat format = null;
		
		

		format = new SimpleDateFormat("dd-MM-yy");

		System.out.println(format.format(auj));
		/* Comparaison deux dates */
		
		SimpleDateFormat date1=new SimpleDateFormat("dd-mm-yy");
		Date d=null;
		d=convertToDate(date1, "31-02-85");
		System.out.println(date1.format(d));

		// System.out.println(Locale.FRANCE);

	}
	
	private static Date convertToDate(SimpleDateFormat df, String str) throws ParseException {
	 synchronized (df) {
		 return df.parse(str);
	}	
	}

}
