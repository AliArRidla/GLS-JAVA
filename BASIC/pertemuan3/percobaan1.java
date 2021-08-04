import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        int nilai = 3;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai nya : ");
        nilai = scan.nextInt();

        if (nilai % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

    }
}
