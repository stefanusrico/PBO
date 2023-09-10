import java.util.Scanner;

public class gajiAgent {
    public static Scanner scanner = new Scanner(System.in);
    public static int gajiPokok = 500000;
    public static int hargaItem = 50000;
    public static int gaji(int penjualan){
        int bonus = 0;
        int denda = 0;
        if(penjualan >= 40){
            bonus = (int) hargaItem * penjualan * 25/100;
            if (penjualan >= 80) {
                bonus = (int) hargaItem * penjualan * 35 / 100;
            }
        }else if(penjualan < 15){
            denda = (int) (15.0 / 100 * hargaItem * (15-penjualan));
        }else{
            bonus = (int) 50000 * penjualan * 10/100;
        }
        return bonus - denda;
    }

    public static void main(String args[]){
        int penjualan = scanner.nextInt();
        int hasil = (int) gaji(penjualan);
        System.out.println("Total : " + (gajiPokok + hasil));
    }
}