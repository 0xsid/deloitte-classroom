package runnables;

public class Overloading {

	static int add(int a, int b) {
		return a+b;
	}
	static float add(float a, float b) {
		
		
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int a=2,b=3;
		float x=1.23f, y=2.45667f;
		
		System.out.println(add(a,b));
		System.out.printf("%1.4f",add(x,y));
	}
}
