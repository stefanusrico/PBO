package Kasus3;

// Kelas KelasSatu
class KelasSatu
{
    {
        System.out.println(11); // Blok inisialisasi instance mencetak angka 11
    }

    static
    {
        System.out.println(2); // Blok inisialisasi statis mencetak angka 2
    }

    // Konstruktor dengan parameter
    public KelasSatu(int i)
    {
        System.out.println(3); // Mencetak angka 3
    }

    // Konstruktor default
    public KelasSatu()
    {
        System.out.println(4); // Mencetak angka 4
    }
}
