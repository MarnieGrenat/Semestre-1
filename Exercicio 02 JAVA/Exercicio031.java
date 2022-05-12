
/**
 * o objetivo do programa é receber o tipo de investimento, seu valor, calcular e mostrar o valor corrigido
 * após um mês de investimento, de acordo com o tipo de investimento.
 * 
 * @author Marnie Grenat
 * @version 12.04.22
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Exercicio031
{
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner (System.in);
        NumberFormat formatter = new DecimalFormat ("#0.0000");
        int tipo = in.nextInt();
        if (tipo == 1){
            double pou= in.nextDouble();
            double val= pou+(pou*0.03);
            System.out.println(formatter.format(val));
        }
        else if (tipo == 2){
            double pou = in.nextDouble();
            double val = pou+(pou*0.04);
            System.out.println(formatter.format(val));
        }
        else
        System.out.println ("ERRO");
        }
        }
