package OOP.inheritances;

/*
 *  Inheritance adalah konsep dalam oop di mana subclass mewarisi attribute dan method superclass
 */
class Kendaraan {
    String jenis;
    String warna;

    Kendaraan(String jenis, String warna) {
        /*
         * Constructor ini memiliki pararms, maka salah satu dari properties wajib
         * diakses dengan method super
         */
        this.jenis = jenis;
        this.warna = warna;
    }

    void bergerak(String name) {
        System.out.println(this.jenis + " " + name + " dapat bergerak");
        System.out.println(this.jenis + " " + warna + " mengkilau");
    }

    // Contoh untuk penerapan super
    // int myNumber() {
    // return 10;
    // }

}

class Mobil extends Kendaraan {
    int jml_pintu;

    Mobil(String jenis, String warna, int jml_pintu) {
        super(jenis, null); // contoh
        this.jml_pintu = jml_pintu;
    }

    @Override
    /*
     * Override sama dengan mendeklarasikan ulang method dari parent class,
     * Setelah melakukan override method dari subclass maka sudah tidak bisa
     * mengakses method dari parent
     */
    void bergerak(String name) {
        // Hanya bisa memodifikasi return atau sout nya
        System.out.println(name + " berwarna " + this.warna + " dapat berbelok ke kiri");
        System.out.println(name + " memiliki " + this.jml_pintu + " pintu");
    }

    void getMethodParent(String name) {
        super.bergerak(name);
        // Keyword keyword untuk mengakses parent method yang di override
    }

    // contoh penerapan keyword super bisa
    // void getMyNumber() {
    // System.out.println(super.myNumber());
    // ;
    // }

}
