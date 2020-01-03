package runnables;

@FunctionalInterface
interface Inter1{
	int sum(int i,int j);
}
public class FunctionalTest {
public static void main(String[] args) {
	
	Inter1 inter = (i,j)->{
		System.out.println(i+j);
		return (i+j);
	};
	inter.sum(1,2);
}
}
