public class Bapak {
    // encapsulasi
    private String nama; // yatim
    public String sifat = "Malu";

    // setter -> read write
    void setNama(String n){
        this.nama = n;
    }


    // getter -> return read
    String getNama(){
        // mengembalikan data -> variabel yang ada di class(this) -> nama
        return this.nama;
    }
    
}
