/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocomercial;

/**
 *
 * @author Nocturno
 */
public class TiendaRopa extends Centro{
    //atributos
    private String marcaropa;
    private String tallaropa;
    
    //constructores
    public TiendaRopa(String _ciudad, String _horario,String _marca, String _talla){
        super(_ciudad, _horario);
        marcaropa = _marca;
        tallaropa = _talla;
    }
    
    //metodos
    public String getMarca() {
        return marcaropa;
    }

    public void setMarca(String marca) {
        this.marcaropa = marca;
    }

    public String getTalla() {
        return tallaropa;
    }

    public void setTalla(String talla) {
        this.tallaropa = talla;
    }
    
    public String toString(){
        return super.toString() + ", en la tienda de ropa hay marca " + marcaropa + " y son de talla " + tallaropa ;
    }
    
}
