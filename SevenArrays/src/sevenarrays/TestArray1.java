/*
Saurya Nannapaneni 22/10/2019
This program receives grades and and averages the grades
 */
package sevenarrays;

import java.util.Scanner;

public class TestArray1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int[] grades = new int[5];
        Scanner scammer = new Scanner(System.in);
        int sum = 0;
        
        for(int i = 0; i < grades.length; i++)
        {
            System.out.print("Gimme gimme a grade: ");
            grades[i] = scammer.nextInt();
        }
        
        for(int i = 0; i < grades.length; i++)
        {
            sum = sum + grades[i];
        }
        System.out.println("The sum is " + sum);
    }
}
