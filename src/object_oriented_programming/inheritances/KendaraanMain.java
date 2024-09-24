package object_oriented_programming.inheritances;

public class KendaraanMain {
    public static void main(String[] args) {
        // Instance dari parent class
        // mobil1.jenis = "Pesawat";
        // mobil1.warna = "Putih";
        // mobil1.bergerak("Garuda Indonesia");
        // System.out.println(mobil1.myNumber());
        Kendaraan mobil1 = new Kendaraan("Kapal Laut", "Blue");
        mobil1.bergerak("Harmony");

        System.out.println("");

        // Instance dari subclass
        // mobil2.jenis = "Mobil";
        // mobil2.warna = "Yellow";
        // mobil2.jml_pintu = 2;
        // mobil2.bergerak("Mc Larren 90s");
        // mobil2.getMethodParent("Lamborghini");
        // mobil2.getMyNumber();
        Mobil mobil2 = new Mobil("Mobil", "Red", 2);
        mobil2.bergerak("Toyota");

    }
}
