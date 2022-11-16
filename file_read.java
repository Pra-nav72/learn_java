import java.io.FileReader;
import java.io.IOException;

public class file_read {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("E:\\javaCP\\javva.txt");
            try{
                int i;
                while((i=f.read())!= -1){
                    System.out.print((char)i);
                }
            }
            finally{
                f.close();
            }
        }
        catch(IOException i){
            System.out.println("Exception handled!");
        }
    }
}
