public class PersegiPanjang extends BangunDatar {
    int hasil;
    // overloading atau polymorfysm
    int hitungLuas(int panjang, int lebar) {
        hasil = panjang * lebar;
        return hasil;
    }

    // overriding
    int hitungKeliling(int panjang, int lebar) {
        hasil = 2 * panjang + 2 * lebar;
        return hasil;
    }
    
    void tampilHasil() {
        System.out.println("Hasil nya adalah : " + hasil);
    }
 
}
