package Assignments;

class Wildlife {
	void sleep() {
		System.out.println("Sleeping");
	}
}

class Deer extends Wildlife {
	void run() {
		System.out.println("Running");
	}
} 
class BabyDeer extends Deer {
	void walk() {
		System.out.println("Walking");
	}
}
public class MultiInheritance {

	public static void main(String[] args) {
	BabyDeer b=new BabyDeer();
	b.walk();
	b.run();
	b.sleep();
}

}
