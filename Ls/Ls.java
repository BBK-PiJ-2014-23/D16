import java.io.*;
/**
 * Write a description of class Ls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ls
{
    public static void main(String[] args) {
        File file = new File("./");
        String[] files = file.list();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
