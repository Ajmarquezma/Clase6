package clase.pkg6;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Clase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int continuar = 0, opcion = 0;
        Empresa empresa = new Empresa("xxx", 123);

        do {
            System.out.println("1.Crear Departamento");
            System.out.println("2. Crear Empleado");
            System.out.println("3. Listar Departamentos");
            if (opcion == 1) {
                System.out.println("Nombre Departamento");
                String nombre = in.next();
                Departamento nuevo = new Departamento(nombre);
                if (empresa.addDepartemento(nuevo)) {
                    System.out.println("se agregó satisfactoriamente");
                } else {
                    System.out.println("Problemas al registrar el departamento");
                }
            } else if (opcion == 2) {

            } else if (opcion == 3) {
                ArrayList<Departamento> departamentos = empresa.listarDepartamentos();
                for (Departamento departamento : departamentos) {
                        System.out.println(departamento.getNombre());
                    }
            }else{
                System.out.println("Opción invalida");
            }
        }while(continuar ==0);
    }

}
