
/**
 * O objetivo deste programa é calcular fatorial de 5
 * existe 2 opções:
 * 1. multiplicar 5*4*3*2*1
 * 2. multiplicar n*(n-1) enquanto n>0 ou n>=1.
 * 
 * 
 * (Author) @Marnie Grenat
 * (Version) 10.04.2022
 */
import java.util.Scanner;
import java.util. Locale;
import java.text. DecimalFormat;
import java.text. NumberFormat;
public class Exercicio103
    {
  public static void main (String[] args){
      NumberFormat formatter = new DecimalFormat("#0.0000");
      int number = 5;
      int fat = number;
      int n = fat;
      while (n>1){
          fat=fat*(n-1); //enquanto n>1, fat será fat*(n-1), sendo n=5
          n--; //diminuir numero de cada operação
        }
      //System.out.print ("A fatorial de ");
      //System.out.print (number);
      //System.out.print (" é:");
      System.out.println(fat);
      }
    }
