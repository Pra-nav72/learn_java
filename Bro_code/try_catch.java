public class try_catch {
    public static void main(String[] args) {
        // String str = "ankit";
         String str = "1234";
        try{
            int a= Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("string number Exception");
        }
       System.out.println("string converted to integer..");
    }
}
