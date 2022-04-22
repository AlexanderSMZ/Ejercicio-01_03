/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.g11ejercicio0103;

/**
 *
 * @author alexa
 */
public class G11Ejercicio0103 {

    public static void main(String[] args) {
        // ITEM B
        //---------------------------------------------------------------------
        
        var asignatura = new Asignatura();
        asignatura.docente="Rene Avila";
        asignatura.materiasTotalesCiclo=50;
        asignatura.nombreAsignatura="Electronica Analogica";
        asignatura.numeroAsignaturasCursa=33;
        
        var estudiante = new Estudiante();
        estudiante.nombre= "Alexander";
        estudiante.apellido= "Maxi";
        estudiante.yearNacimiento=1999;
        
        var calificacion = new Calificacion();
        calificacion.notaAprobada=7f;
        calificacion.notaExcelente=10f;
        calificacion.notaFinal=7.1f;
        
        System.out.println("El estudiante "+ estudiante.nombre + " " 
                            + estudiante.apellido + " tiene " 
                            + estudiante.yearNacimiento + " años. ");
        
        var aprobado=false;
        aprobado = calificacion.aprobado();
        if(aprobado==true){
            System.out.println("El estudiante "+ estudiante.nombre + " "
                                + estudiante.apellido + " aprobo la materia");
        }else{
            System.out.println("El estudiante "+ estudiante.nombre + " "
                               + estudiante.apellido + " no aprobo la materia");
        }
       
        System.out.println("El estudiante "+ estudiante.nombre 
                            + " le falta cursar " 
                            + asignatura.numeroAsignaturasCursa );
        
    }
}
