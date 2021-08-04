import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        // deklarasi scan objek menggunakan library scanner
        Scanner scan = new Scanner(System.in);

        // inisiasi variabel
        float uas,uts,kuis,tugas,nilaiAkhir;

        System.out.print("Masukkan nilai uas : ");
        uas = scan.nextFloat();

        System.out.print("Masukkan nilai uts : ");
        uts = scan.nextFloat();

        System.out.print("Masukkan nilai kuis : ");
        kuis = scan.nextFloat();

        System.out.print("Masukkan nilai tugas : ");
        tugas = scan.nextFloat();

        // rumus nilai akhir
        nilaiAkhir = ((40 * uas/100) + (30 * uts/100) + (10 * kuis/100) + (20 * tugas/100));
        System.out.println(nilaiAkhir);

        // tentukan lulus apa tidak menggunakan kondisi

    }
}
