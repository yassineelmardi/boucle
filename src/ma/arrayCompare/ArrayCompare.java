package ma.arrayCompare;

import java.util.Arrays;

public class ArrayCompare {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println(arr == arr1);
		System.out.println(arr.equals(arr1));
		System.out.println(Arrays.equals(arr, arr1));// C'est ainsi qu'il faut comparer les arr
	}

}
