package test;

public class Collatz {

	public static void main(String[] args) 
 {
		int n=6;
		while(n!=1)
   {
		System.out.print(n + " ");
		if(n%2==0)//if it is even number it will divided by two 
		 {
		  n=n/2;//so here it was divided b 2
		 }
		 else
		{
		  n = 3*(n+1);//if its odd number it was multiply by 2 and add with 1
		  }
		
       }
	    	System.out.println(n);//so here it will be print
	} 
}
