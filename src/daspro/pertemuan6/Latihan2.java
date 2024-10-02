package daspro.pertemuan6;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan hari : ");
        String hari = sc.nextLine().toLowerCase();
        System.out.print("Masukkan jenis buku ( kamus, novel dan lain-lain ) : ");
        String jenisBuku = sc.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku : ");
        int jumlahBuku = sc.nextInt();

        double diskon;
        if (hari.equals("rabu")) {
            if (jenisBuku.equals("kamus")) {
                diskon = 0.10;
                if (jumlahBuku > 2) {
                    diskon += 0.02;
                }
            } else if (jenisBuku.equals("novel")) {
                diskon = 0.07;
                if (jumlahBuku > 3) {
                    diskon += 0.02;
                } else if (jumlahBuku <= 3) {
                    diskon += 0.01;
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = 0.05;
                }
                diskon = 0;
            }
        } else {
            diskon = 0.0;
        }

        System.out.print("Diskon yang didapat : " + diskon);

        sc.close();
    }
}
