/*
 Method for factorial
 */
package cpprobability;

/**
 *
 * @author Saurya21
 */
public class FactorialMethod
{  
    public static int factorial(int number) 
    {
        //defining variables
        int result = 1;
        if (number < 0)
        {
            result = number;
        }
        else if (number == 0)
        {
            result = 1;
        }
        else if (number > 0)
        {

            for (int factor = 2; factor <= number; factor++) // for loop for factorials
            {
                result *= factor;
            }
        }
        return result;
    }
}