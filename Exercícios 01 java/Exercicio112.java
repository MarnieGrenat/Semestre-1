
/**
 * O objetivo deste programa é calcular o custo pago pelo consumidor em um carro novo;
 * dados:
 * custo de fábrica + percentual do distribuidor + percentual de impostos (aplicados ao custo de fábrica);
 * 
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio112 
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double custoFab = in.nextDouble();
      double percDist = in.nextDouble();
      double percImp = in.nextDouble();
      double valor = custoFab + (custoFab*(percDist/100)) + (custoFab*(percImp/100));
      System.out.print(formatter.format(valor));
    }
}
