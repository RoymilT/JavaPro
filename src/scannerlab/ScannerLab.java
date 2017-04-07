package scannerlab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Envy-T
 */
public class ScannerLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
////        System.out.print("Input Num1: ");
//        System.out.print("Input your Name: ");
//        String name = sc.next();
////        System.out.print("Input Num2: ");
//        System.out.print("Input your Last Name: ");
//        String last = sc.next();
//        System.out.println("Your name is: ♦♦♦ " + (" ♦♦♦" +name.toUpperCase(Locale.getDefault(Locale.) +" "+ last));
//---------------------------------------------------------------------------------------------------------------------------
          Scanner sc = new Scanner(new FileReader("..\\ScannerLab\\src\\scannerlab\\FileIn"));
          while(sc.hasNext())
          {
          System.out.println(sc.nextLine());
          }
          

           
    }
   
}
