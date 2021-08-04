public class SepedaBiasa {
    double kecepatan;
    int gir;

    // Sepeda(){
    // this.kecepatan = kecepatan;
    // this.gir = gir;
    // }

    void tambahKecepatan(double tambahCepat) {
        kecepatan = kecepatan + tambahCepat; 
    }

    // void rem(double rem) {
    // rem = this.rem;
    // }

    void ubahGir(int tambahGir) {
        gir = gir + tambahGir;
    }

    void printStatus() {
        System.out.println("kecepatan Sepeda : " + kecepatan + " di Gear ke : " + gir);
    }
}
