/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocomercial;

/**
 *
 * @author Nocturno
 */
public class Centro {
    //atributos
    public String ciudad;
    public String horario;
    
    //constructores
    public Centro(String _ciudad, String _horario){
        ciudad = _ciudad;
        horario = _horario;
    }
    
    //metodos
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String toString(){
        return "El centro comercial que se encuentra en " + ciudad + " tiene un horario de " + horario;
    }
    
    
}
