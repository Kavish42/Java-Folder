package Assignments;

public class Teacher {
	 int id;  
	 String name; 
	 
	 Teacher (int i, String n) {
	id=i;
	name= n;
	 }
	 
	 void display() {
        System.out.println(id+" "+name);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Teacher s1 = new Teacher(123,"Kavi");  
		 Teacher s2 = new Teacher(456,"Kavish");  
		    //calling method to display the values of object  
		    s1.display();  
		    s2.display();  
		   }  
		} 

