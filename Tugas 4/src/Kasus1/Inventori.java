package Kasus1;

// Definisi kelas Inventori
public class Inventori {
    private Barang[] barangs;

    // Metode untuk menginisialisasi objek-objek Barang
    void initBarang() {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }

    // Metode untuk menampilkan informasi Barang
    void showBarang() {
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }

    // Metode untuk melakukan pengadaan barang
    void pengadaan() {
        initBarang();

        barangs[0].setStok((barangs[0].tambahStok(10)));
        barangs[0].setStok((barangs[0].tambahStok(20)));
        showBarang();
    }

    // Metode utama (entry point) dari program
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}
