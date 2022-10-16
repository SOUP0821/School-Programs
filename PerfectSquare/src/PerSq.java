
import java.util.ArrayList;
import java.util.Scanner;

public class PerSq
{
  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in); //Declaring Scanner
    ArrayList<Integer> prime = new ArrayList<Integer>(); //Array list to store prime numbers
    ArrayList<Integer> result = new ArrayList<Integer>(); // Array list to store new array shown later
    int number; // users number
    int one = 1; // used to multiply the result array

    System.out.println("number*n = in to a perfect a square"); // explains the program
    System.out.println("Please input a number to find the n: "); // prompts the user
    number = kb.nextInt();

    for (int i = 2; i < number; i++) // for loop to find the prime factors starts at 2 because 1 will always be mentioned
    {
      while (number % i == 0) // goes through numbers to find the prime numbers and see if the number is divisble by it 
      {
        number = number / i; // divides the number by the prime factor to find other prime factos
        prime.add(i); // adds it to the array list
      }
    }
    if (number > 2) // used to handle if prime number is biger than 2
    {
      prime.add(number);// adds number if bigger than 2
    }

    for (int i = 0; i < prime.size(); i++)
    {
      int count = 0;
      for (int j = 0; j < prime.size(); j++)
      {
        if (prime.get(i) == prime.get(j))
        {
          count++;
        }
      }
      if (count % 2 != 0)
      {
        result.add(prime.get(i));
      }
    }

    System.out.println(result);
    for (int i = 0; i < result.size(); i++) // for loop to multiply arraylist
    {
      one *= result.get(i); // multiplies array
    }
    System.out.println("n is " + one); // prints n
  }
}
