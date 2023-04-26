
package javaapplication20;
import java.util.*;
/**
 *
 * @author user
 */
public class JavaApplication20 {

  int mathsresults;
  int englishresults;
  int othersubject1results;
  int othersubject2results;
  int othersubject3results;
  int othersubject4results;
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int mathsresults;
        System.out.println("Enter math results: ");
        mathsresults = scanner.nextInt();
        
        int englishresults ;
        System.out.println("Enter english results: ");
        englishresults = scanner.nextInt();
        
        int othersubject1results ;
        System.out.println("Enter math results: ");
         othersubject1results= scanner.nextInt();

        int othersubject2results ;
        System.out.println("Enter math results: ");
        othersubject2results = scanner.nextInt();

        int othersubject3results ;
        System.out.println("Enter math results: ");
      othersubject3results= scanner.nextInt();

        int othersubject4results ;
        System.out.println("Enter math results: ");
        othersubject4results  = scanner.nextInt();

        int APS = mathsresults + englishresults + othersubject1results + othersubject2results + othersubject3results + othersubject4results; 
        
       
        System.out.println("Your APS score is: " + APS);
    }
}
    
