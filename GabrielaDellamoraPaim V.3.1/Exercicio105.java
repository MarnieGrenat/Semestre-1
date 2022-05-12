
/**
 * O objetivo deste programa é calcular os numeros impares entre 10 e 20
 * 2 opções:
 * system.out.print (numeros aqui);
 * usar if divisível por 2  else escrever n.
 * n consigo fazer com que o numero seja entre 10 e 20
 * usar min e max, mas como?
 * 
 * (Author) @Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio105
    {
  public static void main (String[] args)
  {
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      //System.out.println("escreva o número inicial");
      int i = 10; // número inicial
      //System.out.println("escreva o número final");
      int f = 20; // número final
      int n = i; // número
      
      //System.out.println("Os números ímpares entre 10 e 20 são: ");
      for (n = i; n <= f; n++) // n entre i e f; somar n++
      {
      if (n%2!=0) // comando que permite o calculo dos numeros ímpares entre 10 e 20
      {
          System.out.println (n);
    }
}
}
}
