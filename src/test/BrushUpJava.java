package test;

public class BrushUpJava {

	public static void main(String[] args) {
		int [] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int arr2[]= {1,2,3};
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
//		System.out.println(arr2[0]);
//		System.out.println(arr[1]);
		String[] university= {"Iubat","United"};
		for(int j=0;j<university.length;j++) {
			System.out.println(university[j]);
			//another way
			
		}
		for(String s: university) {
			System.out.println(s);
			
		}

	}

}
