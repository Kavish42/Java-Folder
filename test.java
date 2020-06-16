package Assignments;

public class Test {
	
	//declare instance variable
	
	int id;
	String name;
	
	// default constructor // non parameterized
	// use:: to Assign the instance variable
	public Test(int i, String name1) {
		// TODO Auto-generated constructor stub
		id = i;
		name = name1;	
	}
	public void get_id() {
		
		System.out.print(id);
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test(); // creation of object and then constructor will be invoked
		Test obj2 = new Test(10,"kavish"); // object/instance variables
		Test obj3 = new Test(20,"raj"); // object/instance variables

	}

}
