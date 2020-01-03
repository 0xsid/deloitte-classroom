package runnables;
import java.util.Scanner;

public class SumOdd {
public static void main(String[] args) {

	int number=0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Number: ");
	if(input.hasNextInt())
		number = input.nextInt();
	else
		System.out.println("Please, enter a number");
	int sum=0,count=0;
	while(number!=0) {
		int temp=number%10;
		if(temp%2==1)
			sum+=temp;
			
		number=number/10;
		count++;
	}
	if(count<3)
		{ System.out.println("enter 3 digit number");
		return;}
	System.out.println("Sum of Odd digits in the number: "+sum);
	input.close();
}
}
