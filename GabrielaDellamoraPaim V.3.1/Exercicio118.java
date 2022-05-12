
/**
 * O objetivo deste programa é calcular o custo pago pelo consumidor em um carro novo;
 * dados:
 * custo de fábrica + percentual do distribuidor + percentual de impostos (aplicados ao custo de fábrica);
 * 
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) @07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio118
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double d = in.nextDouble();   
      double dp = d-(d*0.22);
      System.out.println(formatter.format(dp));
      int apto = 42;
      int mes = 30; //dias ou diárias
      double apto40 = apto-(apto*0.60);
      double sp = d*mes*apto40;
      System.out.println(formatter.format(sp));
      double apto70 = apto -(apto*0.30);
      double cp= dp*mes*apto70;
      System.out.println(formatter.format(cp));
      System.out.println(formatter.format(cp-sp)); 
    }
}
