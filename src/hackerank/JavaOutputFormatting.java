package Hackerank;

import java.util.Scanner;

public class JavaOutputFormatting {
    /*
     * printf dalam Java adalah untuk mencetak teks ke output dengan format yang
     * ditentukan. Ini memungkinkan kontrol lebih rinci terhadap bagaimana data,
     * seperti string, angka, atau objek, ditampilkan. Dengan printf, kamu dapat
     * mengatur tata letak (alignment), lebar tampilan, jumlah desimal, dan
     * menambahkan elemen seperti padding dengan karakter tertentu.
     * 
     * % diikuti oleh karakter format yang menunjukkan bagaimana objek berikutnya
     * akan diformat.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // Complete this line
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
        FormattedPrint();
    }

    static void FormattedPrint() {
        int number = 10;
        double doubleNum = 10.3;
        String name = "John Doe";

        System.out.printf("number : %d%n", number);
        System.out.printf("double : %f%n", doubleNum);

    }
}
