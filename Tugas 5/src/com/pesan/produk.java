package com.pesan;

public class produk {
    private String namaProduk;
    private double harga;
    private int qty;

    public produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = 0;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public void tambahQty(int jumlah) {
        qty += jumlah;
    }
}
