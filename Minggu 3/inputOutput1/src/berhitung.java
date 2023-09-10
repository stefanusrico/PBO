import java.util.Scanner;

public class berhitung {
    public static Scanner scanner = new Scanner(System.in);
    public static int hitung(String kata[]){
        int hasil = 0;
        int angka1 = Integer.parseInt(kata[0]);
        String angka2 = kata[1];
        int angka3 = Integer.parseInt(kata[2]);
        if (1 <= angka1 && angka3 <= 1000){
            switch (angka2){
                case "+":
                    hasil = angka1 + angka3;
                    break;
                case "-":
                    hasil = angka1 - angka3;
                    break;
                case "*":
                    hasil = angka1 * angka3;
                    break;
                case "/":
                    hasil = angka1 / angka3;
                    break;
                case "%":
                    hasil = angka1 % angka3;
                    break;
                default:
                    System.out.println("Input operator salah");
                    return -1;
            }
        }
        else{
            System.out.println("Invalid input");
            return -1;
        }
        return hasil;
    }

    public static void main(String[] args){
        int length = 3;
        String kata[] = new String[length];
        for(int i = 0; i < length; i++){
            kata[i] = scanner.next();
        }
        int result = hitung(kata);
        if(result != -1) System.out.println(result);
    }
}
