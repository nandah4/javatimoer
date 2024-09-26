package studi_case.zoo_management;

class Animal {
    /*
     * Deskripsi Kasus:
     * Anda diminta untuk mengembangkan sistem manajemen hewan untuk sebuah kebun
     * binatang. Kebun binatang ini memiliki berbagai jenis hewan dengan
     * karakteristik yang berbeda. Anda harus mendesain beberapa kelas yang mewakili
     * hewan-hewan tersebut, serta memungkinkan pengelola kebun binatang untuk
     * mencatat suara khas dari setiap hewan.
     * 
     */

    String name;
    String species;
    int age;

    Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    void voiceAnimal() {
        System.out.println(name + " spesies dari " + species + ", memiliki suara");
    }
}

class Lion extends Animal {
    Lion(String name, String species, int age) {
        super(name, species, age);
    }

    void voiceAnimal() {
        super.voiceAnimal();
    }

}
