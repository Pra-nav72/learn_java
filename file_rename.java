import java.io.*;

public class file_rename {
    public static void main(String[] args) {
        
        File f = new File("E:\\javaCP\\java.txt");
        File r = new File("E:\\javaCP\\RENtojava.txt");

        if (f.exists()) {
            System.out.println(f.renameTo(r));
        } else {   
            System.out.println("file doesn't exist!");
        }
    }
}
