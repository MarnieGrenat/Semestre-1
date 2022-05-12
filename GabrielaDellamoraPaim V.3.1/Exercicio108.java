
/**
 *  O objetivo deste programa é calcular a distãncia de um avião em uma altitude A com velocidade V do ponto P
 * depois de passar pelo ponto P há 30s, sendo instante t=0;
 * sabemos que o formato da distância do avião do ponto P forma um triângulo, sendo altitude (A=4000) altura
 * do triângulo retângulo.
 * 
 * (Author) @MarnieGrenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio108
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      double vel = in.nextDouble();
      double alt = in.nextDouble();
      double t = 30;
      double dist1 = vel*t;
      double distP = Math.sqrt(Math.pow(alt, 2)+Math.pow(dist1,2));
      System.out.println (formatter.format(distP));
    
      
    }
}
