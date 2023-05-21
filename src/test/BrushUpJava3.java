package test;

public class BrushUpJava3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Divine IT LTD";
		
//		String[] splitedstring=s.split(" ");
//		System.out.println(splitedstring[0]);
//		System.out.println(splitedstring[1]);
//		System.out.println(splitedstring[2]);
		String[] splitedstring=s.split("IT");
		System.out.println(splitedstring[0]);
		System.out.println(splitedstring[1]);
		System.out.println(splitedstring[1].trim());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		//for printing the characters in reverse order
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		

	}

}
