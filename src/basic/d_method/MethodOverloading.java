package basic.d_method;

public class MethodOverloading {
    /*
     * Method Overloading
     * Kemampuan untuk membuat metode dengan nama sayang sama berulang kali, dengan
     * syarat parameter harus berbeda ntah tipe data atau jumlah dari parameternya
     */
    public static void main(String[] args) {
        myNumber();
        myNumber("Jormung");
        myNumber("Jormung ", "Gand");
    }

    static void myNumber() {
        System.out.println("Hello");
    }

    static void myNumber(String fName) {
        System.out.println("Hello " + fName);
    }

    static void myNumber(String fName, String lName) {
        System.out.println("Hello " + fName + lName);
    }

}
