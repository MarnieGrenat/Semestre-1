/**
 * o objetivo deste programa é receber o preço atual de um produto, calcular e mostrar o valor do desconto
 * e o novo preço.
 * 
 * @author Marnie Grenat
 * @version 12.04.22
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Exercicio033
{
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner (System.in);
        NumberFormat formatter = new DecimalFormat ("#0.0000");
        double preco = in.nextDouble();
        if (preco <= 30){
            double desconto = 0*preco;
            double novoP = preco-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(novoP));
        }
        else if (preco > 30 && preco <= 100){
            double desconto = 0.10*preco;
            double novoP = preco-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(novoP));
        }
        else if (preco > 100){
            double desconto = 0.15*preco;
            double novoP = preco-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(novoP));
        }
        else 
        System.out.println("ERRO");
            
        }
        }