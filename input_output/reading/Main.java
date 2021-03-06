import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
 * https://docs.oracle.com/javase/8/docs/api/java/io/File.html
 * https://docs.oracle.com/javase/8/docs/api/java/io/FileNotFoundException.html
 */

public class Main
{
/*
 * Whitespace
 * ' ' '\t' '\n' '\r' '\f'  "A line in windows ends with \r\n"
 */

    public static void main(String args[]) throws FileNotFoundException
    {
       File input_file = new File("input.txt");

       Scanner input = new Scanner(input_file);
       input.useDelimiter("[;-]");
       while(input.hasNextInt())
       {
           int number = input.nextInt();
           System.out.printf("%d ",number);    
       }

       System.out.println();

    }

}
