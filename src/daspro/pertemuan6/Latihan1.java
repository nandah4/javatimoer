package daspro.pertemuan6;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1 ");
        int bilangan1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2 ");
        int bilangan2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3 ");
        int bilangan3 = sc.nextInt();

        int result;

        if (bilangan1 < bilangan2) {
            result = bilangan2;
            if (result < bilangan3) {
                result = bilangan3;
            }
        } else {
            result = bilangan1;
            if (result < bilangan3) {
                result = bilangan3;
            }
        }

        System.out.println("Bilangan terbesar : " + result);

        sc.close();
    }
}
