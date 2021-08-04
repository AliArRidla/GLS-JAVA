public class Assegment {
    public static void main(String[] args) {
        int nilai1 = 5;
        int nilai2 = 6;
        int hasil;

        nilai1 = nilai2;
        System.out.println(nilai1);

        hasil = nilai1 += nilai2;
        System.out.println("Nilai nya adalah " + hasil);

    }
}
