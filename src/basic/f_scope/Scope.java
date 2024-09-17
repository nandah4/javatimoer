package basic.f_scope;

public class Scope {

    static void sayGoodbye(String name) {
        String dfMessage = "Selamat Tinggal";
        if (name == "John") {
            String specialMessage = "Hello " + name;
            System.out.println(specialMessage);
        } else {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sayGoodbye("John");
    }
}
