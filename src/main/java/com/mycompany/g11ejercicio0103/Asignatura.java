/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g11ejercicio0103;

/**
 *
 * @author alexa
 */
public class Asignatura {
    String nombreAsignatura;
    String docente;
    int numeroAsignaturasCursa;
    int materiasTotalesCiclo;
    
    public int calcularMateriasFaltantes(){
        var retorno=1000000;
        retorno=this.materiasTotalesCiclo-this.numeroAsignaturasCursa;
        return retorno;
    }
}
