package mini_project;

import java.util.Scanner;

public class CountLongVacation {
    static Scanner input = new Scanner(System.in);
    static int option;
    static String optionInner = "";

    static void hitungTanggalPulang() {
        // .equals untuk membandingkan apakah kedua variabel memiliki nilai String yang
        // sama bukan referensi ke object yang sama
        do {
            if (!optionInner.equals("x") || optionInner.equals("a")) {
                int tanggalBerangkat, bulanBerangkat, tahunBerangkat;
                do {
                    System.out.print("Masukkan tanggal berangkat anda : ");
                    tanggalBerangkat = input.nextInt();

                    if (tanggalBerangkat < 1 || tanggalBerangkat > 30) {
                        System.out.println("Tanggal tidak boleh kurang dari 1 dan lebih dari 30");
                    }

                } while (tanggalBerangkat < 1 || tanggalBerangkat > 30);

                do {
                    System.out.print("Masukkan bulan berangkat anda : ");
                    bulanBerangkat = input.nextInt();

                    if (bulanBerangkat < 1 || bulanBerangkat > 12) {
                        System.out.println("Bulan tidak boleh kurang dari 1 dan lebih dari 12");
                    }
                } while (bulanBerangkat < 1 || bulanBerangkat > 12);

                do {
                    System.out.print("Masukkan tahun berangkat anda : ");
                    tahunBerangkat = input.nextInt();

                    if (tahunBerangkat < 1) {
                        System.out.println("Tahun berangkat tidak boleh kurang dari 1");
                    }
                } while (tahunBerangkat < 1);

                System.out.println(
                        "Tanggal berangkat anda : " + tanggalBerangkat + "-" + bulanBerangkat + "-" + tahunBerangkat);

                System.out.print("Close (x) or Continue (a) : ");
                optionInner = input.next();
                System.out.println("");
            } else {
                System.out.println("Anda keluar dari Hitung tanggal pulang");
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
