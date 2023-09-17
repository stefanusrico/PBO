package Kasus1;

// Definisi kelas Barang
public class Barang
{
    String kode_barang; // Variabel untuk menyimpan kode barang
    String nama_barang; // Variabel untuk menyimpan nama barang
    private int stok;    // Variabel untuk menyimpan stok barang

    // Konstruktor untuk inisialisasi objek Barang
    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }

    // Metode untuk mendapatkan nilai stok
    public int getStok(){
        return stok;
    }

    // Metode untuk mengubah nilai stok
    public void setStok(int newStok){
        this.stok = newStok;
    }

    // Metode untuk menambah stok barang
    public int tambahStok(int tambahStok){
        if(tambahStok > 0){
            return this.stok += tambahStok;
        }else{
            return -1; // Nilai kembalian -1 menandakan kesalahan jika tambahStok <= 0
        }
    }
}
