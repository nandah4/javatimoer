package object_oriented_programming.isclass;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Speed");
        // person1.name = "John Doe"; // Cara mengubah atau mengakses field di object
        // person1.addres = "Malang";
        // person1.name = "Spiet Maguwoharjo";

        person1.sayHello("Mika"); // Cara mengakses method dalam object
        // System.out.println(person1.name);
    }
}
