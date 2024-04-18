/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploanimal;

/**
 *
 * @author Nocturno
 */
public class Perro extends Mamifero{
    //atributos
    private String raza;
    
    //constructores
    public Perro(String _nombre, String _tipo_alimentacion, int _edad, int _gestacion, String _raza){
        super(_nombre, _tipo_alimentacion, _edad, _gestacion);
        raza = _raza;
    }
    
    //metodos
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
