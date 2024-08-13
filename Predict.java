package test;

public class Predict implements Number 
{
	public static void main(String[] arr)
	{
		  Number isPositive = number -> number > 0;
		  Number isNeagtive = number -> number > 0;

		  Number isEven = number -> number % 2 ==0;
		  int temp  = 40;
		  int temp1  = -50;

		  System.out.println("GIven number is  Positive " + isPositive.test(temp));
		  System.out.println("GIven number is negative " + isNeagtive.test(temp1));
		  System.out.println("GIven number is even " + .test(temp1));
		  
	}
}
