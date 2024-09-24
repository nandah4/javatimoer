package object_oriented_programming.inheritances;

/*
 *  Inheritance adalah konsep dalam oop di mana subclass mewarisi attribute dan method superclass
 */
class Kendaraan {
    String jenis;
    String warna;

    void bergerak(String name) {
        System.out.println(this.jenis + " " + name + " dapat bergerak");
    }
}

class Mobil extends Kendaraan {
    int jml_pintu;

    @Override
    /*
     * Override sama dengan mendeklarasikan ulang method dari parent class,
     * Setelah melakukan override method dari subclass maka sudah tidak bisa
     * mengakses method dari parent
     */
    void bergerak(String name) {
        // Hanya bisa memodifikasi return atau sout nya
        System.out.println(name + " berbelok ke kiri");
    }
}
