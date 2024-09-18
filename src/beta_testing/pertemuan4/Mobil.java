package beta_testing.pertemuan4;

class Cars {
    String merk;
    String warna;

    void Jalankan() {
        System.out.println("Mobil " + merk + " berwarna " + warna + " bisa berjalan");
    }
}

public class Mobil {
    public static void main(String[] args) {
        Cars mobil1 = new Cars();
        mobil1.merk = "Honda";
        mobil1.warna = "Khaki";

        mobil1.Jalankan();
    }
}