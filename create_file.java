import java.io.File;
import java.io.IOException;

public class create_file {
    public static void main(String[] args) {
        File f = new File("E:\\javaCP\\javva.txt");
        try{
            if(f.createNewFile()){
             //checked IOException(if file doesn't exist{javaCP don't exist})
             //then where will IO operation perform(this will be in try-catch)
                System.out.println("file created successfully!");
            }
            else{
                System.out.println("file already exist!");
            }
        }
        catch(IOException o){
            System.out.println("Exception handled");
        }
    }
}
