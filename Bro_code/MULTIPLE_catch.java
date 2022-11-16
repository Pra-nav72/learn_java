public class MULTIPLE_catch {
    public static void main(String[] args) {
        try{
            // int a=10, b=2, c;
            int a=10, b=2, c;
            c=a/b;
            System.out.println(c);

            int[] arr= {12, 23, 34,3};
            //System.out.println(arr[0]);
            System.out.println(arr[0]);

            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array exception");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException n){
            System.out.println("number exception");
        }
        catch(Exception r){//this exception is mandatory in the last of multi-catch.
            System.out.println("Error!");
        }
        
    
    }
}
