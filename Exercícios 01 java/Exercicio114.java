/**
 * O objetivo deste programa é calcular o aumento de salário de um funcionário x de uma empresa.
 * sendo usado apenas 80% do valor do INTEMP, consideraremos INTEMP como 80% de 10.0;
 *
 * 
 * 
 * @ (Author) Marnie Grenat
 * @(Version) 10.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio114
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int num = in.nextInt();
      //
      double salA = in.nextDouble();
      double intemp = in.nextDouble();
      double intemp2 = (intemp*0.80/100) ;
      double ind = in.nextDouble();
      double aumento = ((intemp2)*salA)+((ind/100)*salA);
      System.out.println(num);
      System.out.println(formatter.format(aumento));
      System.out.println(formatter.format(salA+aumento));
    }
}
