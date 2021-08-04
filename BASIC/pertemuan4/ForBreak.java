public class ForBreak {
    public static void main(String[] args) {
        int angka, b;

        for (b = 50; true;) {
            angka = 5;
            // b = b+angka
            b += angka;
            if (b > 50)
                break;
        }
        System.out.printf("Angka akan berhenti pada jumlah angaka : %d\n",b);


    }
}
