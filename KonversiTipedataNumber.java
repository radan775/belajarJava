public class KonversiTipedataNumber {
    public static void main(String[] args) {
        //Konversi Tipe data number
        //ada dua macam, ketika dari tipe data number rendah ke tipe data tinggi maka konversinya akan otomatis
        //tapi jika konversinya dari tipe data number tinggi ke rendah maka konversinya harus manual

        //berikut adalah contoh konversi dari tipe data rendah ke tipe data tinggi
        byte iniByte = 23;
        short iniShort = iniByte;
        int iniInt = iniShort;

        //berikut adalah contoh konversi dari tipe data yang tinggi ke rendah

        byte iniByte2 =(byte) iniInt;
        short iniShort2 = (short) iniInt;
        //catatan
        // hati-hati ketika mengkonversi dari tipe data yang tinggi ke rendah, karena jikalau
        //volume nilai yang lebih tinggi melebihi nilai tie data yang rendah, maka akan terjadi number Overflow
        // jadi nilai tipe data tinggi yang melebihi tipe data rendah, nilai lebihnya akan berputar di dalam
        // diantara minus tipe data rendah sampai positif sampai nilai tersebut memenuhi kelebihan dari tipe data tinggi

    }
}
