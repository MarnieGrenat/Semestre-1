
/**
 * O objetivo deste programa é descobrir a duração de um jogo
 *
 * (Author) @Marnie Grenat
 * (Version) @07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio119
    {
  public static void main (String[] args)
  {
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int hInicio = n1;
      int hFim = n2;
      int duraçãoH = hFim - hInicio;
      System.out.print (duraçãoH);
      
    }
}
