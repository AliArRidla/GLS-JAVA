import java.util.Arrays;

public class ArrayBaru {
    public static void main(String[] args) {
        // Assigment
        int ArrayAngka[] = {10,7,8};
        System.out.println(ArrayAngka[0]); //akses index
        System.out.println(ArrayAngka[1]); // akses index
        System.out.println(ArrayAngka[2]); // akses index

        for (int i = 0; i < ArrayAngka.length; i++) {
        System.out.println(ArrayAngka[i]);
        }
        System.out.println(Arrays.toString(ArrayAngka)); //UNTUK PRINT ARRAY

        // Deklarasi
        int ArrayAngka2[] = new int[5];
        ArrayAngka2[0] = 7;

        System.out.println(Arrays.toString(ArrayAngka2)); // UNTUK PRINT ARRAY

        // gabung array
        int Array1[] = {1,2,3,4,5};
        int Array2[] = {6,7,8,9,10};
        int ArrayGabungan[] = new int[10]; 
        
        for (int i = 0; i < Array1.length; i++) {
            ArrayGabungan[i] = Array1[i] ;
        }
        for (int i = 0; i < Array1.length; i++) {
            ArrayGabungan[i + Array1.length] = Array2[i];
        }

        System.out.println(Arrays.toString(ArrayGabungan));






    }
}
