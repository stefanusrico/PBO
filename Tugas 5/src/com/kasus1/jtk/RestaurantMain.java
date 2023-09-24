package com.kasus1.jtk;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
    }
}
