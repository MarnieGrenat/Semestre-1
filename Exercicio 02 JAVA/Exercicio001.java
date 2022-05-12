/**
 * O objetivo deste programa é calcular a média ponderada das notas de alunos 
 * e separá-los em grupos denominados de A, B, C, D e E, dependendo das notas
 * descritas nas médias de notas dos alunos.
 * 
 * @author Marnie Grenat
 * @version 10.04.2021
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercicio001 {
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);    
    NumberFormat formatter = new DecimalFormat ("#0.0000");
        double trabLab = in.nextDouble();
        double avSem = in.nextDouble();
        double eF = in.nextDouble();
        double medP = (2*trabLab + 3*avSem + 5*eF)/(2+3+5);
        if ( medP >=  8.0 && medP <= 10.0){
            System.out.println ((formatter.format(medP)) + " A");
        }
        else
        if ( medP >= 7.0 && medP < 8.0){
            System.out.println ((formatter.format(medP)) + " B");
        }
    
        else 
        if (medP >= 6.0 && medP < 7.0 ){
            System.out.println ((formatter.format(medP)) + " C");
        }
    
        else
        if (medP >= 5.0 && medP < 6.0){
            System.out.println ((formatter.format(medP)) + " D");
        }
    
        else 
        if (medP < 5.0){
            System.out.println ((formatter.format(medP)) + " E");
        }        

        else { 
        System.exit(0);
        System.out.println (" Escreva valores válidos.");
    }
        }
        }
