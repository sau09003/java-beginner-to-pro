package Arrays;

public class numbers {
    public static void main(String[] args) {
        int [] array={10,20,40,30,50,30,33,45,165,6};
        System.out.println("Elements of Arrays are : ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Give even elements for array :");
        for (int i = 0; i <array.length ; i++) {
            if(array[i]% 2==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
        System.out.println("Give Odd elements for array :");
        for (int i = 0; i <array.length ; i++) {
            if(array[i]% 2!=0){
                System.out.print(array[i]+" ");
            }
        }

    }
}
