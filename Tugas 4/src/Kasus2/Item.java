package Kasus2;

// Definisi kelas Item
public class Item {
    private String name;

    // Konstruktor default untuk objek Item
    public Item() {
        name = "Ipin";
    }

    // Konstruktor dengan parameter untuk objek Item
    public Item(String name) {
        this(); // Memanggil konstruktor default
        System.out.println(this.name); // Menampilkan nama setelah inisialisasi
    }
}
