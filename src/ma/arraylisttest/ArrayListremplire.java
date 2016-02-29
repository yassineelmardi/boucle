package ma.arraylisttest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListremplire {
	public static void main(String arag[]) {
		// la première méthode afin de remplire cette Arrays
		@SuppressWarnings("rawtypes")
		List li = Arrays.asList("dd", "aa", "ff",12);
		for (Object value : li) {
			System.out.println(value);
		}

		// la deuxième méthode afin de remplire Array
		ArrayList<String> li1=new ArrayList<>(Arrays.asList("fd","dffd","dfdff"));
		for (String value: li1){
			System.out.println(value);
		}
	}

}
