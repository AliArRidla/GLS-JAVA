public class FactorialFor {
    public static void main(String[] args) {
        int angka = 5;
        int fac = 1;

        for (int i = 1; i <= angka; i++) {
        // 1 true 2    
        // 2 true 3 
        // 3 true 4
        // 4 true 5
            // rumus faktorial
            fac = fac*i;
            // 1 = 1*2 = 2
            // 2 = 2*3 = 6
            // 3 = 6*4 = 24
            // 4 = 24*5 = 120
        }

        // 3:45 + 90 = 75
        // 4:00 + 75 = 05:15

        System.out.printf("Nilai faktorial dari " + angka + " adalah : %d\n", fac);
    }
}
