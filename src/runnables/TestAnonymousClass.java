package runnables;

interface Inter{
	void show();
}

public class TestAnonymousClass {
public static void main(String[] args) {
	
//	Inter obj = new Inter() {
//		public void show() {
//			System.out.println("Anonymous class printed this");
//		}
//	};

	Inter obj =()->System.out.println("hello!");
obj.show();
}
}
