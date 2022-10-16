/*
Saurya Nannapaneni
Feb 24 
The purpose of this program is to be able to shuffle, swap, display and add diagonals of a 2d array
 */
package nannapaneni2d;

import java.util.Scanner;

/**
 *
 * @author Saurya21
 */
public class Nannapaneni2D
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    //declaring variables
    int SIZE1 = 5;
    int SIZE2 = 5;
    int[][] twoD = new int[SIZE1][SIZE2]; // 2darray
    int start = 0;
    
    Scanner kb = new Scanner(System.in);
    int guess;

    for (int i = 0; i < SIZE1; i++) // rows
    {
      for (int j = 0; j < SIZE2; j++) // columns
      {
        twoD[i][j] = start; // adds number 2darray
        start++; // increases number by 1
      }
    }

    // displays methods and displays 2darray after
    System.out.println("Unsorted");
    Display(twoD);
    
    Shuffle(twoD);
    System.out.println("Shuffled");
    Display(twoD);

    System.out.println("0 and 2 swapped");
    Swap(twoD, 0, 2);
    Display(twoD);

    System.out.println("1 and 4 swapped");
    Swap(twoD, 1, 2);
    Display(twoD);

    System.out.print("Please input a guess for the sum of diagonals: ");
    guess = kb.nextInt();
    Add(twoD, guess);
  }

  // displays 2d array
  public static void Display(int[][] twoD)
  {
    //loops through whole array
    for (int i = 0; i < twoD.length; i++)
    {
      for (int j = 0; j < twoD[0].length; j++)
      {
        System.out.print(twoD[i][j] + "\t"); // prints number in each index and evenly seperates them
      }
      System.out.println(); // new row
    }
    System.out.println(); // used to add space between two different arrays
  }

  // shuffles array
  public static void Shuffle(int[][] twoD)
  {
    //loops through whole array
    for (int i = 0; i < twoD.length; i++)
    {
      for (int j = 0; j < twoD.length; j++)
      {
        // random number
        int rand = (int) (Math.random() * twoD.length - 1);

        // used to swap numbers around and also prevents repeated nubmers
        int temp = twoD[i][j];
        twoD[i][j] = twoD[rand][rand];
        twoD[rand][rand] = temp;
      }
    }
  }

  // swaps rows
  public static void Swap(int[][] twoD, int a, int b)
  {
    //loops through columns
    for (int i = 0; i < twoD.length; i++)
    {
      // used to swap each number one by one | column is looped, row is given
      int temp = twoD[i][a];
      twoD[i][a] = twoD[i][b];
      twoD[i][b] = temp;
    }
  }

  // adds diagonals
  public static void Add(int[][] twoD, int guess)
  {
    int total = 0;

    for (int i = 0; i < twoD.length; i++)
    {
      //adds first diagonals and then goes to other diagonal and adds to total11
      total += twoD[i][i] + twoD[i][twoD.length - i - 1];
    }
    
   // System.out.println(total);
    
   // checks if guess is greater than, less than, or equal to result
    if (guess > total)
    {
      System.out.println("Guess is higher than result");
    }
    else if (guess < total)
    {
      System.out.println("Guess is lower than result");
    }
    if (guess == total)
    {
      System.out.println("Guess is equal to result");
    }
  }
}

