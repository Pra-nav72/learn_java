public class try_catch_finFinally{
    public static void main(String[] args) {

        try{

            String a= "ankit";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e){

            System.out.println(e);
        }
        finally{

            try{

                System.out.println(10/2);
            }
            catch(ArithmeticException a){

                System.out.println(a);
            }
            finally{

                System.out.println("nested finally");
            }
        }
        System.out.println("all okk");
    }
}