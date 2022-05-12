
/**
 * O objetivo deste programa é ler o numero e o valor das peças P1 e p2 + o IPI acrescentado aos valores
 * do produto; calcular o valor total da compra
 * 
 * 
 * (Author)@MarnieGrenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio107
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int numP1 = in.nextInt();
      double vP1 = in.nextDouble();
      int numP2 = in.nextInt();
      double vP2 = in.nextDouble();
      double ipi = in.nextDouble();
      double pecas = (numP1*vP1)+(numP2*vP2);
      double total = pecas+(pecas*(ipi/100));
      System.out.print(formatter.format( total));
}
}
