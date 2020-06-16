package Assignments;

abstract class Shape{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle1 extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
class Square1 extends Shape{  
void draw(){System.out.println("drawing square");}  
} 
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();//In a real scenario, object is provided through method,e.g,getShape() method  
Shape s1=new Square1();
s1.draw();
s.draw();  
}  
}