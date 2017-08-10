/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Trabajador {
    private String nombre;
    private double horasSem, valorHora;
    
    public Trabajador(String pNombre, double x, double y){
        nombre = pNombre;
        horasSem = x;
        valorHora = y;
}
    public String darNombre(){
        return nombre;
    }
    public double valorPagar(){
        double base = 40*valorHora;
        if(horasSem <= 40)
            return valorHora*horasSem;
        else{
            if(horasSem <=48)
                return base+((horasSem-40)*valorHora*2);
            else
                return base+((horasSem-48)*valorHora*3)+16*valorHora;
        }
    }
}
