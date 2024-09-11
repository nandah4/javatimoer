package third_methods;

public class Methods {

    public String myMethod(String name) {
        return name;
    }

    public static int myNumber(int a, int b) {
        return a + b;
    }

    static void Name(String name) {
        System.out.println("Nama saya : " + name);
    }

    static int sum(int a, int b) {
        int total = a + b;
        return total;

    }

    public static void main(String[] args) {
        // Name("Ananda");
        var c = sum(2, 3);
        System.out.println(c);

        // Methods obj = new Methods();
        // System.out.println(obj.myMethod("Nanda\t"));
        // System.out.println(myNumber(1, 39));
    }

}
