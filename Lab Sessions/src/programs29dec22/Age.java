package programs29dec22;

import java.util.Scanner;

public class Age {

			public static void main(String[] args) throws Exception 
			{
				
				//Scanner to store input
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the age");
		
				//Store input from user 
				int age=sc.nextInt();
				
				//Condition check
				if(age>18)
				{
					System.out.println("You are eligible to vote");
				}
				else
				{
					// throw to put exception
					throw new Exception("Age is not correct. You are not eligible to vote");
				}
			}
	}
