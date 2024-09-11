package loop_3;

public class ForLoop {
    public static void main(String[] args) {

        // Pertemuan-1 Latihan 2 Dasar Pemrograman
        int[] numberList = { 4, 7, 2, 9, 3 };
        int minimumNumber = numberList[0];

        for (int index = 1; index < numberList.length; index++) {
            if (numberList[index] < minimumNumber) {
                minimumNumber = numberList[index];
            }
        }
        System.out.println("Angka terkecil : " + minimumNumber);

        // Pertemuan-1 Latihan 3 Dasar Pemrograman
        String[][] huruf = {
                { "r", "R", "B", "r" },
                { "a", "r", "R", "z" },
                { "M", "R", "r", "R" },
                { "R", "O", "t", "r" },
        };

        int totalsR = 0;
        for (int index = 0; index < huruf.length; index++) {
            for (int row = 0; row < huruf[index].length; row++) {
                if (huruf[index][row] == "r") {
                    totalsR++;
                }
            }
        }

        System.out.println("Jumlah huruf 'r' dalam array : " + totalsR);
        System.out.println("");
        System.out.println("Nanda Ganteng Jago JS Yuhu (>_<)");
    }
}
