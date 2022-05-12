
/**
 * O objetivo deste programa é receber altura (em metros) e sexo do usuário e calcular seu peso ideal.
 * 
 * @author Marnie Grenat
 * @version 14.04.22
 */
 import java.util.Scanner;
 import java.util.Locale;
 import java.text.DecimalFormat;
 import java.text.NumberFormat;
public class Exercicio042
{
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner (System.in);
        NumberFormat formatter = new DecimalFormat ("#0.0000");
        double alt = in.nextDouble();
        String sexo = in.next();
        double pesoIdeal = 0;
        if (sexo.equals("F") || sexo.equals("f")){
            pesoIdeal = (62.1*alt)-44.7;
        }
        else if ( sexo.equals("M") || sexo.equals("m")){
            pesoIdeal = (72.7*alt)-58;
        }   
        System.out.print(formatter.format(pesoIdeal));
        }
    }
