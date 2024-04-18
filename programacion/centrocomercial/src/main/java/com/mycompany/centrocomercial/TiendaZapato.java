/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocomercial;

/**
 *
 * @author Nocturno
 */
public class TiendaZapato extends Centro{
    //atributos
    private String marcazap;
    private String tallazap;
    
    //constructores
    public TiendaZapato(String _ciudad, String _horario, String _marcazap, String _tallazap){
        super(_ciudad, _horario);
        marcazap = _marcazap;
        tallazap = _tallazap;
    }
    
    //metodos
    public String getMarcazap() {
        return marcazap;
    }

    public void setMarcazap(String marcazap) {
        this.marcazap = marcazap;
    }

    public String getTallazap() {
        return tallazap;
    }

    public void setTallazap(String tallazap) {
        this.tallazap = tallazap;
    }
    
    public String toString(){
        return super.toString() + ", en la tienda de zapatos de vende la marca " + marcazap + " y de la talla " + tallazap;
    }
    
}
