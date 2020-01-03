package runnables;

class Outer{
	void outerMethod(){
		System.out.println("Outer Class Method");
		
	}
	
 class Inner{
		
		void innerMethod(){
			System.out.println("Inner Class Method");
			
		}
	}
	
}


public class TestInnerClass {
public static void main(String[] args) {
	
	Outer obj = new Outer();
	obj.outerMethod();
	Outer.Inner innerObj= obj.new Inner();
    innerObj.innerMethod();
}
}
