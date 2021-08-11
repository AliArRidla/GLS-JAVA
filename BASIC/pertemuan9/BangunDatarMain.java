import java.util.Scanner;

public class BangunDatarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // membuat object
        PersegiBiasa persegi = new PersegiBiasa();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();

        // BangunDatar arraybBangunDatar[] = new BangunDatar[3];
        BangunDatar arrayBangunDatar[] = {persegi,persegiPanjang};
        

        // printing
        System.out.println("===== Bangun Datar =====");
        System.out.println("1.Persegi");
        System.out.println("2.Persegi Panjang");
        System.out.println("3.Segitiga");
        System.out.println("4.Lingkaran \n");

        System.out.print("Pilih menu : ");
        int pilihMenu = scan.nextInt();

        // percabangan
        switch (pilihMenu) {
            case 1:
                System.out.println("Anda memilih menu 1 yaitu Persegi \n");
                System.out.println("~~~~~ Kalkulator Persegi ~~~~~~");
                System.out.println("1.Hitung Luas");
                System.out.println("2.Hitung Keliling \n");
                // pilih menu
                System.out.print("Pilih menu : ");
                int pilihPersegi = scan.nextInt();
                if (pilihPersegi == 1) { // pilihan Hitung luas
                    System.out.println("Anda memilih menu hitung luas persegi");
                    System.out.print("Masukkan nilai sisi nya : ");
                    int sisi = scan.nextInt();
                    persegi.hitungLuas(sisi);
                    persegi.tampilHasil();
                } else if (pilihPersegi == 2) {
                    System.out.println("Anda memilih menu hitung keliling persegi");
                    System.out.print("Masukkan nilai sisi nya : ");
                    int sisi = scan.nextInt();
                    persegi.hitungKeliling(sisi);
                    persegi.tampilHasil();
                } else {
                    System.out.println("Heh anda salah pilihan nya 1 dan 2, hadeeehhh"); // error handling
                }
                break;
            case 2:
                System.out.println("Anda memilih menu 1 yaitu Persegi Panjang \n");
                System.out.println("~~~~~ Kalkulator Persegi Panjang ~~~~~~");
                System.out.println("1.Hitung Luas");
                System.out.println("2.Hitung Keliling \n");
                // pilih menu
                System.out.print("Pilih menu : ");
                int pilihPersegiPanjang = scan.nextInt();
                if (pilihPersegiPanjang == 1) { // pilihan Hitung luas
                    System.out.println("Anda memilih menu hitung luas persegi panjang");
                    System.out.print("Masukkan lebar nya : ");
                    int lebar = scan.nextInt();
                    System.out.print("Masukkan panjang nya : ");
                    int panjang = scan.nextInt();
                    persegiPanjang.hitungLuas(panjang, lebar);
                    persegiPanjang.tampilHasil();
                } else if (pilihPersegiPanjang == 2) {
                    System.out.println("Anda memilih menu hitung keliling persegi panjang");
                    System.out.print("Masukkan lebar nya : ");
                    int lebar = scan.nextInt();
                    System.out.print("Masukkan panjang nya : ");
                    int panjang = scan.nextInt();
                    persegiPanjang.hitungKeliling(lebar, panjang);
                    persegiPanjang.tampilHasil();
                } else {
                    System.out.println("Heh anda salah pilihan nya 1 dan 2, hadeeehhh"); // error handling
                }
                break;
            case 3:
                System.out.println("Anda memilih menu 3 yaitu Segitiga");
                System.out.println("~~~~~ Kalkulator Segitiga ~~~~~~");
                System.out.println("1.Hitung Luas");
                System.out.println("2.Hitung Keliling \n");
                // pilih menu
                System.out.print("Pilih menu : ");
                int pilihSegitiga = scan.nextInt();
                if (pilihSegitiga == 1) {
                    System.out.println("Anda memilih menu hitung luas segitiga");
                    System.out.print("Masukkan alas nya : ");
                    float alas = scan.nextFloat();
                    System.out.print("Masukkan tinggi nya : ");
                    float tinggi = scan.nextFloat();
                    segitiga.hitungLuas(alas, tinggi);
                    segitiga.tampilHasil();
                } else if (pilihSegitiga == 2) {
                    System.out.println("Anda memilih menu hitung keliling segitiga");
                    System.out.print("Masukkan alas nya : ");                    
                    Float sisi = scan.nextFloat();
                    segitiga.hitungKeliling(sisi);
                    segitiga.tampilHasil();
                } else {

                }
                break;
            case 4:
                System.out.println("Anda memilih menu 4 yaitu Lingkaran");
                break;

            default:
                break;
        }

    }
}
