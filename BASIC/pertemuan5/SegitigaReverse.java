public class SegitigaReverse {
    // public static void main(String[] args) {
    // for (int i = 0; i < 6; i++) {
    // for (int j = 0; j < i; j++) {
    // System.out.print("* ");
    // }
    // System.out.println("\n");
    // }
    // }

    // segitiga reverse
    // public static void main(String[] args) {
    // for (int i = 0; i < 6; i++) {
    // // System.out.println("*");
    // for (int j = 0; j < i; j++) {
    // System.out.print(" \n");
    // }
    // System.out.print("*");
    // }
    // }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (6 - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
