package condition_2;

public class ElseIf {
    public static void main(String[] args) {
        int nilaiTugas = 710;
        int nilaiUTS = 801;
        int nilaiUAS = 710;

        float nilaiAkhir = (30 * nilaiTugas / 100) + (30 * nilaiUTS / 100) + (40 * nilaiUAS / 100);
        String nilaiHuruf = "";

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73 && nilaiAkhir <= 79) {
            nilaiHuruf = "B";
        } else {
            nilaiHuruf = "Score is not valid";
        }

        System.out.println("Anda Mendapatkan nilai huruf : " + nilaiHuruf);
        System.out.println("Rata-rata anda : " + nilaiAkhir);
        System.out.println("=============================================");
        System.out.println("Switch Case");

        int currentPage = 4;

        switch (currentPage) {
            case 1:
                System.out.println("Anda berada di halaman " + currentPage);
                break;
            case 2:
                System.out.println("Anda berada di halaman " + currentPage);
                break;
            case 3:
                System.out.println("Anda berada di halaman " + currentPage);
                break;
            default:
                System.out.println("Page not found");
                break;
        }

    }

}
