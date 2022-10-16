
import java.util.Scanner;

/* Saurya Nannapaneni 25/10/19
This program models the term project */
/**
 *
 * @author Saurya21
 */
public class TestArray3
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double[] a = new double[100];
        double[] b = new double[100];
        double[] c = new double[100];
        int response;
        int counter = 0;
        boolean exit = false;

        while (exit == false)
        {
            System.out.print("Choose 1 to calculate a, Choose 2 to calculate b, Choose 3 to calculate c: or 4 to exit ");
            response = kb.nextInt();

            if (response == 1)
            {
                System.out.print("Enter b: ");
                b[counter] = kb.nextDouble();
                System.out.print("Enter c: ");
                c[counter] = kb.nextDouble();
                a[counter] = b[counter] * c[counter];
                System.out.println("The a is " + a[counter]);
                counter++;
            }
            else
            {
                 if (response == 2)
                {
                    System.out.print("Enter a: ");
                    a[counter] = kb.nextDouble();
                    System.out.print("Enter c: ");
                    c[counter] = kb.nextDouble();
                    b[counter] = a[counter] / c[counter];
                    System.out.println("The b is " + b[counter]);
                    counter++;
                }
                else
                {
                    if (response == 3)
                    {
                        System.out.print("Enter a: ");
                        a[counter] = kb.nextDouble();
                        System.out.print("Enter b: ");
                        b[counter] = kb.nextDouble();
                        c[counter] = a[counter] / b[counter];
                        System.out.println("The c is " + c[counter]);
                        counter++;
                    }
                    else
                    {
                        if (response == 4)
                        {
                            exit = true;
                        }
                        else
                        {
                            System.out.println("Invalid entry: get a life");
                        }
                        
                    }
                    
                    System.out.println("Thank you for using my lovely product! Have a nice day");
                    System.out.println("BTW, below is a summary of your data");
                    for (int i = 0; i < counter; i++)
                    {
                        System.out.println("a = " + a[i]);
                        System.out.println("b = " + b[i]);
                        System.out.println("c = " + c[i]);
                        {
                        }
                    }

                }
            }
        }
    }
}
