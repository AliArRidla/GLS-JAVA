public class PersegiBiasa extends BangunDatar {
    int hasil;
    // method hitung luas persegi
    int hitungLuas(int sisi) {
        hasil = sisi * sisi;
        return hasil;
    }

    // method hitung luas persegi
    int hitungKeliling(int sisi) {
        hasil = 4 * sisi;
        return hasil;
    }

    void tampilHasil() {
        System.out.println("Hasil nya adalah : " + hasil);
    }
}
