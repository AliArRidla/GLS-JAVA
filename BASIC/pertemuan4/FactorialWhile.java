public class FactorialWhile {
    public static void main(String[] args) {
        int angka = 5;
        int fac = 1;
        int i = 1;

        while (i <= angka){
            fac = fac*i;
            i++;
        }

        System.out.printf("Nilai Faktorial bilangan nya adalah  : %d\n",fac );
    }
}
