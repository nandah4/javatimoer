package object_oriented_programming.isclass;

public class Animal {
    String colour;
    String name;
    boolean isMamalia;

    void running() {
        System.out.println(name + " berlari");
    }

    public static void main(String[] args) {
        Animal kucing = new Animal();
        kucing.name = "Kucing";

        kucing.running();
    }
}
