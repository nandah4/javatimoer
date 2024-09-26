package studi_case.daspro5;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama makanan ");
        String namaMakanan = input.nextLine();
        System.out.print("Masukkan harga makanan ");
        int hargaMakanan = input.nextInt();
        System.out.println("Masukkan jumlah Makanan");
        int junlahMakanan = input.nextInt();

        double totalBelanja = (hargaMakanan * junlahMakanan);
        double diskon = 0;

        if (totalBelanja > 500000) {
            diskon = totalBelanja * 0.1;
        } else if (totalBelanja > 200000) {
            diskon = totalBelanja * 0.05;
        } else if (totalBelanja > 100000) {
            diskon = totalBelanja * 0.02;
        } else {
            System.out.println("Anda tidak mendapat diskon");
        }

        totalBelanja = totalBelanja - diskon;

        System.out.println("Total Belanja Anda : " + totalBelanja);

        // Scanner input = new Scanner(System.in);
        // int userInput = input.nextInt();
        // int result = 1;

        // for (int v = userInput; v > 1; v--) {
        // result *= v;
        // }

        // System.out.println(userInput + " adalah faktorial dari " + result);

        // // int inputUser = input.nextInt(); // Mengambil input dari user
        // int factorial = 1; // Variabel yang menyimpan output hasil factorial
        // int number = 1; // Nilai patokan yang dijadikan kondisi di dalam for loop

        // for (int index = 1;; index++) {
        // // Dalam for loop tidak dikasi kondisi agar perulangan berjalan terus
        // // menerus,
        // // dan akan berhenti
        // number *= index;
        // // number = number x index
        // /*
        // * 1 = 1 x 1
        // * 1 = 1 x 2
        // * 2 = 2 x 3
        // * 6 = 6 x 4
        // * 24 = 24 x 5
        // */

        // if (result == number) {

        // factorial = index; // Ketika kondisi di atas memenuhi maka var factorial akan
        // // diperbarui indexnya.
        // System.out.println("Kembalian dari factorial " + result + " adalah " +
        // factorial);
        // break;
        // } else if (number > result) {
        // System.out.println("Output tidak dapat ditentukan");
        // break;
        // }

        // }
    }
}
