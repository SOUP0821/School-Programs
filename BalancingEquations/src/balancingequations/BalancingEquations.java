/*
Saurya Nannapaneni 12/1/2019
This program tells the user if the chemical equation they have entered is balanced or not
and also displays the number of elements on each side

1. Prompt the user to eneter their equation
2. Seperate elements and compounds by "+"
3. Seperate compounds by capitals and lowercases
4. Seperate sides by "="
5. Count the number of elements on each side by the number before the elements such as "6K"
6. Check if every element is balanced on both sides
7. If the elements are balanced on both sides print the elements out and say balanced
8. If the elements are not balanced on both sides print the elements and say unbalanced
9. Ask the user if they want to use the program again
 */
package balancingequations;

import java.util.Scanner;

public class BalancingEquations
{

    public static void main(String[] args)
    {
        boolean exit = false; // Boolean to exit the program
        do{
            System.out.println("Enter the chemical equation:"); // Prompt for the user
            // Declaring Variables
            Scanner kb = new Scanner(System.in);
            String answer;
            String data = kb.nextLine(); // Scanner
            String Data[] = data.split("="); // This is used to split the string in half when an = appears
            String reactants = Data[0]; // Array for the Reactants
            String products = Data[1]; // Array for the Products
            int limitReactant = 0; // amount of Reactants
            int limitProduct = 0; // amount of Products
            int reactantIndAmount = 0; // Independant amount of the element on the reactant side
            int productIndAmount = 0; // Independant amount of the element on the product side
            String plus = "\\+"; // Declaring +
            String[] reactantsSplit = reactants.split(plus); // The variable + is used to split elements on a side
            String[] productsSplit = products.split(plus); // This for the products side

            for (int i = 0; i < reactants.length(); i++) // for loop to see how many elements are on the reactant side
            {
                if (Character.isUpperCase(reactants.charAt(i))) // Checks what is capital on the reactant side to count it as an element
                {
                    limitReactant++; // adds 1 element
                }
            }
            for (int i = 0; i < products.length(); i++) // for loop to see how many elements are on the product side
            {
                if (Character.isUpperCase(products.charAt(i))) // Checks what is capital on the product side to count it as an element
                {
                    limitProduct++; // adds 1 element
                }
            }
            String[] reactantName = new String[limitReactant]; // This saves the name of the reactant
            int[] reactantAmount = new int[limitReactant]; // This is the amount of reactants on that side
            String[] productName = new String[limitProduct]; // Name of the elments on the product side
            int[] productAmount = new int[limitProduct]; // Amount of the elment on the product side
            for (int i = 0; i < reactantsSplit.length; i++)
            {
                String reactantSide = reactantsSplit[i];
                int multiplier = 1; // Declares the multiplier

                for (int j = 0; j < reactantSide.length(); j++) // for loop for looking for the amount of elements
                {
                    char s = reactantSide.charAt(j);
                    if (Character.isDigit(s) && multiplier == 1) // Checks if the charachter its on is a digit and not a letter
                    {
                        multiplier = Character.getNumericValue(s); // Gets the value of the digit
                        if (Character.isDigit(reactantSide.charAt(j + 1))) // If the Charachter is a digit
                        {
                            j++; // then j + 1
                            while (true) // While loop when true
                            {
                                if (j < reactantSide.length() && Character.isDigit(reactantSide.charAt(j))) // If j is less than Reactant side and is a digit
                                {
                                    multiplier = multiplier * 10 + Character.getNumericValue(reactantSide.charAt(j));
                                    j++; // j + 1

                                }
                                else
                                {
                                    j--;
                                    break; // Used to break the loop
                                }
                            }
                        }
                    }
                    if (Character.isUpperCase(s)) // if statment for if the charachter is Upper Case
                    {
                        int k = j + 1; // Declaring k
                        String lowerCaseElement = s + ""; // Lower case part of the element
                        while (true) // while statement while true
                        {
                            if (k < reactantSide.length())
                            {
                                if (Character.isLowerCase(reactantSide.charAt(k)))
                                {
                                    lowerCaseElement = lowerCaseElement + reactantSide.charAt(k);
                                }
                                if (Character.isUpperCase(reactantSide.charAt(k)) || Character.isDigit(reactantSide.charAt(k)))
                                {
                                    break; // Used to break the loop
                                }
                                k++;
                            }
                            else
                            {
                                break; // Used to break the loop
                            }
                        }

                        reactantName[reactantIndAmount] = lowerCaseElement; // array for the Reactant and the amount of it = temp
                        int reactantNumber = 1; // Declaring reactant number
                        if (k < reactantSide.length())
                        {
                            if (Character.isDigit(reactantSide.charAt(k)))
                            {
                                reactantNumber = Character.getNumericValue(reactantSide.charAt(k)); // reactant number = the value of elments on the reactant side
                                k++; // k + 1
                                while (true)
                                {
                                    if (k < reactantSide.length() && Character.isDigit(reactantSide.charAt(k))) // If k is less than the length of the reactants and is less than the amount of elements
                                    {
                                        reactantNumber = reactantNumber * 10 + Character.getNumericValue(reactantSide.charAt(k));
                                        k++; // K + 1

                                    }
                                    else
                                    {
                                        break; // Used to break loop
                                    }
                                }
                            }
                        }
                        reactantAmount[reactantIndAmount] = reactantNumber * multiplier;
                        j = k - 1;
                        reactantIndAmount++; // Add 1 to Independant amount on the Reactant side

                    }
                }

            }
            for (int i = 0; i < productsSplit.length; i++) // for loop for 
            {
                String productLine = productsSplit[i]; // Declaring variable ProductLine
                int multiplier = 1; // Declaring multiplier

                for (int j = 0; j < productLine.length(); j++)
                {
                    char elementCharacter = productLine.charAt(j); // Stores the variable as a charachter
                    if (Character.isDigit(elementCharacter) && multiplier == 1) // If the character is a digit and multiplier = 1
                    {
                        multiplier = Character.getNumericValue(elementCharacter); // multiplier = the number of the element
                        if (Character.isDigit(productLine.charAt(j + 1))) // if the charachter is a digit in the product side
                        {
                            j++; // j + 1
                            while (true) // while the condition is true
                            {
                                if (j < productLine.length() && Character.isDigit(productLine.charAt(j))) // If j is less than the products and is a digit
                                {
                                    multiplier = multiplier * 10 + Character.getNumericValue(productLine.charAt(j));
                                    j++; // j + 1

                                }
                                else
                                {
                                    j--;
                                    break; // ends loop
                                }
                            }
                        }
                    }
                    if (Character.isUpperCase(elementCharacter)) // If the character is upper case
                    {
                        int k = j + 1; // declaring k 
                        String temp = elementCharacter + ""; // The element is the element character
                        while (true)
                        {
                            if (k < productLine.length()) // is K is less than the product side lenght
                            {
                                if (Character.isLowerCase(productLine.charAt(k))) // if Character is lower case
                                {
                                    temp = temp + productLine.charAt(k); // temp = temp + lower case product
                                }
                                if (Character.isUpperCase(productLine.charAt(k)) || Character.isDigit(productLine.charAt(k))) // If the character is lower case or a digit 
                                {
                                    break; // ends loop
                                }
                                k++;
                            }
                            else
                            {
                                break; // ends loop
                            }
                        }

                        productName[productIndAmount] = temp;
                        int reactantNumber = 1; // Declaring Reactant Number
                        if (k < productLine.length())
                        {
                            if (Character.isDigit(productLine.charAt(k)))
                            {
                                reactantNumber = Character.getNumericValue(productLine.charAt(k));
                                k++;
                                while (true)
                                {
                                    if (k < productLine.length() && Character.isDigit(productLine.charAt(k))) // If k is less than the length of products and is a digit
                                    {
                                        reactantNumber = reactantNumber * 10 + Character.getNumericValue(productLine.charAt(k));
                                        k++; // k + 1

                                    }
                                    else
                                    {
                                        break; // Ends loop
                                    }
                                }
                            }
                        }
                        productAmount[productIndAmount] = reactantNumber * multiplier;
                        j = k - 1;
                        productIndAmount++;

                    }
                }

            }
            for (int i = 0; i < limitReactant; i++) // For loop for getting the Reactant names
            {
                for (int j = i + 1; j < limitReactant; j++)
                {
                    if (reactantName[i].equals(reactantName[j])) // Used for finding multiple elements or elements in compounds
                    {
                        reactantAmount[i] = reactantAmount[i] + reactantAmount[j];
                        reactantAmount[j] = 0;
                        reactantName[j] = "";
                        limitReactant--; // Limit reactant - 1
                    }
                }
            }
            int r = limitProduct; // declaring r
            for (int i = 0; i < r; i++) // for loop  for finding elements on the same side and also in compounds
            {
                for (int j = i + 1; j < r; j++)
                {
                    if (productName[i].equals(productName[j]))
                    {
                        productAmount[i] = productAmount[i] + productAmount[j];
                        productAmount[j] = 0;
                        productName[j] = "";
                        limitProduct--;
                    }
                }
            }
            System.out.println("");
            System.out.println("Reactants: ");
            // Lists out the Reactants
            for (int i = 0; i < limitReactant; i++) // For loop for rectants
            {
                System.out.println(reactantName[i] + " " + reactantAmount[i]); // Prints Reactants name
            }
            System.out.println("Products: ");
            // Lists out the products
            for (int i = 0; i < limitProduct; i++) // For loop for products
            {
                System.out.println(productName[i] + " " + productAmount[i]); // Prints Products name
            }
            int balanced = 0; // Declaring int balanced
            for (int i = 0; i < reactantName.length; i++) // For loop for balancing out the sides
            {
                for (int j = 0; j < productName.length; j++) // For loop for balancing out the sides
                {
                    if (reactantName[i].equals(productName[j])) // If the name of the reactant = The name of the product it goes to next if statment
                    {
                        if (reactantAmount[i] != productAmount[j]) // If the amount of each reactant and product are not the same 
                        {
                            balanced++; // Then adds 1 to balanced
                        }
                    }
                }
            }
            if (balanced == 0) // If statement if balanced or not
            {
                System.out.println("balanced");
            }
            else
            {
                System.out.println("unbalanced"); // Says unbalanced if unbalanced
            }
            System.out.println("Do you want to continue entering chemical equations: "); // asks if you want to continue the program
            {
                answer = kb.nextLine(); // Scanner variable

                if (answer.equalsIgnoreCase("Yes")) // If the answer is Yes you do the program again
                {
                    System.out.println("Great");
                }
                else if (answer.equalsIgnoreCase("No")) // If answer is no you exit
                {
                    exit = true; // If you want to exit sets it to true
                }
            }
        } while (exit == false);
    }
}