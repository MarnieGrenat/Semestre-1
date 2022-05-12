/**
 * O objetivo deste programa é calcular o custo de uma compra com taxa em dólar;
 * 
 * (Author) @Marnie Grenat
 * (Version) @07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio117
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double compraDolar = in.nextDouble();
      double taxaDolar = in.nextDouble();
      double valor = compraDolar*taxaDolar;
      System.out.println (formatter.format(valor));
    }
}
