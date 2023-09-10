import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.exit;

public class bigNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static BigInteger limitDigits(BigInteger bigInteger, int digitLimit) {
        if(bigInteger.compareTo(BigInteger.ZERO) > 0){
            String bigIntegerStr = bigInteger.toString();
            if (bigIntegerStr.length() > digitLimit) {
                bigIntegerStr = bigIntegerStr.substring(0, digitLimit);
                return new BigInteger(bigIntegerStr);
            } else {
                return bigInteger;
            }
        }else{
            System.out.println("Nilai tidak bisa negatif");
            System.exit(-1);
            return BigInteger.ZERO;
        }
    }

    public static void main(String args[]){
        int limit = 200;
        BigInteger a = scanner.nextBigInteger();
        BigInteger aLimit = limitDigits(a, limit);
        BigInteger b = scanner.nextBigInteger();
        BigInteger bLimit = limitDigits(b, limit);
        BigInteger add = a.add(b);
        BigInteger multi = a.multiply(b);
        System.out.println(add);
        System.out.println(multi);

    }
}
