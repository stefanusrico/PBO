package com.kasus1.jtk;
import java.util.logging.Logger;
import java.util.logging.Level;
public class Restaurant {
    private String[] namaMakanan;
    private double[] hargaMakanan;
    private int[] stok;
    private byte id = 0;

    public static final Logger logger = Logger.getLogger(Restaurant.class.getName());
    
    public Restaurant() {
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
        nextId();
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                logger.log(Level.SEVERE, "{0}[{1}]\tRp. {2}", new Object[]{namaMakanan[i], stok[i], hargaMakanan[i]});
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public void nextId() {
        id++;
    }
}




