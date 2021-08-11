public class NestedLoop {
    public static void main(String[] args) {
        // persegi
        int nilai = 5;
        // for (int i = 0; i < nilai; i++) {
        // for (int j = 0; j < nilai; j++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }

        // segitiga terbalik
        // for (int i = 0; i < 5; i++) { //outer
        // // System.out.print("-");
        // for (int j = 0; j < 5; j++) { //inner
        // System.out.print(j + " ");
        // if ( (i+j) == 3) {
        // break;
        // }
        // }
        // System.out.print("\n");
        // }

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; --j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
