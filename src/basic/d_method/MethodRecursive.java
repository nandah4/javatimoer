package basic.d_method;

public class MethodRecursive {
    /*
     * Method Recursive
     * method atau fungsi memanggil dirinya sendiri untuk solve masalah
     */

    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        overflowStack(10);
    }

    // Contoh Studi kasus factorial

    // Tanpa Recursive
    static int factorialLoop(int number) {
        var total = 1;
        for (int index = 1; index <= number; index++) {
            total *= index;
        }
        return total;
    }

    // Dengan recursive
    static int factorialRecursive(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }

    // Overfolow recursive
    static void overflowStack(int number) {
        if (number == 1) {
            System.out.println("Loop ke " + number + " Selesai");
        } else {
            System.out.println("Loop ke-" + number);
            overflowStack(number - 1);
        }
    }
}
