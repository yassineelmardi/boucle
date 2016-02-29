package ma.arraylisttest;

import java.util.Arrays;

public class DefaultSorter {
	public static void main(String[] args) {
		String[] brics = { "Brazil", "Russia", "India", "China" };
		Arrays.sort(brics); // LINE A
		for (String country : brics) {
			System.out.print(country + " ");
		}
	}
}
