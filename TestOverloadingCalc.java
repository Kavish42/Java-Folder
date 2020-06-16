package Assignments;

class TestOverloadingCalc{  
	  void sum(int a,int b){
		  System.out.println("int arg method invoked");
		  }  
	  void sum(long a,long b){
		  System.out.println("long arg method invoked");
		  	}  
	  
	  public static void main(String args[]){  
	  TestOverloadingCalc obj=new TestOverloadingCalc();  
	  obj.sum(20,40);//now int arg sum() method gets invoked  
	  }  
	}
