/*
Saurya Nannapaneni 12/1/2019
This program tells the user if the chemical equation they have entered is balanced or not
and also displays the number of elements on each side

1. Prompt the user to eneter their equation
2. Seperate elements and compounds by "+"
3. Find element names by capitals and lowercases
4. Seperate sides by "="
5. Count the number of elements on each side by the number before the elements such as "6K"
6. Check if every element is balanced on both sides
7. If the elements are balanced on both sides print the elements out and say balanced
8. If the elements are not balanced on both sides print the elements and say unbalanced
9. Ask the user if they want to use the program again
 */
package balancingequations;

import java.util.Scanner;

public class MidtermChemicalBalancing
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String[] elements = new String[100];
        String answer;
        
        System.out.println("What are the elements on the Reactant Side: ");
        
        System.out.println("How many " + " are there: ");
        System.out.println("What are the elements on the Product Side: ");
        System.out.println("How many " + " are there: ");
        System.out.println("The Chemical equation is balanced");
        System.out.println("The Chemical equation is unbalanced");
    }
}