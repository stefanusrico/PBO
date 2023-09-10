import java.util.Scanner;

public class inputOutput2 {
    public static Scanner  scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 0;
        String[] kata = new String[3];
        int [] angka = new int[3];
        while(i < 3){
            kata[i] = scanner.nextLine();
            angka[i] = scanner.nextInt();
            scanner.nextLine();
            i++;
        }
        System.out.print("================================\n");
        for(i = 0; i < 3; i++){
            System.out.printf("%-15s %0,3d\n", kata[i], angka[i]);
        }
        System.out.print("================================");
    }
}
