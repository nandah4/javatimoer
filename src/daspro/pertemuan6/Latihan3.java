package daspro.pertemuan6;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Merek Sepatu (Converse, Sketcher, Nike): ");
        String merkSepatu = sc.nextLine().toLowerCase();
        System.out.println("1. Converse (Slip On, High Top)");
        System.out.println("2. Sketcher (Woman, Man)");
        System.out.println("3. Nike (Kids, Adult)");
        System.out.print("Pilih kategori Anda : ");
        int size = sc.nextInt();
        String kategori = sc.nextLine().toLowerCase();
        System.out.print("Pilih ukuran Anda : ");

        double hargaSepatu = 0;

        if (merkSepatu.equals("converse")) {
            if (kategori.equals("slip on")) {
                if (size >= 36 && size <= 40) {
                    hargaSepatu = 800000;
                } else if (size > 40 && size <= 44) {
                    hargaSepatu = 1200000;
                } else {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
            } else if (kategori.equals("high top")) {
                if (size >= 36 && size <= 40) {
                    hargaSepatu = 800000;
                } else if (size > 40 && size <= 44) {
                    hargaSepatu = 1200000;
                } else {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
            } else {
                System.out.println("Kategori tidak sesuai");
            }
        } else if (merkSepatu.equals("sketcher")) {
            if (kategori.equals("woman")) {
                if (size >= 36 && size <= 41) {
                    hargaSepatu = 1000000;
                } else if (size > 41 && size <= 44) {
                    hargaSepatu = 1800000;
                } else {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
            } else if (kategori.equals("man")) {
                if (size >= 36 && size <= 41) {
                    hargaSepatu = 1000000;
                } else if (size > 41 && size <= 44) {
                    hargaSepatu = 1800000;
                } else {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
            } else {
                System.out.println("Kategori tidak sesuai");
            }
        } else if (merkSepatu.equals("nike")) {
            if (kategori.equals("kids")) {
                if (size >= 36 && size <= 40) {
                    hargaSepatu = 750000;
                } else if (size > 40 && size <= 44) {
                    hargaSepatu = 1500000;
                } else {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
            } else if (kategori.equals("adult")) {
                if (size >= 36 && size <= 40) {
                    hargaSepatu = 750000;
                } else if (size > 40 && size <= 44) {
                    hargaSepatu = 1500000;
                } else {
                    System.out.println("Ukuran sepatu tidak sesuai");
                }
            } else {
                System.out.println("Kategori tidak sesuai");
            }
        } else {
            System.out.println("Merek sepatu tidak sesuai");
        }
        System.out.print("Harga sepatu anda : " + hargaSepatu);

        sc.close();
    }
}
