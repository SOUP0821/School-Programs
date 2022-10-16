/* Saurya Nannapaneni 18/10/19
This program models using netbeans
 */
package firstproject;

import java.util.Scanner;

/**
 *
 * @author Saurya21
 */
public class MyFirstString
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int myNumber;
        int myAnswer;

        System.out.println("Hello Netbeans");
        System.out.println("Enter a number ");
        myNumber = kb.nextInt();
        myAnswer = Math.abs(myNumber);
        System.out.println("My answer is " + myAnswer);
    }

}
