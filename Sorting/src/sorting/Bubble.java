/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Saurya21
 */
public class Bubble
{
  void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
      long start = System.nanoTime();
        Bubble ob = new Bubble();
        int arr[] = {12, 11, 13, 5, 6, 7};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        long end = System.nanoTime();
        long elapsedTime = end - start; 
        System.out.println(elapsedTime);
    }
}

