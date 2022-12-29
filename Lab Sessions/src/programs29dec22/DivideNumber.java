package programs29dec22;
import java.util.Scanner;
public class DivideNumber {

	public static void main(String[] args) 
	{
		try
		{
			int a,b,c;
			Scanner x=new Scanner(System.in);
					
			System.out.print("Enter first number");
			a=x.nextInt();
		       
			System.out.print("Enter second number");
			b=x.nextInt();
		      
			c=a/b;
			System.out.println("Ans : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error"+e);
		}		
	}
}

	


