
package javaapplication38;
import java.util.*;
import javax.swing.*;

public class JavaApplication38 {

    /**
     * @param args the command line arguments
     */
    //private ArrayList<Trabajador> trabajadores;
   
    public static void main(String[] args) {    
        Scanner x = new Scanner(System.in);
        
        //trabajadores = new ArrayList();
        Trabajador a = new Trabajador(x.nextLine(), x.nextDouble(),x.nextDouble());
        System.out.print("Valor a pagar a " +a.darNombre()+ " : "+ a.valorPagar()); 
    }
    
}
