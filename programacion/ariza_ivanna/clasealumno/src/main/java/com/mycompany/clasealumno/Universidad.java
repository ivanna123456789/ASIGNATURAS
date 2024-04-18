/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasealumno;

/**
 *
 * @author Nocturno
 */
public class Universidad {
    //atributos
    private String nombre;
    
    //contructores
    public Universidad (String _nombre){
        this.nombre = _nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*Universidad u = new Universidad("Campus Maria Zambrano");
        Alumno a = new Alumno("Juan");
        
        System.out.println(a.getAlumno() + " estudia en el " + u.getNombre());*/
}
