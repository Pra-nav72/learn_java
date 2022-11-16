import java.util.*;

class first{
    public static void main(String args[]){
            System.out.println("Enter two numbers: ");
            try (Scanner sc = new Scanner (System.in)) {
//next() takes only one token i.e string before 1st space
                    //String ans = sc.next();
 //To print full line we use nextline()...
                    //String ans = sc.nextLine();
                   
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int ans = a + b;
                   
                    System.out.println("sum of the number is- ");
                    System.out.println(ans);
                
            }
    }
}
//nextInt()
//nextFloat().....etc