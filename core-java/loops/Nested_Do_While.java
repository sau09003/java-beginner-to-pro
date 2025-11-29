package CoreJava.looping.NestedDoWhile;

public class Nested_Do_While {
    public static void main(String[] args) {
        int i=1;
        do {
            int j=2;
            do {
                System.out.print(i*j+"\t");
                j++;
            }while (j<=20);
            i++;
            System.out.println();
        }while (i<=10);
    }
}
