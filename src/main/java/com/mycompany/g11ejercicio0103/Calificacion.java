/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g11ejercicio0103;

/**
 *
 * @author alexa
 */
public class Calificacion {
    Float notaExcelente;
    Float notaFinal;
    Float notaAprobada;
    
    public boolean aprobado(){
        var retorno=false;
        if (notaFinal>=notaAprobada)
            retorno=true;
        else
            retorno=false;
        return retorno;
    }
    
    
}
