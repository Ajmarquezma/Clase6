/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg6;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String nombre;
    private int nit;
    private ArrayList<Empleado> empleados;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nombre, int nit, ArrayList<Empleado> empleados, ArrayList<Departamento> departamento) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Departamento> listarDepartamentos() {
        return this.departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public boolean addEmpleado(Empleado empleado){
        if(this.empleados.add(empleado)==true){
            return true;
    }else{ 
            return false;
        }
    }
    
    public boolean addDepartemento(Departamento departamento){
        if (this.departamentos.add(departamento)==true){
            return true;
        }else{
            return false;
        }
    }

    public Empleado darDirector(String nombreDepartamento){
        Empleado director = null;
        for (int i = 0; i<this.departamentos.size(); i++){
            Departamento aux = this.departamentos.get(i);
            if(aux.getNombre().equals(nombreDepartamento)){
                director = aux.getDirector();
                break;
            }
        }
        return director;
    }
    
    
}
