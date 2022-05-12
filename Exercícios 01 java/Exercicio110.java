
/**
 * O objetivo deste programa é calcular o salário do vendedor e anotar seu número.
 * salário total = salário fixo + (total de vendas * porcentagem)
 * sendo:
 * salario fixo = 500
 * total de vendas = 1100
 * porcentagem = 0.10
 * número = 1
 * 
 * (Author) @Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio110
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      
      int n = in.nextInt();
      double salF = in.nextDouble();
      double totV = in.nextDouble();
      double por = in.nextDouble();
      double salT = salF + (totV*(por/100));
      System.out.println (n);
      System.out.print (formatter.format(salT));
    }
}
