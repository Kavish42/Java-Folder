package Assignments;

public class Animal {
	void eat() {
		System.out.println("Eating");
	}
}
class Rat extends Animal {
	void bite() {
		System.out.println("Biting");
	}
}
class Inherit {
	public static void main(String[] args) {
	Rat r=new Rat();
	r.bite();
	r.eat();
}
	}

