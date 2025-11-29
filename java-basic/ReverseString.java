import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str){
        String reverse= "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse +=str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String : ");
        String s1=sc.next();
        System.out.println("String Before Reverse : "+s1);
        String reverse = new StringBuilder(s1).reverse().toString();
        System.out.println("Reverse String is : "+ reverse);
        System.out.println(reverseString(s1));
    }
}
