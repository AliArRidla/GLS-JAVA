import java.util.Scanner;

public class percabangan3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nilai;
        System.out.print("Masukkan nilai nya : ");
        nilai = scan.nextInt();

        if (nilai >= 70) {
            System.out.println("nilai anda memuaskan");
        } else if (nilai <= 50) {
            System.out.println("nilai anda cukup memuaskan");
        } else {
            System.out.println("nilai anda kurang memuaskan");
        }
    }
}