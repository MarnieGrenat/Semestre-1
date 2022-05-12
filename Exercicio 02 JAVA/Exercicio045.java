
/**
 * O objetivo deste programa é calcular e mostrar o peso da carga do caminhão convertido em quilos,
 * o preço da carga do caminhão, o valor do imposto e o valor total transportado pelo caminhão.
 * É preciso ler o código do estado, o codigo da carga e o peso em da carga em toneladas.
 * 
 * @author Marnie Grenat
 * @version 14.04.22
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Exercicio045
{
    public static void main (String[] args){
    Locale.setDefault(Locale.ENGLISH);
    Scanner in = new Scanner (System.in);
    NumberFormat formatter = new DecimalFormat ("#0.0000");
    int codEst = in.nextInt();
    double imp = 0;
    double ton = in.nextDouble();
    int codCar = in.nextInt();
    double pKg = 0;
    if (codEst == 1){
        imp = 0.35;
    }
    else if (codEst == 2){
        imp = 0.25;
    }
    else if (codEst == 3){
        imp = 0.15;
    }
    else if (codEst == 4){
        imp = 0.05;
    }
    else if (codEst == 5){
        imp = 0;
    }
    if (codCar >= 10 && codCar <= 20){
        pKg = 100;
    }
    else if (codCar > 20 && codCar <= 30){
        pKg = 250;
    }
    else if (codCar > 30 && codCar <=40){
        pKg = 340;
    }
    double kg = ton*1000;
    System.out.println (formatter.format(kg));
    double precFinal = (kg*pKg);
    System.out.println (formatter.format(precFinal));
    double imposto = precFinal*imp;
    System.out.println (formatter.format(imposto));
    double precoFinal = precFinal + imposto;
    System.out.println (formatter.format(precoFinal));
    }
}
