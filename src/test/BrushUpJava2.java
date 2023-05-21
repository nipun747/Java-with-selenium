package test;
import java.util.*;

public class BrushUpJava2 {

	public static void main(String[] args) {
		int[] numbers= new int[6];
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<num.length;i++) {
			if(num[i] % 2==0) {
				System.out.println(num[i]);
			}
		}
		
		ArrayList<String> a= new ArrayList<String>();
		
		a.add("hi");
		a.add("hlw");
		a.add("salam");
		a.add("bye");
		a.remove(2);
		
		System.out.println(a.get(1));

	}

}
