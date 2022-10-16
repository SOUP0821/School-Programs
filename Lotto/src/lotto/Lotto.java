/*
Saurya Nannapaneni
Friday August 20th
This program generates random number and stores them in array 
then the user will be able to guess if their number is there

Pseudocode:
1. Create method to look for your guess and if found it will return with index position if not returns -1
2. Create an array to store 100 random numbers in it with for loop
3. Prompt user to guess for a number
4. If statement to see if number exists
  a. if it exists adds a win and says you win
  b. if it does not exist adds a loss and says you lost
5. Prompt the user if they want to play again
  a. if the user says yes program will keep running
  b. if the user says no the program will stop running and will display your total wins and losses
 */
package lotto;

import java.util.Scanner;

public class Lotto
{
// method to find if numbers are in array 

  public static int linearSearch(int[] numbers, int guess)
  {
    for (int i = 0; i < numbers.length; i++) // for loop to look for the numbers by going 1 by 1
    {
      if (numbers[i] == guess) // if statement to determine if the number is there
      {
        return i; // returns with the index position
      }
    }
    return -1; // returns -1 if false
  }
  
  public static void selectionSort(int[] numbers)
  {
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < numbers.length-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < numbers.length; j++)
                if (numbers[j] < numbers[min])
                    min = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
    }

  public static void bubbleSort(int[] numbers)
  {
    for (int i = 0; i < numbers.length - 1; i++)
    {
      for (int j = 0; j < numbers.length - i - 1; j++)
      {
        if (numbers[j] > numbers[j + 1])
        {
          // swap arr[j+1] and arr[j]
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }

  public static int binarySearch(int[] numbers, int start, int end, int guess)
  {
    int middle;
    if (end >= start)
    {
      middle = (start + end) / 2;
      if (numbers[middle] == guess)
      {
        return middle + 1;
      }
      else if (numbers[middle] < guess)
      {
        return binarySearch(numbers, middle + 1, end, guess);
      }
      else
      {
        return binarySearch(numbers, start, middle - 1, guess);
      }

    }
    return -1;
  }

  public static void main(String[] args)
  {
    int wins = 0; //initializing variables
    int losses = 0;
    boolean run = true; //while true program runs
    while (run)
    {
      // Declaring variables
      int[] numbers = new int[100]; //array for storing a 100 numbers
      Scanner kb = new Scanner(System.in);
      String answer;
      int upperBound = 999;
      int lowerBound = 100;
      int guess;

      for (int i = 0; i < numbers.length; i++) //for loops for getting all the random numbers
      {
        numbers[i] = lowerBound + (int) (Math.random() * (upperBound - lowerBound + 1));
        //equation for the random numbers in the array
      }

      //bubbleSort(numbers);
      selectionSort(numbers);
      for(int i=0; i < numbers.length; i++)
      {  
        System.out.print(numbers[i] + " ");  
      }  

      System.out.println("Guess a number 100 - 999"); //prompts the user to enter their guess
      guess = kb.nextInt();

      if (binarySearch(numbers,0,99, guess) >= 0) //if statement to tell you if you or you lose 
      //tells you by seeing if there is an index number if not you lose
      {
        System.out.println("You Win!"); // tells you if you win
        wins = 1 + wins; // adds to your wins
      }
      else // if -1 is returned does the following
      {
        System.out.println("You lose"); // tells you if you lose
        losses = 1 + losses; // adds to your losses
      }
      System.out.print(""); // throw away line since scanner needs it in order to let you type next time
      kb.nextLine();

      System.out.println("Do you want to gamble? "); // asks if you want to continue the program
      answer = kb.nextLine(); // Scanner variable

      if (answer.equalsIgnoreCase("Yes")) // If the answer is Yes you do the program again
      {
      }
      else if (answer.equalsIgnoreCase("No")) // If answer is no you exit
      {
        run = false; //sets run to false to stop program
        System.out.println("Your wins: " + wins); // prints your total amount of wins
        System.out.println("Your losses: " + losses); // prints your total amount of losses

      }
    }
  }
}
