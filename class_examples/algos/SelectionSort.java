// Example of Selection Sort

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3,2,7,1,5,2,6};
        int n = a.length;
        for (int i=0; i<a.length‐1; i++) {
            int min = i;
            for (int j=i+1; j<a.length; j++){
                if (a[j] < a[min])
                    min = j;
            }
            swap(values, i, min);
        }
    }
}
