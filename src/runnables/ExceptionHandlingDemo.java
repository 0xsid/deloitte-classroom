package runnables;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		System.out.println(y);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception encountered, re try!");
		}
		catch(IOException  | NumberFormatException e) {
			System.out.println("An exception was encountered, re try!");
		    e.printStackTrace();
		}
		finally {
			System.out.println("Program terminated!");
		}
		
	}
	
}
