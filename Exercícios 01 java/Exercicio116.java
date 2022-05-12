
/**
 * O objetivo deste programa é ler 3 valores e encontrar o maior dos três valores
 * Mensagem: 
 * System.out.print (n + "E O MAIOR");
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) @10.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio116
    {
  public static void main (String[] args)
  {
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      double d = ((a+b+(Math.abs(a-b)))/2);
      double maior = ((d+c+(Math.abs(d-c)))/2);
      System.out.print((formatter.format(maior)) + " E O MAIOR");
    }
}
