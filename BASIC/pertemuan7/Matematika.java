public class Matematika {
    // attribut
    int hasil;
    double hasil2;

    // method atau fungsi
    int luasPersegi(int nilai){
        hasil = nilai * nilai;    
        return hasil ;
    }

    double luasSegitiga(int alas,int tinggi){
        hasil2 = 0.5 * alas * tinggi;
        return hasil2;
    }

    // fungsi tanpa return
    void cetakHasilPersegi(){
        System.out.println("Hasil Luas Persegi adalah "+ hasil);
    }

    void cetakHasilSegitiga() {
        System.out.println("Hasil luas segitiga sama sisi adalah " + hasil2);
    }
}
