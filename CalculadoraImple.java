/* Autor: Sirlenon Macedo */
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
    
public class CalculadoraImple extends UnicastRemoteObject implements Calculadora 
{ 
    public CalculadoraImple() throws RemoteException  
    { 
        int a,b; 
    } 
    public int add(int a, int b) throws RemoteException  
    { 
        return a+b; 
    }
    public int sub(int a, int b) throws RemoteException  
    { 
        return a-b; 
    } 
    public int mult(int a, int b) throws RemoteException  
    { 
        return a*b; 
    } 
    public int div(int a, int b) throws RemoteException  
    { 
        return a/b; 
    }  
}