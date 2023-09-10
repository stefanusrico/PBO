import java.util.Scanner;
import java.util.StringTokenizer;

public class bukaTutupJalan {
    public static Scanner scanner = new Scanner(System.in);
    public static void hitung(String plat){
        int nomorPlat = 0;
        String hasil = "";
        StringTokenizer platGabung = new StringTokenizer(plat, " ");
        while(platGabung.hasMoreTokens()) {
            String token = platGabung.nextToken();
            nomorPlat = Integer.parseInt(token);
        }
        nomorPlat = nomorPlat -999999;
        if(nomorPlat % 5 != 0){
            System.out.print("berhenti");
        }else{
            System.out.print("jalan");
        }
    }

    public static void main(String args[]){
        String plat = scanner.nextLine();
        hitung(plat);
    }
}
