package mini_project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
         * Calculator
         */
        Scanner scanInput = new Scanner(System.in);

        System.out.println("-------    Calculator Mini     ------- \n");

        String name;
        do {
            System.out.println("Masukkan Nama Anda");
            name = scanInput.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println("Nama tidak boleh kosong!");
            }

        } while (name.trim().isEmpty());
        System.out.println("Selamat datang, " + name);

        int option;
        double operand1, operand2, result = 0;
        do {
            System.out.println("Operasi Aritmatika");
            System.out.println("1. (+) Penjumlahan");
            System.out.println("2. (-) Pengurangan");
            System.out.println("3. (x) Perkalian");
            System.out.println("4. (:) Pembagian");
            System.out.println("5. (%) Modulus");
            System.out.println("6. Close ");
            System.out.println("Masukkan Operasi Aritmatika Anda : ");
            option = scanInput.nextInt();

            if (option >= 1 && option < 6) {
                System.out.println("Masukkan Operand 1 :");
                operand1 = scanInput.nextInt();
                System.out.println("Masukkan Operand 2 :");
                operand2 = scanInput.nextInt();
                switch (option) {
                    case 1:
                        result = operand1 + operand2;
                        break;
                    case 2:
                        result = operand1 - operand2;
                        break;
                    case 3:
                        result = operand1 * operand2;
                        break;
                    case 4:
                        if (operand1 != 0) {
                            result = operand1 / operand2;
                        } else {
                            System.out.println("Tidak dapat dibagi dengan 0");
                            break;
                        }
                        result = operand1 + operand2;
                        break;
                    case 5:
                        result = operand1 % operand2;
                        break;
                    default:
                        break;
                }
            } else if (option == 6) {
                System.out.println("Program ditutup");
                break;
            } else {
                System.out.println("Pilihan anda tidak sesuai");
                break;
            }

            System.out.println("Hasil Akhir " + result + "\n");

        } while (option != 6);

        scanInput.close();

    }
}
