
/**
 * O objetivo deste programa é ler as coordenadas de dois pontos no plano cartesiano, calcular e escrever a distância
 * entre esses dois pontos.
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) @07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio115
    {
  public static void main (String[] args)
  {
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double x1 = in.nextDouble();
      double y1 = in.nextDouble();
      double x2 = in.nextDouble();
      double y2 = in.nextDouble();
      double dist = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
      System.out.print(formatter.format(dist));
      
    }
}
