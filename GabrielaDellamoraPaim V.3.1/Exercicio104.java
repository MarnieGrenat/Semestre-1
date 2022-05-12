/**
 * certas medidas de formas geométricas com as mesmas medias a b e c
 * 
 * 
 * (Author) Marnie Grenat
 * (Version) 07.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio104
    {
  public static void main (String[] args){
      Locale.setDefault (Locale.ENGLISH);
      Scanner in = new Scanner (System.in);
      NumberFormat formatter = new DecimalFormat("#0.0000");
      //System.out.println("escreva a variável A");      
      double a = in.nextDouble();
      //System.out.println("escreva a variável B");
      double b = in.nextDouble();
      //System.out.println("escreva a variável C");
      double c = in.nextDouble();
      double areaT = (a*b)/2;
      double areaC = Math.PI*(Math.pow (c,2));
      double areaTr = ((a+b)*c)/2;
      double areaQ = (b*b);
      double areaR = (a*b);
      double areaCubo = (Math.pow (c, 2))*6;
      
      //System.out.print("A área de um triângulo é: ");
      System.out.println(formatter.format(areaT));
      //System.out.print("O Raio de um círculo é: ");
      System.out.println (formatter.format(areaC));
      //System.out.print("A área de um triângulo é: ");
      System.out.println(formatter.format(areaTr));
      //System.out.print("A área de um quadrado é: ");
      System.out.println(formatter.format(areaQ));
      //System.out.print("A área de um retângulo é: ");
      System.out.println(formatter.format(areaR));
      //System.out.print ("A área de um cubo é: ");
      System.out.println(formatter.format(areaCubo));
      
    }
    }
