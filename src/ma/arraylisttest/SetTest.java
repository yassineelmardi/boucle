package ma.arraylisttest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetTest {
	public static void main(String[] args) {
		List list = Arrays.asList(10, 5, 10, 20,30); // LINE A
		System.out.println(list);
		System.out.println(new HashSet(list));
		System.out.println(new TreeSet(list));
		System.out.println(new ConcurrentSkipListSet(list));
	}
}
