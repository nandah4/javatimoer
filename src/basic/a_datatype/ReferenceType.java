package basic.a_datatype;

public class ReferenceType {
    public static void main(String[] args) {
        /*
         * Tipe Data Reference
         * TIpe daya yang mereferensikan objek, dan tidak menyimpan nilai itu sendiri di
         * dalam memori
         * melainkan alamat atau referensi ke objek tersebut. Berbeda dengan tipe data
         * primitif,
         * tipe data referensi merupakan objek yang dibuat dari kelas.
         * 
         * String, Array, dll
         */

        final String yourName;
        yourName = "John Doe";
        System.out.println(yourName);

        int[] myNumberFav = { 1, 10, 2, 23, 88 };
        System.out.println(myNumberFav[2]);

    }
}
