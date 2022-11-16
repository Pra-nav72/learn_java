import java.io.*;

public class file_info {
    public static void main(String[] args) {
        File f = new File("E:\\javaCP\\javva.txt");

        if(f.exists()){
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Size: "+f.length());

            System.out.println("File Remove: "+f.delete());
            //since file is deleted, next time else{} execute bcoz...
            //  doesn't exist anymore.
        }
        else {
            System.out.println("file doesn't exist!");
        }
    }
}
