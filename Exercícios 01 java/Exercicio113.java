
/**
 * O objetivo deste programa é calcular o salário de um vendedor de carros
 * salário fixo + comissão fixa /carro + 5% do valor da venda
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio113
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int n = in.nextInt();
      int numC = in.nextInt();
      double valC = in.nextDouble();
      double salF = in.nextDouble();
      double comC = in.nextDouble();
      double por = 5;//%
      double salário = salF+ (comC*numC) + ((numC*valC)*(por/100));
      System.out.println (n);
      System.out.println(formatter.format(salário));
    }
}
