public class BarangMain {
    public static void main(String[] args) {
        BarangBaru b1 = new BarangBaru();
        b1.namaBarang = "Penggaris";
        b1.jenisBarang = "Alat Tulis";
        b1.hargaSatuan = 25000;
        b1.stok = 10;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = " + hargaTotal);

        // buat objek baru 
        BarangBaru br2 = new BarangBaru("Pulpen","Alat Tulis",5,2000);
        br2.tampilBarang();
    }
}
