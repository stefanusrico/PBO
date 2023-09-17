package Kasus3;

// Kelas KelasDua
class KelasDua
{
    {
        System.out.println(5); // Blok inisialisasi instance mencetak angka 5
    }

    // Metode utama
    public static void main(String[] args)
    {
        System.out.println(6); // Mencetak angka 6
        KelasSatu satu = new KelasSatu(); // Membuat objek KelasSatu tanpa parameter
        KelasSatu dua = new KelasSatu(10); // Membuat objek KelasSatu dengan parameter 10
    }
}
