package test;

public class Factor {

	public static void main(String[] args) {
     
		int number = 60;//given number we take the 60
		if(number==0)
		{
	         System.out.println("we cant display the factors of these numbers");		
		}
		for (int i = 2; i <= number/2; ++i)//checking condition 
		{
			if (number%i == 0)//if the given number got the reminder 0 it will the 
			{
				System.out.print(i + " ");//if the condition is true i will be print
			}
	    }
	}
 }


