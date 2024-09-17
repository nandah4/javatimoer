package basic.d_method;

public class MethodReturn {
    /*
     * Method Return Value
     * - Secara default method tidak mengembalikan nilai apapun
     * - Agar method mengembalikan value, ubah keyword void menjadi tipe data yang
     * ingin dihasilkan
     * 
     */

    // Method Return Value
    static int number(int numberA, int numberB) {
        int operation = numberA + numberB;
        return operation;
    }

    public static void main(String[] args) {
        System.out.println(number(7, 1));
        System.out.println("Test");
    }
}
