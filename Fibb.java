package test;
class Fibb {

    public static void main(String[] args) {
        
        int n = 5; // taking the numbers to the fibbonici series 
        
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series" + n + " terms ");
    
        for (int i = 1; i <= n; i++)//using for loop for the checking the expreesion wheaters its true or not  usiing pre increment ot posyt incremenet 
		{
			System.out.print(a + " ");//we are printing a here first to print 0
            int c = a + b;//we are adding first term and second terms values
            a = b; //assisgn the value to one of each to print the fibbonici
            b = c; 
			
        }
    }
}
