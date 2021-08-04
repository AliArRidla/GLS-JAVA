public class Sepeda {
    public static void main(String[] args) {
        // SepedaGunung sGunung = new SepedaGunung();
        SepedaBiasa sBiasa = new SepedaBiasa();
        SepedaGunung sGunung = new SepedaGunung();
        sBiasa.kecepatan = 1;
        sBiasa.gir = 3;
        sBiasa.printStatus();
        System.out.println("setelah update");

        sBiasa.tambahKecepatan(3);
        sBiasa.ubahGir(1);
        sBiasa.printStatus();

        sGunung.merk = "Polygon";
        sGunung.ukuranBan = 30;
        sGunung.printStatus();

    }
}
