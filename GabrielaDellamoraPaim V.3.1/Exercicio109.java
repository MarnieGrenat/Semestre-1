/**
 * O objetivo deste programa é calcular o menor número de cédulas o possível;
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio109
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int sal = in.nextInt();
      int c100 = 100;
      int c50 = 50;
      int c10 = 10;
      int c5 =5;
      int c1 =1;
      int ced100 = sal/c100;
      int ced50 = (sal%c100)/c50;
      int ced10 = ((sal%c100)%c50)/c10;
      int ced5 = (((sal%c100)%c50)%c10)/c5;
      int ced1 = ((((sal%c100)%c50)%c10)%c5)/c1;
      System.out.println (sal);
      System.out.println (ced100);
      System.out.println (ced50);
      System.out.println (ced10);
      System.out.println (ced5);
      System.out.println (ced1);
      
      
    
    }
}
