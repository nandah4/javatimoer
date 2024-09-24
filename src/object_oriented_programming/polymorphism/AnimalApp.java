package object_oriented_programming.polymorphism;

public class AnimalApp {
    public static void main(String[] args) {
        /*
         * Polymorpism / banyak bentuk
         */
        Animal animal = new Animal("Sapi");
        animal.voice("Moooo!");

        animal = new Kucing("Kucing");
        animal.voice("Meowww!");

        animal = new Kambing("Kambing");
        animal.voice("Mbeeee!");

        sayEat(new Kucing("Kucing"));
    }

    // method
    static void sayEat(Animal animal) {
        System.out.println("Say Eat animal " + animal.animalType);
    }
}
