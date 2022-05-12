
/**
 * O objetivo deste programa é receber um código que corresponde ao cargo de um funcionário e seu salário 
 * atual para calcular o aumento do seu salário. Mostrar cargo, aumento e novo salário.
 * 
 * @author Marnie Grenat
 * @version 10.04.2022
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Exercicio022{
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner (System.in);
        NumberFormat formatter = new DecimalFormat ("0.0000");
        int cod = in.nextInt();
        double sal = in.nextDouble();
        if ( cod == 1.0){
            System.out.println("Escriturario");
            System.out.println(formatter.format(sal *0.5));
            System.out.println(formatter.format(sal + (sal* 0.5)));
        }
        else if (cod == 2){
            System.out.println("Secretario");
            System.out.println(formatter.format(sal *0.35));
            System.out.println(formatter.format(sal+ (sal*0.35)));
        }
        else if (cod ==3){
            System.out.println("Caixa");
            System.out.println(formatter.format(sal *0.20));
            System.out.println(formatter.format(sal+(sal*0.20)));
        }
        else if (cod == 4){
            System.out.println("Gerente");
            System.out.println(formatter.format(sal *0.10));
            System.out.println(formatter.format(sal+(sal*0.10)));
        }
        else if (cod == 5){
            System.out.println("Diretor");
            System.out.println("0.0000");
            System.out.println(formatter.format(sal));
        }
        }
        }
