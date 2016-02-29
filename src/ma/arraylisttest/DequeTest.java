package ma.arraylisttest;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeTest {
	public static void main(String[] args) {
		// int[] a=new int[]{1,2,3,4,5};
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
		for (int value : deque) {
			System.out.println(value);
		}
		System.out.println("The removed element is: " + deque.remove()); // ERROR?
		for (int value : deque) {
			System.out.println(value);
		}
	}
}
