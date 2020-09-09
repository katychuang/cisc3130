// Example of Bubble Sort Algorithm
// This algorithm compares pairs of elements.

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int tmp;
        int[] a = {3,2,7,1,5,2,6};
        System.out.println("The starting input array is " + Arrays.toString(a) + "\n");

        int n = a.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++){

                if (a[j+1] < a[j]) {  /* compare the two neighbors */
                    System.out.print("Swapping " + j + ", " + (j+1));
                    tmp = a[j];       /* swap a[j] and a[j+1]   */
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    System.out.println("\t " + Arrays.toString(a));
                }

            }
        }
        System.out.println("\nThe sorted algorithm is " + Arrays.toString(a));
    } // end main method
} // end BubbleSort class
