
/**
 * O objetivo deste programa é somar uma progressão aritmética
 * 
 * 
 *(Author) @MarnieGrenat
 *(Version) 10.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio106
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      //System.out.println("escreva o termo inicial");
      double p = in.nextDouble();  // termo inicial
      //System.out.println("escreva o termo final");
      double u = in.nextDouble(); // termo final
      double r = in.nextDouble(); // razão da PA
      double n = ((p-u)/r)-1; // soma dos termos
      double st = (n*(p+u))/2;
      //System.out.print ("As somas do termo de uma progressão aritmética de a1 = 1 e an = 100 é:");
      System.out.println(formatter.format(Math.abs(st)));
    }
}
