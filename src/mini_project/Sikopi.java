package mini_project;

import java.util.Scanner;
import java.util.ArrayList;

public class Sikopi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ArrayList merupakan struktur data yang dinamis ketika ingin menambahkan data
        // baru ke array
        ArrayList<String> myData = new ArrayList<>();
        int option;

        do {
            System.out.println("----- Selamat Datang di Gudang Sikopi -----\n");
            System.out.println("Cek ketersediaan kopi");
            System.out.println("1. Kopi hitam kupu-kupu");
            System.out.println("2. Kopi putih");
            System.out.println("3. Kopi Latte");
            option = input.nextInt();

        } while (option != 4);

    }
}
