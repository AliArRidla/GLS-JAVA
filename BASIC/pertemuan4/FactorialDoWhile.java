public class FactorialDoWhile {
    public static void main(String[] args) {
        int angka = 5;
        int fac = 1;
        int i = 1;
        do {
            fac = fac*i;
            i++;
        } while (i <= angka);
        System.out.printf("Nilai faktorial dari " + angka + " adalah : %d\n", fac);
    }
}
