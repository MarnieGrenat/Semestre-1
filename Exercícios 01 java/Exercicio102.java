
/**
 * O objetivo deste programa é calcular o salário total de um funcionário x, sendo x um número inteiro.
 * 
 * (Author) @Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio102
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int num = in.nextInt();
      double hTrab = in.nextDouble();
      double rsHora = in.nextDouble();
      int filhos = in.nextInt();
      double salFm = (in.nextDouble()); // porcentagem? será?
      double salário = (rsHora*hTrab)+(filhos*salFm);
      //System.out.print("Salário total do trabalhador ");
      System.out.println( num);
      //System.out.print(" = ");
      System.out.println (formatter.format(salário));
      
      
      
    }
}
