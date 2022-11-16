public class try_catch_MUITIPLE {
    //1 exception doesn't depend on the other exception.
    public static void main(String[] args) {
        try{
            int a=10, b=0, c;
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException a){
            System.out.println("Can't divide by 0");
        }
        try{
            int[] a= {10, 20, 30, 40, 50};
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("beyond the array limit.");
        }
    }
}
