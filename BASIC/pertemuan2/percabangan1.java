import java.util.Scanner;

public class percabangan1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int nilai;
        System.out.print("Masukkan nilai nya : ");
        nilai = scan.nextInt();

        if (nilai > 70) {
            System.out.println("nilai anda memuaskan");
        }
    }
}