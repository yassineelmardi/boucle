package ma.Boucle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		Date d1 = sdf.parse("01/01/85");
		Date d2 = sdf.parse("01/02/85");
		System.out.println(sdf.format(d1));
		System.out.println(sdf.format(d2));

		if (d1.after(d2)) {
			System.out.println("Date 1 est plus grand que date 2");
		}
		if (d1.equals(d2)) {
			System.out.println("Date 1 egale Date 2");
		}
		if (d1.before(d2)) {
			System.out.println("date 1 est inférieur au date 2");
		}

	}

}
