package test;

public class Program6 {

	public static void main(String[] args)
	{
        int i =0;
       
        for(i=0; i<=100; i++)
	    {
	        	 if (i%3==0 && i%5==0)
	       	 {
	       		 System.out.println("FIZZBUZZ");
	       	 }
	        	
        	 else if(i%5==0)
        	 {
        		 System.out.println("buzz");

        	 }
        	 else if(i%3==0)
             {
             	System.out.println("FIZZ");
             }
        	 else {
        		 System.out.print(i+" ");
        	 }
        }
        
		
	}

}
