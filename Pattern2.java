package test;
public class Pattern2 {
    public static void main(String[] args)
    {
        int n = 4; // Number of rows
       // int count = 0;
        int num = 2;// asssigning first prime number 
        
        for ( int i = 1; i <= n; i++) //for loop condition to rows
        {
            
            for (int k = 1; k <= i ; k++) // Print prime numbers in the current row
            {
                while (!checking(num)) // using the one public method type boolean to check 
                {
                    num++; // if it is correct it will increase the number restart the condition
                }// if its is in correct it will print the value 
                System.out.print(num + " ");// printing the number
                num++;// add the number to print
            }

            // Move to the next line
            System.out.println();
        }
    }

    // Function to check if a number is prime
    public static boolean checking(int n) 
    {
        if (n <= 1)//checking the condition if it was less than one or not
       {
            return false; //if one it returns false
        }
        for (int i = 2; i <= Math.sqrt(n); i++)//for condition to check the condition math using sqrt
        {
            if (n % i == 0) 
            {
                return false; // inner if condition to check correct value
            }
        }
        return true;
    }
}

