package CoreJava.looping.for_loop;

public class for_block {
    public static void main(String[] args) {
//        System.out.println("Print number 1 to 10");
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//        }
        System.out.println("Print table from 2 to 15");
        for (int i = 1; i <=10 ; i++) {
            for (int j = 2; j <=15; j++) {
                System.out.print(i*j +"\t");
            }
            System.out.println();
        }
    }
}
