public class try_catch_finally {
    public static void main(String[] args) {
        
    try{
        System.out.println("hello world!");//exception in 2nd line so this line will execute
        int a=20, b=0,c;
        c=a/b;
        System.out.println(c);
    }
    catch(ArithmeticException e){
        System.out.println("can't divide by 0");

    }
    finally{
        //generally we write resource code in this block
        //this block always execute.
        System.out.println("finally blocckkkk");
    }
    System.out.println("eennndd");
}
}
