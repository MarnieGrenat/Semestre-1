
/**
 * O objetivo deste programa é listar três numeros (variaveis) em ordem crescente
 * 
 * @author Marnie Grenat
 * @version 20.04.2022
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Exercicio008
{
public static void main (String[] args){
    Locale.setDefault(Locale.ENGLISH);
    Scanner in = new Scanner(System.in);
    NumberFormat formatter = new DecimalFormat ("#0.0000");

    double a = in.nextDouble();;
    double b = in.nextDouble();
    double c = in.nextDouble();
    if(a>=b && b>=c){
        System.out.println(formatter.format(c));
        System.out.println(formatter.format(b));
        System.out.println(formatter.format(a));
    }
    else if(a>=c && c>=b){
        System.out.println(formatter.format(b));
        System.out.println(formatter.format(c));
        System.out.println(formatter.format(a));
    }
    else if(b>=a && a>=c){
        System.out.println(formatter.format(c));
        System.out.println(formatter.format(a));
        System.out.println(formatter.format(b));
    }
    else if(b>=c && c>=a){
        System.out.println(formatter.format(a));
        System.out.println(formatter.format(c));
        System.out.println(formatter.format(b));
    }
    else if(c>=a && a>=b){
        System.out.println(formatter.format(b));
        System.out.println(formatter.format(a));
        System.out.println(formatter.format(c));
    }
    else if(c>=b && b>=a){
        System.out.println(formatter.format(a));
        System.out.println(formatter.format(b));
        System.out.println(formatter.format(c));
    }
    }
    }
    

