import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        Sorted sorted = new Sorted();

        sorted.insertionSort(numbers);
        sorted.selectionSort(numbers);
    }
    void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[minIndex] > a[j])
                    minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            //A[0..i-1]에 a[i]를 끼워넣는다.
            int j = i;
            while (j > 0 && a[j-1] > a[j]) {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                --j;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
