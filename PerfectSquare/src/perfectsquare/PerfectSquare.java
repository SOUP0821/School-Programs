/*
 * Saurya Nannapaneni September 3 2021
Preconditon: Number user inputs has to be a positive number and not have decimals
1. Ask user for input to put in a number
2. Find all the prime factors of the number
3. Add those numbers into array list
4. Search through array list to find if any numbers are repeated
5. Remove numbers that are repeated even number of times and multiply the rest of the numbers left
6. Ask user if they want to use the program again
  a. If yes repeat program
  b. If no close program
Postcondition: numbers that are repeated an odd number  of times and multiplies them and returns the answer
 */
//package perfectsquare;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare
{

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in); //Declaring Scanner
    ArrayList<Integer> prime = new ArrayList<Integer>(); //Array list to store prime numbers
    ArrayList<Integer> result = new ArrayList<Integer>(); // Array list to store new array shown later
    int number; // users number
    int one = 1; // used to multiply the result array
    int count = 0;// how many times a number is duplicated

    System.out.println("number*n = in to a perfect a square"); // explains the program
    System.out.println("Please input a number to find the n: "); // prompts the user
    number = kb.nextInt();

    for (int i = 2; i < number; i++) // for loop to find the prime factors starts at 2 because 1 will always be mentioned
    {
      while (number % i == 0) // goes through numbers to find the prime numbers and see if the number is divisble by it 
      {
        number = number / i; // divides the number by the prime factor to find other prime factors
        prime.add(i); // adds it to the array list
      }
    }
    if (number > 2) // used to handle if prime number is bigger than 2
    {
      prime.add(number);// adds number if bigger than 2
    }
    for (int i = 0; i < prime.size(); i++) // for loop for the first number of array
    {
      for (int j = 0; j < prime.size(); j++)// used to check for if any numbers are duplicates of the first
      {
        if (prime.get(i) == prime.get(j)) // used to count duplicates
        {
          count++; // adds to count of duplicates
        }
      }
      if (count % 2 != 0) // if there is an odd number of duplicates adds to result ArrayList
      {
        result.add(prime.get(i)); // adding number to array list
      }
    }
    for (int i = 0; i < result.size(); i++) // for loop to multiply arraylist
    {
      one *= result.get(i); // multiplies array
    }
    System.out.println("n is " + one); // prints n
  }
}
