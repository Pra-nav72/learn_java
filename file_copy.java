import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_copy {
    public static void main(String[] args) throws IOException{
        FileInputStream r = new FileInputStream("E:\\javaCP\\RENtojava.txt");
        //we use fileinputstream only to read data from the file..


        FileOutputStream w = new FileOutputStream("E:\\javaCP\\COPYjava.txt");
        //fileoutputstream used to create file and perform writting in it...

        int i;
        while ((i = r.read())!=-1) {
            w.write((char)i);//writting data to 'w ' from 'r'.
        }
        System.out.println("data copied successfully!");
    } 
}
