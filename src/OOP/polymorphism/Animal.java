package OOP.polymorphism;

class Animal {
    String animalType;

    Animal(String animalType) {
        this.animalType = animalType;
    }

    void voice(String voice) {
        System.out.println(this.animalType + " suaranya " + voice);
    }
}

class Kucing extends Animal {
    Kucing(String animalType) {
        super(animalType);
    }
}

class Kambing extends Kucing {
    Kambing(String animalType) {
        super(animalType);
    }

}
