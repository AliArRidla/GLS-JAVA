import java.util.Scanner;

public class ArraysOfObject {
    public static void main(String[] args) {
        Scanner scanTerserah = new Scanner(System.in);

        PersegiPanjang ppArray[] = new PersegiPanjang[3];

        for (int i = 0; i < 3; i++) {
            ppArray[0] = new PersegiPanjang();
            System.out.print("Persegi panjang nya ? ");
            ppArray[0].lebar = 5;

            System.out.println("Perseg");
            ppArray[0].panjang = 6;

        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi pangjang ke = " + i);
            System.out
                    .println("Panjang nya adalah = " + ppArray[0].panjang + " lebar nya adalah = " + ppArray[0].lebar);

        }

        // System.out.println("Persegi panjang ke-0, panjang nya adalah = " +
        // ppArray[0].panjang + " lebar nya adalah = "
        // + ppArray[0].lebar);
        // System.out.println("Persegi panjang ke-0, panjang nya adalah = " +
        // ppArray[1].panjang + " lebar nya adalah = "
        // + ppArray[1].lebar);
        // System.out.println("Persegi panjang ke-0, panjang nya adalah = " +
        // ppArray[2].panjang + " lebar nya adalah = "
        // + ppArray[2].lebar);
    }
}
