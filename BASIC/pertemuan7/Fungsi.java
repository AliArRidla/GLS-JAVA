public class Fungsi {
    public static void main(String[] args) {
        int nilai1 = 5;
        int nilai2 = 6;
        penjumlahan(30, 4);

        System.out.println(penjumlahan(10, nilai2)); // pake return

    }

    // ada return nya

    static int penjumlahan(int angka, int angka2) {
        int hasil = angka + angka2;
        return hasil;
    }

    // tidak mengembalikakn nilai
    static void cetak() {
        System.out.println("Nilai nya adalah ");
    }
}
