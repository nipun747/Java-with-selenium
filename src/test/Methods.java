package test;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m=new Methods();
		String name= m.getdata();
		System.out.println(name);
		//for accessing Methods2 class from this class
		Methods2 m2=new Methods2();
		m2.getuserdata();

	}
	
	public String getdata() {
		System.out.println("hi");
		return "samina";
	}

}
