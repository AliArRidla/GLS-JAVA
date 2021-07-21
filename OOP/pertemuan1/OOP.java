public class OOP {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        psg.sisi = 5;
        System.out.println("Hasil dari luas persegi adalah : " + psg.Luas());
    }

    static class Persegi {
        int sisi;
        int Luas(){
            int rumus = sisi * sisi;
            return rumus;
        }
    }
}