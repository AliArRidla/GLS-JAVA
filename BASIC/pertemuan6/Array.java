import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] ArrayInt = { 1, 2, 3, 4, 5, 6 };
        int[] ArrayInt2 = { 1, 2, 3, 4, 5, 6 };
        int[] ArrayHasil = new int[6];
        int[] ArrayGabung = new int[ArrayInt.length + ArrayInt2.length];

        // for (int i = 0; i < ArrayInt.length; i++) {
        // ArrayHasil[i] = ArrayInt[i] * ArrayInt2[i];
        // }

        int nilai = 0;
        // while (nilai < ArrayInt.length) {
        // ArrayHasil[nilai] = ArrayInt[nilai] + ArrayInt2[nilai];
        // nilai++;
        // }

        do {
            ArrayHasil[nilai] = ArrayInt[nilai] + ArrayInt2[nilai];
            nilai++;
        } while (nilai < ArrayInt.length);


        // gabung
        // System.out.println(ArrayGabung.length);

        for(int i = 0;i < ArrayInt.length;i++){
            ArrayGabung[i] = ArrayInt[i];
        }

        for (int i = 0; i < ArrayInt.length; i++) {
            ArrayGabung[i+ArrayInt.length] = ArrayInt2[i];
        }

        System.out.println(Arrays.toString(ArrayHasil));
        System.out.print(Arrays.toString(ArrayGabung));
        // for (int i : ArrayInt) {
        //     System.out.print(i);
        // }
    }
}
