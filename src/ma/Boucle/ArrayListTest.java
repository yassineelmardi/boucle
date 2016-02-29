package ma.Boucle;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("test1");
		list1.add("Test2");
		list1.add("test3");
		
		//for avec variable
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
		System.out.println("Advanced Loop");
		//For ms autrement
		for(String temp: list1){
			System.out.println(temp);
		}
		
		System.out.println("Loup for While");
		int j=0;
		while(j<list1.size()){
			System.out.println(list1.get(j));
			j++;
		}

	}

}
