import java.util.InputMismatchException;
import java.util.Scanner;

public class dividePorZero{
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        boolean continuar = true;

        do{
            try {
                System.out.print("Insira um número: ");
                int a = s.nextInt();
                System.out.print("Insira por qual número quer dividir: ");
                int b = s.nextInt();
                
                System.out.print((a / b) + " ... " );
                continuar = false;
            }
            catch(InputMismatchException e1){
                System.err.println("Por gentileza use somente números inteiros: ");
                s.nextLine();
            }
            catch(Throwable e2){
                System.err.println("Desafiastes os deuses da matemática ao tentar realizar a divisão por zero...");
            }
            finally{
                System.out.println("Finally executando...");
            }
        } while (continuar);
    }
}