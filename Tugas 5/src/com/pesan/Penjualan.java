package com.pesan;


import java.util.ArrayList;
import java.util.List;

public class Penjualan {
    private List<produk> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(produk produk, int jumlah) {
        produk.tambahQty(jumlah);
        daftarPesanan.add(produk);
    }

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (produk produk : daftarPesanan) {
            totalHarga += produk.getHarga() * produk.getQty();
        }
        return totalHarga;
    }

    public void tampilkanPesanan() {
        System.out.println("Daftar Pesanan Anda:");
        for (produk produk : daftarPesanan) {
            System.out.println(
                    produk.getNamaProduk() + " x " + produk.getQty() + " = Rp " + (produk.getHarga() * produk.getQty())
            );
        }
        System.out.println("Total Harga: Rp " + hitungTotalHarga());
    }
}

