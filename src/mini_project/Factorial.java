package Mini_Project;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input hasil faktorial yang ingin dicari
        System.out.print("Masukkan nilai faktorial: ");
        int target = scanner.nextInt();

        int factorial = 1;
        int result = 1;

        // Loop untuk menghitung faktorial
        for (int i = 1;; i++) {
            result *= i;
            /*
             * 1 x 1 = 1
             * 1 x 2 = 2
             * 2 x 3 = 6
             * 6 x 4 = 24
             * 24 x 4 = 120
             * Konsep perhitungan matematika
             */
            if (result == target) {
                factorial = i;
                System.out.println(factorial);
                break;
            } else if (result > target) {
                System.out.println("lebih");
            }
        }

        // while(factorial<target){

        // }
    }
}
