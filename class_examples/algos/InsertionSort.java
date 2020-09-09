// Example of Insertion Sort

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {3,2,7,1,5,2,6};
        int n = a.length;
        for (int i=1; i<a.length; i++) {
            int temp = a[i]; int j = i;
            while (j>0 && a[j‐1]>temp) {
                a[j] = a[j‐1];
                j‐‐;
            }
            a[j] = temp;
        }
    }
}
