package object_oriented_programming.isclass;

class Person {
    // Field
    String name;
    String addres;
    final String country = "Indonesia";

    /*
     * Method yang pertama kali dipanggil ketika object pertama kali dibuat
     * Constructor memaksa object untuk mengisi beberapa field
     */

    Person(String paramsName, String paramsAddres) {
        this.name = paramsName;
        this.addres = paramsAddres;
    }

    // Constructor Overloading (Membuat constructor lain dengan nama sama tapi
    // dengan params berbeda)
    Person(String paramsName) {
        // Calling constructor lain dengan keyword this
        this(paramsName, null);
    }

    Person() {
        this(null);
    }

    void sayHello() {
        this.sayHello("Default"); // Memanggil method sayHello dengan default params
    }

    // Method
    void sayHello(String name) {
        // keyword this untuk sbg solusi untuk variabel shadowing
        System.out.println("Hello " + name + ", My name is " + this.name + " from " + this.addres);
    }

}
