public class Main {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";

        int sum = A.length() + B.length();
        System.out.println(sum);
        int lexA = A.compareTo(B);
        int lexB = B.compareTo(A);

        if(lexA > lexB){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(A.charAt(0))+ A.substring(1,A.length())+" "+Character.toUpperCase(B.charAt(0))+B.substring(1,B.length()));
    }
}