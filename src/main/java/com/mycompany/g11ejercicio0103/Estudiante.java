/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g11ejercicio0103;

/**
 *
 * @author alexa
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    int yearNacimiento;
    
    public int calcularYear(int currentYear){
        var retorno = 1000000;
        retorno=currentYear-this.yearNacimiento;
        return retorno;
    }
    
}
