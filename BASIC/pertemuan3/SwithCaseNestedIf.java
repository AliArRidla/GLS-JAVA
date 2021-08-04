import java.util.Scanner;

public class SwithCaseNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int diskon1 = 50000;
        int diskon2 = 25000;
        int diskon3 = 10000;

        System.out.print("Apakah Pelanggan memiliki kartu anggota : ");
        String kartuKeluarga = scan.next();

        System.out.print("Berapa nilai total pembelian anda : ");
        int total = scan.nextInt();

        switch (kartuKeluarga) {
            case "y":
                if (total > 50000) {
                    int hasil = total - diskon1;
                    System.out.println("Total pembelian anda adalah : " + total + " dan mendapat diskon " + diskon1
                            + " \njadi anda hanya membayar  " + hasil);
                } else {
                    int hasil = total - diskon2;
                    System.out.println("Total pembelian anda adalah : " + total + " dan mendapat diskon " + diskon2
                            + " \njadi anda hanya membayar  " + hasil);
                }
                break;                                                                                                                                   
            case "t":
            if (total > 200000) {
                int hasil = total - diskon3;
                System.out.println("Total pembelian anda adalah : " + total + " dan mendapat diskon " + diskon3
                        + " \njadi anda hanya membayar  " + hasil);
            } else {
                System.out.println("Total pemebelian anda adalah : " + total);
            }
                break;
            default:
            System.out.println("Imputan yang anda masukkan tidak sesuai ");
                break;
        }
    }
}
