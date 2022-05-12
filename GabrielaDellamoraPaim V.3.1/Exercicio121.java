
/**
 * O objetivo deste programa é descobrir a duração de um jogo em minutos.
 *
 *(Author) @Marnie Grenat
 *(Version) @07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio121
    {
  public static void main (String[] args)
  {
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
     int num = in.nextInt();
     int a = num;
     int invA = 0, temp;
     while (a!=0){
     temp = a %10;
     invA = invA*10+temp;
     a = a/10;
    }
    System.out.println(num);
    System.out.println(invA);
     
    }
}
