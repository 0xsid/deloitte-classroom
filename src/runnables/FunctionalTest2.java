package runnables;

interface Operation{
	double operate(double s, double b);
}

class Calculation{
	double calculate(double i, double j, Operation op) {
		double x = op.operate(i, j);
		System.out.println(x);
		return x;
	}
}

public class FunctionalTest2 {

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		double a=5.6, b=3.8;
		double sum = cal.calculate(a,b, (x,y)->(x+y));
		double mul = cal.calculate(a,b, (x,y)->{
			System.out.println(x*y);
			return x*y;
		});
	
	
	
	}
}
