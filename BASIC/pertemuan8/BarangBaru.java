public class BarangBaru {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    // konstruktor default
    BarangBaru() {

    }

    BarangBaru(String nm, String jb, int s, int hs) {
        namaBarang = nm;
        jenisBarang = jb;
        stok = s;
        hargaSatuan = hs;
    }

    void tampilBarang() {
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n) {
        stok = stok + n;
    }

    void kurangiStok(int n) {
        stok = stok - n;
    }

    int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
