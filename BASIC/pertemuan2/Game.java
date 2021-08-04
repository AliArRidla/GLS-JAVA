import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jawaban anda : ");
        int jawaban = input.nextInt();

        if (jawaban >= 10) {
            System.out.println("jawaban anda melebihi ekspektasi");
        } else if (jawaban >= 5) {
            System.out.println("jawaban anda tepat!!");
        } else {
            System.out.println("salah");
        }
    }
}
