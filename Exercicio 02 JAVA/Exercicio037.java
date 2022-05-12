
/**
 * o objetivo deste programa é receber o código do produto comprado e a quantidade do produto (pode ser 
 * fracionária) e calcular o preço unitario do produto comprado, o preço total da nota, o valor do desconto
 * e o preço final da nota depois do desconto.
 * 
 * @author Marnie Grenat
 * @version 14.04.22
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercicio037
{
public static void main (String[] args){
    Locale.setDefault(Locale.ENGLISH);
    Scanner in = new Scanner (System.in);
    NumberFormat formatter = new DecimalFormat ("#0.0000");
    int cod = in.nextInt();
    double quantidade = in.nextDouble();
    double preco = 0;
    double total = 0;
    if (cod >=1 && cod <= 10){
        preco += 10;
        total = preco*quantidade;
        System.out.println (formatter.format(preco));
        System.out.println (formatter.format(total));
        if (total <= 250){
            double desconto = total*0.05;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 250 && total <= 500){
            double desconto = total*0.1;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 500) { 
            double desconto = total*0.15;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
    }
}
    else if (cod>=11 && cod <= 20){
        preco +=15;
        total = preco*quantidade;
        System.out.println(formatter.format(preco));
        System.out.println (formatter.format(total));
                if (total <= 250){
            double desconto = total*0.05;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 250 && total <= 500){
            double desconto = total*0.1;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 500) { 
            double desconto = total*0.15;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
    }
}
    else if(cod >= 21 && cod <= 30){
        preco +=20;
        total = preco*quantidade;
        System.out.println(formatter.format(preco));
        System.out.println (formatter.format(total));
                if (total <= 250){
            double desconto = total*0.05;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 250 && total <= 500){
            double desconto = total*0.1;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 500) { 
            double desconto = total*0.15;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
    }
    }
    else if(cod >= 31 && cod <= 40){
        preco +=30;
        total = preco*quantidade;
        System.out.println (formatter.format(preco));
        System.out.println (formatter.format(total));
                if (total <= 250){
            double desconto = total*0.05;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 250 && total <= 500){
            double desconto = total*0.1;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
        }
        else if (total > 500) { 
            double desconto = total*0.15;
            double descFinal= total-(desconto);
            System.out.println(formatter.format(desconto));
            System.out.println(formatter.format(descFinal));
    }
    }
    }
}
