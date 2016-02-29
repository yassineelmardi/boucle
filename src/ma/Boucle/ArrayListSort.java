package ma.Boucle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("z");
		l.add("a");
		l.add("b");
		l.add("y");
		l.add("i");
		l.add("o");
		l.add("e");

		for (String temp : l) {
			System.out.println(temp);
		}
			
		Collections.sort(l);
		
		System.out.println("Après le try");
		for(String te:l){
			System.out.println(te);
		}
		
	}

}
