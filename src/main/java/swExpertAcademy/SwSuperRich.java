package swExpertAcademy;

import java.util.Scanner;

public class SwSuperRich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for (int t = 1; t <= testCase; t++) {
            int[] arr = new int[sc.nextInt()];

            for (int n = 0; n < arr.length; n++)
                arr[n] = sc.nextInt();

            long sum = 0;
            int max = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                if (max < arr[i])
                    max = arr[i];
                else {
                    sum += (max - arr[i]);
                }
            }

            System.out.println("#" + t + " " + sum);
        }
    }
}
