/*
Saurya Nannapaneni
Friday August 20th
This program generates random number and stores them in array 
then the user will be able to guess if their number is there

Pseudocode:
1. Create a method that sorts the numbers in array from lowest to highest
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
//package lotto;

import java.util.Scanner;

public class Lotto2
{
// method to find if numbers are in array 
// Pre Condition: Array can't be null must have something in array
//  public static int linearSearch(int[] numbers, int guess)
//  {
//    for (int i = 0; i < numbers.length; i++) // for loop to look for the numbers by going 1 by 1
//    {
//      if (numbers[i] == guess) // if statement to determine if the number is there
//      {
//        return i; // returns with the index position
//      }
//    }
//    return -1; // returns -1 if false
//  }
  // Post Condition: Returns with index number or with -1 if the guess is not found

  // method to sort numbers that are in array
  // Pre Condition: Array can't be null and has to have integers
  public static void selectionSort(int[] numbers)
  {
    for (int i = 0; i < numbers.length - 1; i++)  // for loop for array ON^2
    {
      // Find the minimum item in unsorted array
      int min = i;
      for (int j = i + 1; j < numbers.length; j++) // for loop to look for the smallest numbers
      {
        if (numbers[j] < numbers[min]) // sets new minimum if found
        {
          min = j;
        }
      }

      // Swap the found minimum item with the other one
      int temp = numbers[min];
      numbers[min] = numbers[i];
      numbers[i] = temp;
    }
  }
  //Post Condition: All the items in the array should be sorted from lowest to highest

  // method to sort arrays
  // Pre Condition: Array can't be null and has to have integers
  public static void bubbleSort(int[] numbers)
  {
    for (int i = 0; i < numbers.length - 1; i++) //for loop to go through array  ON^2
    {
      for (int j = 0; j < numbers.length - i - 1; j++) // for loop for swapping numbers
      {
        if (numbers[j] > numbers[j + 1]) // if statement to see if a number is bigger than the one next to it
        {
          // swap numbers in array
          int temp = numbers[j]; // temp to store numbers when being swapped
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
        }
      }
    }
  }
  //Post Condition: All the items in the array should be sorted from lowest to highest

  public static int binarySearch(int[] numbers, int guess)
  {
    //declaring variables
    int min = 0;
    int high = numbers.length - 1;
    
    while (min <= high) // while loop to keep going until the minimum is greater than the highest
    {
      int mid = (min + high) / 2; // finds mid
      if (guess == numbers[mid]) //if guess is the middle returns middle
      {
        return mid; // returns mid
      }
      else if (guess < numbers[mid]) //if guess is lower than mid 
      {
        high = mid - 1; // lowers high by 1 to find number
      }
      else if (guess > numbers[mid]) // if guess is higer than the middle
      {
        min = mid + 1; //highers min by 1 to find number
      }
    }
    return -1; // if nothing found returns -1
  }
  //Post Condition: Find guess by having both start and end in same place or returns -1

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
      int UPPER_BOUND = 999;
      int LOWER_BOUND = 100;
      int guess;

      for (int i = 0; i < numbers.length; i++) //for loops for getting all the random numbers
      {
        numbers[i] = LOWER_BOUND + (int) (Math.random() * (UPPER_BOUND - LOWER_BOUND + 1));
        //equation for the random numbers in the array
      }

      //bubbleSort(numbers);
      selectionSort(numbers);

      System.out.println("Guess a number 100 - 999"); //prompts the user to enter their guess
      guess = kb.nextInt();

      //if statement to tell you if you or you lose 
      //tells you by seeing if there is an index number if not you lose
      if (binarySearch(numbers, guess) >=0)
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
