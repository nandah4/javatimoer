package basic.a_datatype.casting;

import java.util.Scanner;

public class CastingType {
    public static void main(String[] args) {
        /*
         * Casting (Penukaran Tipe Data) Untuk mengkonversi tipe data dari tipe data
         * satu ke yang lain
         * 
         * 2 Cara umum yaitu widening dan narrowing.
         * - Widening casting terjadi ketika ingin mengkonversi tipe data yang lebih
         * kecil ke tipe data yang lebih besar
         * - Narrowing casting terjadi ketika ingin mengkonversi tipe data yang lebih
         * besar ke
         * tipe data yang lebih kecil.
         */

        // Widening casting
        byte myByte = 100;
        short myShort = myByte;
        double myDouble = myShort;
        System.out.println(myShort);
        System.out.println(myDouble);

        // Narrowing Casting
        float myFloat = 91.9192f;
        int myCastInt = (int) myFloat;
        System.out.println(myFloat);
        System.out.println(myCastInt);
    }
}
