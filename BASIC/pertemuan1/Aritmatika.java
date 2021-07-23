public class Aritmatika {
    public static void main(String[] args) {
        int hasil;
        int nilai1 = 10;
        int nilai2 = 3;
        // String nilai3 = "50";
        
        // penjumlahan
        hasil = nilai1 + nilai2;
        System.out.println( "Nilai penjumlahan nya adalah " + nilai1 + " + " + nilai2 + " = " + hasil);

        // pengurangan
        hasil = nilai1 - nilai2;
        System.out.println("Nilai pengurangan nya adalah " + nilai1 + " - " + nilai2 + " = " + hasil);
        
        // perkalian
        hasil = nilai1 * nilai2;
        System.out.println("Nilai perkalian nya adalah " + nilai1 + " x " + nilai2 + " = " + hasil);
        
        //pembagian
        float hasilFloat;
        float nilaiFloat1 = 6;
        float nilaiFloat2 = 3;

        hasilFloat = nilaiFloat1 / nilaiFloat2;
        System.out.println("Nilai pembagian nya adalah " + nilaiFloat1 + " / " + nilaiFloat2 + " = " + hasilFloat);
        
        //modulus
        hasil = nilai1 % nilai2;
        System.out.println("Nilai modulus nya adalah " + nilai1 + " % " + nilai2 + " = " + hasil);
    }
}
