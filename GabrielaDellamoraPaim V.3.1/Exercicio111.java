
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
public class Exercicio111
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      double s = (a+b+c)/2;
      double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.print(formatter.format(area));
    }
}
