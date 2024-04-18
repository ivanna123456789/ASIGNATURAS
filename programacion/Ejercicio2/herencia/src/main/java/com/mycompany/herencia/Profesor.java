/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Nocturno
 */
public class Profesor extends Trabajador{
    //atributos
    private String departamento;
    
    
    //constructor
    public Profesor (String _DNI, String _nombre, String _apellido1, String _apellido2, int _nrp, String _departamento){
        super( _DNI, _nombre, _apellido1, _apellido2, _nrp);
        departamento = _departamento;
    }
    
    //metodos
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString(){
        return super.toString() + ", es profesor/a en el departamento " + departamento;
    }
    
}
