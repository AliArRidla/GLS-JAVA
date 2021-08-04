import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String kondisi;
        Scanner inputan = new Scanner(System.in);

        System.out.print("masukkan kondisi : ");
        kondisi = inputan.next();

        switch (kondisi) {
            case "iya":
                System.out.println("ini iya");
                break;
            case "tidak":
                System.out.println("tidak ");
                break;
            case "mungkin":
                break;
            default:
                System.out.println("ini default kosong");
                break;
        }

    }
}
