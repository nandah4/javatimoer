package basic.d_method;

public class MethodVariableArgument {
    /*
     * Method variabel argument adalah metode yang memungkinkan untuk menerima
     * jumlah argumen yang tidak pasti
     */
    public static void main(String[] args) {
        /*
         * Without VarArgs
         * int[] values = { 90, 20, 90, 32, 100 };
         * nilaiAkhir("Jormung", values);
         */

        // With VarArgs
        nilaiAkhir("Jormung", 0);
    }

    // With VarArgs
    static void nilaiAkhir(String name, int... values) {
        int total = 0;

        for (int num : values) {
            total += num;
        }

        double finalTotal = total / values.length;

        if (finalTotal >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus!");
        } else {
            System.out.println("Mohon maaf " + name + ", Anda tidak lulus");
        }
    }

    /*
     * Without Varargs
     * static void nilaiAkhir(String name, int[] values) {
     * int total = 0;
     * 
     * for (int num : values) {
     * total += num;
     * }
     * 
     * double finalTotal = total / values.length;
     * 
     * if (finalTotal >= 75) {
     * System.out.println("Selamat " + name + ", Anda lulus!");
     * } else {
     * System.out.println("Mohon maaf " + name + ", Anda tidak lulus");
     * }
     * }
     */
}
