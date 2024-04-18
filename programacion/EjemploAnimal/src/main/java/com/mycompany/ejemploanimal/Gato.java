/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemploanimal;

/**
 *
 * @author Nocturno
 */
public class Gato extends Mamifero{
    //atributos
    private String pedigri;
    
    //metodos
    public Gato(){
    }
    
    public Gato(String _nombre, String _tipo_alimentacion, int _edad, int _gestacion, String _pedigri){
        super(_nombre, _tipo_alimentacion, _edad, _gestacion);
        pedigri = _pedigri;
    }
    
    //constructores
    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }
    
    public String toString(){
        return super.toString() + ", con pedigri " + pedigri;
    }
    
}
