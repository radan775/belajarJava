public class Variable {
    public static void main(String[] args) {
        // variable adalah tempat untuk menyimpan sebuah data dari tipe data yang dimaksud
        String name;
        name ="taufiq ramadhan";

        int x = 20;
        boolean y = true;
        System.out.println(name);
        System.out.println(x);

        // isi dari variabel bisa diubah secara langsung yaitu dengan cara
        name = "aselole";
        System.out.println(name);

        // sejak java 10 penulisan varibale dan tipe data bisa menggunakan kata kunci "var"
        // tetapi penulisannya variabel harus langsung diisi dengan tipe data apa yang dimaksud

        var rumah = "rumah tingkat";
        int a = 21;
        System.out.println(rumah);
        System.out.println(a);
        //var motor; // akan terjadi error

        // jika tipe data yang sudah dideklarasikan tidak ingin bisa diubah-ubah lagi nilai di dalamnya
        // maka bisa menggunakan kata kunci "final" sebelum penulisan tipe data
        final String myName = "radan";

        //myName = "taufiq"; // ketika kode di samping ini dieksekusi maka akan terjadi error karena deklarasi
        // sebelumnya sudah menyatakan final pada varibel yang dimaksud
    }
}


