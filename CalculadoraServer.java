/* Autor: Sirlenon Macedo */ 
import java.rmi.Naming; 

public class CalculadoraServer { 
   public CalculadoraServer() { 
      try {  
            Naming.rebind("//localhost/CalculadoraRMI", new CalculadoraImple());
            System.out.println("Server Conetado"); 
      } catch (Exception e) { 
            System.out.println("Server nao conectado, Trouble: " + e); 
      }
   } 
   public static void main(String args[]) { 
         new CalculadoraServer();
   }
} 