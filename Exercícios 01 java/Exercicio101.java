
/**
 * O objetivo deste programa é calcular diversos tipos de média.
 * 
 * @(Author) Marnie Grenat
 * @(Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio101
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double a = in.nextDouble();
      double b = in.nextDouble();
      double c = in.nextDouble();
      double ma = (a+b+c) / 3;
      double mh = 3 / (1/a +1/b + 1/c);
      double mg = Math.cbrt (a*b*c);
      double mp = (1*a + 2*b + 3*c) / (1+2+3);
        // Com as variáveis e os calculos apresentados ao programa, me resta apurar os resultados.
      //System.out.println ("Respostas do exercício 101");
      //System.out.print (" média aritmética = ");
      System.out.println (formatter.format(ma));
      //System.out.print ("Média harmônica = ");
      System.out.println (formatter.format(mh));
      //System.out.print ("Média geométrica = ");
      System.out.println (formatter.format(mg));
      //System.out.print ("Média ponderada = ");
      System.out.println (formatter.format(mp));

  }
}
