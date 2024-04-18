/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Nocturno
 */
public class Cuenta {
    //atributos
    private String titular;
    private double cantidad;
    
    //contructores 
    public Cuenta(String _titular){
        titular = _titular;
        this.cantidad = 0;
    }
    public Cuenta(String _titular, double _cantidad){
        titular = _titular;
        this.cantidad = _cantidad;
    }
    public Cuenta(){
        
    }
    
    
    //metodos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString(){
        return "El titular  " + this.titular + " tiene " + this.cantidad + " euros";
    }
    
    public void ingresar(double _cantidad){
        if (_cantidad>0)
            this.cantidad += _cantidad;
    }
    
    public void retirar(double _cantidad){
        if(this.cantidad - _cantidad < 0){
            this.cantidad = 0;
        }
        else{
            this.cantidad = this.cantidad - _cantidad;
        }
    }
    
    
    
}
