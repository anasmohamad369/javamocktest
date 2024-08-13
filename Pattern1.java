package test;

public class Pattern1 
{
    public static void main(String[] args) 
    {
        int x = 8;//we are taking intially the first value is 8 to print valjues 

        for (int i = 1; i <= 4; i++) //decide to print how many rows
        {
            int num = x;// we will assigning the our x initaial varaiable to the num variable
            for (int j = 0; j < i; j++) //decide to print coloumns
            {
                System.out.print(num +" ");//print the bvalue which stores in variable
                num++;//increment the value two print next int
            }
            System.out.println();//fir the spaces
             x *= 2;//we should double with 2 to print next
        }
    }
}
