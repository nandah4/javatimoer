package basic.a_datatype.operator;

public class Operator {
    public static void main(String[] args) {
        /*
         * Operator adalah simbol yang digunakan untuk melakukan operasi pada variabel
         * atau nilai
         */

        // Operator aritmatika untuk melakukan operasi matematika
        System.out.println(10 + 10 - 5 + 10 / 5 % 9);

        // Operator Penugasan untuk menetapkan nilai ke variabel
        double myDuble = 90.88;
        myDuble += 10;
        System.out.println("Assignment : " + myDuble);

        // Operator perbandingan
        System.out.println(10 == 10);

        // Operator Increment
        int a = 10;
        System.out.println(a++);
        System.out.println(a);

        // Operator Bitwise
    }
}
