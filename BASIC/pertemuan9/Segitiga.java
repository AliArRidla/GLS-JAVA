public class Segitiga {
    double hasil;

    double hitungLuas(float alas, float tinggi) {
        hasil = (0.5*alas*tinggi);
        return hasil;
    }

    double hitungKeliling(float sisi){
        hasil = sisi + sisi + sisi;
        return hasil;
    }
    
    void tampilHasil() {
        System.out.println("Hasil nya adalah : " + hasil);
    }
}
