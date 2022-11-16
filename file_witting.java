import java.io.*;

public class file_witting {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("E:\\javaCP\\javva.txt");
            try{
                f.write("i'm learning java from Learn coding!");
            }
            finally{
                f.close();
            }
            System.out.println("Succesfully data written!");
        }
        catch(IOException i){
            System.out.println(i);
        }
       
    }
}
