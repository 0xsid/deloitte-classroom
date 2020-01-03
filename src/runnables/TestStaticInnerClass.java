package runnables;

class OuterClass{
	void outerMethod(){
		System.out.println("Outer Class Method");
		
	}
	
	static class InnerClass{
		
		void innerMethod(){
			System.out.println("Inner Class Method");
			
		}
	}
	
}


public class TestStaticInnerClass {
public static void main(String[] args) {
	
	OuterClass obj = new OuterClass();
	obj.outerMethod();
	OuterClass.InnerClass innerObj= new OuterClass.InnerClass();
    innerObj.innerMethod();
}
}
