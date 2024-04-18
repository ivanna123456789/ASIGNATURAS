/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicoherencia;

/**
 *
 * @author Nocturno
 */
public class Fresco extends Producto{
    //atributos
    private String fechaEnvasado;
    private String Pais;
    
    //constructores
    public Fresco(){
    }
    
    public Fresco(String _fechaCad, int _numLote, String _nombre,int _clasificacion, String _fechaEnvasado, String _Pais){
        super(_fechaCad, _numLote, _nombre, _clasificacion);
        fechaEnvasado =_fechaEnvasado;
        Pais = _Pais;
    }
    
    //metodos
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", es un producto fresco, su fecha de envasado es " + fechaEnvasado + " y su pais de origen es " + Pais;
    }
    
}
