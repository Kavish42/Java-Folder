package Assignments;
// class name start with upper case
// method and package name start with lower case

public class Math {	
// 3. Constructor block
	//  it is nothing but class name without return data type

	public Math()
	{
			
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Math obj= new Math(); // 1. creation of object ---> 2. constructor will be invoked
		 
		int	x1= obj.addition(10, 20); // calling a method using object or object reference
		int	x2 =obj.subtraction(30, 10);
			System.out.println(x1 );
			System.out.println(x2);
			multiplication(10,10);
			obj.division(100,10);
				
	}
		public int addition (int a, int b) {
	return a+b;
	};
	public int subtraction (int a, int b) {
		return a-b;
    }
	public static void multiplication (int a, int b) {
		System.out.println(a*b);
	}
	public void division (int a, int b) {
		System.out.println(a/b);
	}

	       }
