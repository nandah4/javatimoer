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

    // Constructor Overloading (Membuat constructor lain dengan params berbeda)
    Person(String paramsName) {
        // Calling constructor lain dengan keyword this
        this(paramsName, null);
    }

    Person() {
        this(null);
    }

    void sayHello() {
        this.sayHello("Popa"); // Memanggil method sayHello dengan def params
    }

    // Method
    void sayHello(String paramsName) {
        System.out.println("Hello " + paramsName + ", My name is " + this.name + " from " + this.addres);
    }

}
