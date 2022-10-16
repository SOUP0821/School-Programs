
/*
Saurya Nannapaneni 10/22/19
This program reads students names and displays at the end
 */

import java.util.Scanner;
public class TestArray2
{
    public static void main(String[] args)
    {
        Scanner names = new Scanner(System.in);
        String[] students = new String[5];
        
        for (int i = 0; i<students.length; i++)
            {
                System.out.print("Enter a name ");
                students[i] = names.nextLine();
            }
        for(int i = 0; i<students.length; i++)
        {
            System.out.println("Name " + (i+1) + ": " + students[i]);
        }
    }
}
    