package basic.e_scanner;

import java.util.Scanner;

public class ScannerUtil {
    public static void main(String[] args) {
        /*
         * Scanner adalah class reference yang disediakan oleh java untuk membaca
         * input dari keyboard, file, dan string dari user.
         */

        Scanner scan = new Scanner(System.in);
        String name = "John Doe";
        int option = 0;

        System.out.println("Selamat Datang di Toko El Gasing\n");
        System.out.println("Masukkan Nama Anda : ");
        if (scan.hasNextLine()) {
            name = scan.nextLine();
        } else {
            System.out.println("Input tidak sesuai");
        }
        System.out.println("Selamat Datang " + name);
        System.out.println("Anda Ingin memesan apa? ");
        System.out.println("1. Hamburger");
        System.out.println("2. Pizza");
        if (scan.hasNextInt()) {
            option = scan.nextInt();
        } else {
            System.out.println("Input tidak sesuai");
        }
        if (option == 1) {
            System.out.println("Ini Hamburger Anda");
        } else if (option == 2) {
            System.out.println("Ini Pizza Anda");
        } else {
            System.out.println("Menu tidak sesuai");
        }

        scan.close();
    }
}
