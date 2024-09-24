package object_oriented_programming.inheritances;

public class KendaraanMain {
    public static void main(String[] args) {
        // Instance dari parent class
        Kendaraan mobil1 = new Kendaraan();
        mobil1.jenis = "Pesawat";
        mobil1.warna = "Putih";
        mobil1.bergerak("Garuda Indonesia");

        System.out.println("");

        // Instance dari subclass
        Mobil mobil2 = new Mobil();
        mobil2.jenis = "Mobil";
        mobil2.warna = "Yellow";
        mobil2.jml_pintu = 2;
        mobil2.bergerak("Mc Larren 90s");
        // System.out.println(mobil2.jenis + " " + mobil2.warna + " dengan jumlah pintu
        // " + mobil2.jml_pintu);
    }
}
