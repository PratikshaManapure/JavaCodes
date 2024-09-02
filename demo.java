import java.io.*;
import java.io.IOException;
public class demo {
    public static void main(String[] args){
        File f = new File("filehandling.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File is created.");

            }else{
                System.out.println("File already exist");
            }
        }catch(IOException e){
            System.out.println("Exception is handled");
        }
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.getName());
        System.out.println(f.exists());
    }
}
