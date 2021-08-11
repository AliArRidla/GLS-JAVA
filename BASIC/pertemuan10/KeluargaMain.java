import java.util.Scanner;

public class KeluargaMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Nama bapak nya siapa ? ");
        // inisiasi 
        String namaBaru = scan.next();
        
        // instasiasi objek bapak
        Bapak bpk = new Bapak(); 
        bpk.setNama(namaBaru);
        // bpk.nama;
        System.out.println("Bapak nya nama nya adalah = " + namaBaru);

        // instansiasi objek Anak
        Anak ank = new Anak();
        String nama = ank.namaAnak;
        System.out.println("Anak nya adalah " + nama + " bapak punya sifat turunan " + ank.sifat);
        
        
    }
}
