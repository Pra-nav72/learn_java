public class Exception_propagation {
    public static void main(String[] args) {
        try{

            m1();
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception is handled by main()");
        }
    }
    public static void m1(){
        m2();
    }
    public static void m2(){
        System.out.println(10/0);//exception occur!(try-catch can be used here)
        //method call in stack.

        //to solve this exception, use try-catch at any method call.
    }
}
