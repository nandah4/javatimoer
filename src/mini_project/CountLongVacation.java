package mini_project;

import java.util.Scanner;

public class CountLongVacation {
    static Scanner input = new Scanner(System.in);
    static int option;
    static String optionInner = "";

    static void hitungTanggalPulang() {
        // .equals untuk membandingkan apakah kedua variabel memiliki nilai yang sama
        do {
            if (!optionInner.equals("x") || optionInner.equals("a")) {
                System.out.print("Masukkan tanggal berangkat anda : ");
                int tanggalBerangkat = input.nextInt();
                System.out.print("Masukkan bulan berangkat anda : ");
                int bulanBerangkat = input.nextInt();
                System.out.print("Masukkan tahun berangkat anda : ");
                int tahunBerangkat = input.nextInt();

                System.out.println(
                        "Hasil anda : " + tahunBerangkat + " " + bulanBerangkat + " " + tanggalBerangkat + "\n");

                System.out.print("Close (x) or Continue (a) : ");
                optionInner = input.next();
                System.out.println("");
            } else {
                System.out.println("Keluar dari Hitung tanggal pulang");
            }

        } while (!optionInner.equals("x") && optionInner.equals("a"));
    }

    public static void main(String[] args) {

        System.out.println("------------ HITUNG LAMA LIBURAN ANDA ------------\n");
        System.out.println("Information : ");
        System.out.println("Sistem ini mengambil 360 hari dalam 1 tahun \n");

        do {
            System.out.println("1. Hitung tanggal pulang");
            System.out.println("2. Hitung lama hari");
            System.out.print("Masukkan Pilihan Anda : ");
            option = input.nextInt();
            if (option == 1) {
                hitungTanggalPulang();
                optionInner = ""; // reset optionInner
            } else {
                break;
            }
        } while (option != 2);

    }
}
