import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        // Pada akhir semester seorang dosen menghitung nilai akhir dari mahasiswa yang
        // terdiri dari nilai uas, uts, kuis, dan tugas. Nilai akhir didapatkan dari 40%
        // nilai uas, 30% nilai uts, 10% nilai kuis, dan 20% nilai tugas. Jika nilai
        // akhir dari mahasiswa dibawah 65 maka mahasiswa tersebut akan mendapatkan
        // remidi. Buatlah program untuk membantu mengetahui mahasiswa yang mendapatkan
        // remidi berdasarkan nilai akhir yang didapatkannya!

        int UAS = 70, UTS = 80, Tugas = 80, kuis = 90;
        Scanner scan = new Scanner(System.in);


        System.out.print("Berapakah nilai UAS mu : ");
        UAS = scan.nextInt();

        System.out.print("Berapakah nilai UTS mu : ");
        UTS = scan.nextInt();

        System.out.print("Berapakah nilai Tugas mu : ");
        Tugas = scan.nextInt();

        System.out.print("Berapakah nilai kuis mu : ");
        kuis = scan.nextInt();

        int nilaiTotal = ((UAS * 40 / 100) + (UTS * 30 / 100) + (Tugas * 10 / 100) + (kuis * 20 / 100));

        if (nilaiTotal <= 65) {
            System.out.println("Nilai Total kamu adalah " + nilaiTotal);
            System.out.println("Jadi kamu Remidi");
            if (nilaiTotal == 50) {
                System.out.println("kamu kurang beruntung");                
            } else {
                System.out.println("hdfdhfv");
            }
        } else {
            System.out.println("Nilai Total kamu adalah " + nilaiTotal);
            System.out.println("Jadi kamu Lulus");
        }

        
        // System.out.print("Nilai total kamu adalah " + nilaiTotal);

    }
}
