import java.util.*;

//do while
//star pattern



public class doWhile {
//     public static void main(String[] args) {
//         int i = 0;
//         do{
//             i++;
//             if (i==2) {
//                 //System.out.println("it is 2");
//                 continue;
//             }
//             System.out.println(i);
//         }while(i<5);
//     }




    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        try (Scanner sc = new Scanner(System.in)) {
            int rowsi = sc.nextInt();
            for (int i = 1; i <= rowsi; i++) {
                for (int j = i; j <=rowsi ; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


    
}
