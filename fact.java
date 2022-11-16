import java.util.Scanner;
class facto{
    public void factorial(int a){
        int sum = 1;
        for(int i = 1; i<=a; i++){
            sum = sum*i;
        }
        System.out.println("factorial of "+ a+ " is "+sum);
    }
}

public class fact {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial:- ");
        int n = inp.nextInt();
        facto  res = new facto();
        res.factorial(n);
    }
}
