
/**
 * O objetivo deste programa é ler um numero correspondete à opção desejada pelo usuário, receber os dados
 * necessários para executar a operação e mostrar o resultado.
 * É necessário verificar a possibilidade de INVALIDO.
 * 
 * @author Marnie Grenat
 * @version 10.04.2022
 */
import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class Exercicio023{
    public static void main (String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat ("#0.0000");
    int opcao = in.nextInt();
    if (opcao == 1){
         double sal = in.nextDouble();
        if (sal > 0 && sal < 500){
          double imp = 0.05;
          double impImp= imp*sal;
              System.out.println(formatter.format(impImp));
          }
        else if (sal >= 500 && sal <= 850){
          double imp = 0.1;
          double impImp= imp*sal;
              System.out.println(formatter.format(impImp)); // ta errado isso aqui (mostrar no salario a porcentagem do imposto);
        }
        else if (sal > 850){
            double imp = 0.15;
            double impImp= sal*imp;
                System.out.println(formatter.format(impImp));
        }
        else{
        System.out.println ("ERRO");
        System.exit(0);
    }
}
    else if (opcao == 2){
     double sal = in.nextDouble();
     if (sal > 0 && sal > 1500){
         double newSal= sal+25;
         System.out.println(formatter.format(newSal));
        }
     else if (sal >= 750 && sal <= 1500){
         double newSal= sal+50;
         System.out.println(formatter.format(newSal));
        }
     else if (sal >= 450 && sal < 750){
         double newSal = sal+75;
         System.out.println(formatter.format(newSal));
        }
     else if (sal < 450){
         double newSal = sal + 100;
         System.out.println(formatter.format(newSal));
        }
     else {
         System.out.println("ERRO");
         System.exit(0);
     }
     }
     else if (opcao == 3){
         double sal = in.nextDouble();
         if (sal > 0 && sal <= 700){
             System.out.println ("Mal remunerado");
            }
         else 
         System.out.println("Bem remunerado");
}
else System.out.println ("ERRO");
}
}
