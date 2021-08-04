import java.util.Scanner;

public class swithCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan anda : ");
        int nilai = scan.nextInt();

        switch (nilai) {
            case 1:
                System.out.println("Nilai nya adalah " + nilai);
                break;
            case 2:
                System.out.println("Nilai nya adalah " + nilai);
                break;
            default:
                break;
        }

    }
}
