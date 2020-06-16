package Assignments;

public class Student_grades {

	public Student_grades() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks=110;
	if (marks<35) {
		System.out.println("Failed");
		}
		else if (marks>=35 && marks<60) {
		System.out.println("D grade");
	    }
		else if (marks>=60 && marks<70) {
			System.out.println("C grade");
		 }
		else if (marks>=70 && marks<80) {
			System.out.println("B grade");
		 }
		else if (marks>=80 && marks<90) {
			System.out.println("A grade");
		}
		else if (marks>=90 && marks<=100) {
			System.out.println("Distinction");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
