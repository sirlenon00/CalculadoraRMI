/* Autor: Sirlenon Macedo */
import java.rmi.Naming; 
import java.rmi.RemoteException;
import java.util.Scanner;

public class CalculadoraCliente  
{ 
    public static void main(String[] args)  throws RemoteException
    { 
        Scanner sc = new Scanner(System.in);
        try{
            Calculadora c = (Calculadora)Naming.lookup("//" + args[0] +"/CalculadoraRMI");
            System.out.println("Digite o numero da opcao da calculadora:");
            System.out.println("1 - Soma.");
            System.out.println("2 - Subtracao.");
            System.out.println("3 - Multiplicacao.");
            System.out.println("4 - Divisao.");
            System.out.println("5 - Sair.");
            int opcao = sc.nextInt();
            int x,y;
            while(opcao != 5)
            {
                if(opcao == 1)
                {
                    System.out.println("Digite dois numeros:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Resultado da Soma: "+c.add(x,y));
                    System.out.println();
                }
                if(opcao == 2)
                {
                    System.out.println("Digite dois numeros:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Resultado da Subtracao: "+ c.sub(x,y));
                    System.out.println();
                }
                if(opcao == 3)
                {
                    System.out.println("Digite dois numeros:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Resultado da Multiplicacao: "+ c.mult(x,y));
                    System.out.println();
                }
                if(opcao == 4)
                {
                    System.out.println("Digite dois numeros:");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    System.out.println("Resultado da Divisao: "+ c.div(x,y));
                    System.out.println();
                }
                System.out.println("Digite o numero da opcao da calculadora:");
                System.out.println("1 - Soma.");
                System.out.println("2 - Subtracao.");
                System.out.println("3 - Multiplicacao.");
                System.out.println("4 - Divisao.");
                System.out.println("5 - Sair."); 
                opcao = sc.nextInt();   
            }
        }catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    } 
}