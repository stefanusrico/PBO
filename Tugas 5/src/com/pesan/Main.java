package com.pesan;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<produk> menuMakanan = new ArrayList<>();
        menuMakanan.add(new produk("Nasi Goreng", 15000));
        menuMakanan.add(new produk("Mie Ayam", 12000));
        menuMakanan.add(new produk("Sate Ayam", 20000));
        menuMakanan.add(new produk("Nasi Uduk", 18000));
        menuMakanan.add(new produk("Bakso", 10000));
        menuMakanan.add(new produk("Nasi Kuning", 16000));
        menuMakanan.add(new produk("Mie Goreng", 13000));
        menuMakanan.add(new produk("Soto Ayam", 17000));
        menuMakanan.add(new produk("Ayam Goreng", 22000));
        menuMakanan.add(new produk("Rendang", 25000));
        menuMakanan.add(new produk("Sambal Goreng", 21000));
        menuMakanan.add(new produk("Gado-Gado", 19000));
        menuMakanan.add(new produk("Ketoprak", 20000));


        Penjualan penjualan = new Penjualan();

        String pesanLagi = "y";
        while (pesanLagi.equalsIgnoreCase("y")) {
            System.out.println("Menu Makanan:");
            for (int i = 0; i < menuMakanan.size(); i++) {
                produk produk = menuMakanan.get(i);
                System.out.println(i + ". " + produk.getNamaProduk() + " - Rp " + produk.getHarga());
            }

            System.out.print("Pilih menu (ID): ");
            int idMenu = input.nextInt();

            if (idMenu >= 0 && idMenu < menuMakanan.size()) {
                System.out.print("Jumlah pesanan: ");
                int jumlahPesanan = input.nextInt();
                penjualan.tambahPesanan(menuMakanan.get(idMenu), jumlahPesanan);

                System.out.print("Tambahkan pesanan lagi? (y/n): ");
                pesanLagi = input.next();
            } else {
                System.out.println("ID menu tidak valid.");
            }
        }

        penjualan.tampilkanPesanan();
    }
}
