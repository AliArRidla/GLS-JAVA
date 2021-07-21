public class Procedure {
    static int panjang = 15;
    static int lebar = 15;

    public static void main(String[] args) {
        System.out.println("Hasilnya adalah :" + Luas());
    }

    static int Luas(){
        int hasil = panjang * lebar;
        return hasil;
    }

}
