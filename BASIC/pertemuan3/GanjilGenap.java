import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {

        // gunakan library scanner untuk scanning nilai
        Scanner scan = new Scanner(System.in);
        int nilai;

        // proses penyimpanan nilai ke dalam variabel
        System.out.print("Masukkan nilai nya : ");
        nilai = scan.nextInt();

        if (nilai % 2 == 0) {
            System.out.println("Nilai " + nilai + "adalah Genap");
        } else {
            System.out.println("Nilai " + nilai + " adalah Ganjil");
        }

    }
}
