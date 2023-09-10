import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class inputOutput1 {
    public static void pecahString(String kata){
        Pattern pattern = Pattern.compile("\\w+");
//        System.out.println(pattern);
        Matcher matcher = pattern.matcher(kata);
        System.out.print(matcher);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kalimat : ");
        String kalimat = scanner.nextLine();
        pecahString(kalimat);
    }
}


