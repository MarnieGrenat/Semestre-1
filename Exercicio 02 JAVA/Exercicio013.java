
/**
 * O objetivo deste programa é receber dois numeros e executar as operações.
 * Se 1, média entre os numeros digitados;
 * se 2, diferença do maior pelo menor;
 * se 3, produto entre os números digitados;
 * se 4, divisão do prineiro pelo segundo.
 * Caso nenhum dos dois, escrever "escolha errada"
 * 
 * @author Marnie Grenat
 * @version 10.04.2022
 */
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Exercicio013
{
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat ("#0.0000");
        double a = in.nextDouble();
        double b = in.nextDouble();
        int escolha = in.nextInt();
        if (escolha == 1){
            System.out.println (formatter.format((a+b)/2));
        }
        else if (escolha == 2) {
            if (a>b){
                System.out.println (formatter.format(a-b));
            }
            else if (b>a){
                System.out.println (formatter.format(b-a));
            }
        }
        else if (escolha == 3){
            System.out.println(formatter.format(a*b));
        }
        else if (escolha == 4){
            System.out.println(formatter.format(a/b));
        }
        else
        System.out.println ("Escolha errada");
        }
        }


