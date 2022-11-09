public class TipeDataNumber {
    public static void main(String[] args) {
        // Tipe data number di java ada 2 yaitu Integer Number dan Floating Point Number
        // secara umum Integer Number adalah bilangan bulat
        // dibawah ini adalah contoh kode program dari Integer number

        byte iniBytes = 100;
        short inShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        //secara umum floating Point Number adalah bilangan desimal
        //dibawah ini adalah contoh kode rogram dari Floating Point Number
        float iniFloat = 10.5f;
        double iniDouble = 10.9;

        //cara penulisan kode Literals di Java
        int decimalInt = 25; // cara penulisan angka desimal biasa ialah langsung saja tulis angkanya
        int hexInt = 0xFFFFFF; // ini adalah angka hexa desimal atau pecahan angka 16, cara penulisannya harus menambahkan "0x" dulu baru setelah itu ditulis angka hexa desimalnya
        int binaryDecimal = 0b0101010101; // cara penulisan bynary desimal harus ditambahkan "0b" dulu diawal, lalu ditulis angka binary di depannya

        // sejak versi java 7 atau 8 penulisan angka integer bisa ditambahkan underscore
        // hal ini tidak wajib untuk digunakan, tapi hal ini hanya untuk mempermudah kita dalam menghitung berapa angka nol yang ada dalam kode integer
        //dibawah ini adalah contohnnya
        int saldo = 1_000_000_000;
    }
}
