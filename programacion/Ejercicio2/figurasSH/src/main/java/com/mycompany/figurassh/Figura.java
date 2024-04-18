/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurassh;

/**
 *
 * @author Nocturno
 */
public class Figura {
    //atributos 
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimensiones;
            
    //consturctores
    public Figura(String _codigo, double _precio, Dimension _dimensiones, Superheroe _superheroe){
        codigo = _codigo;
        precio = _precio;
        superheroe = _superheroe;
        dimensiones = _dimensiones;
        
    }
    
    //metodos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    @Override
    public String toString(){
        return "El codigo de la figura es " + codigo +
                ", el precio de la figura es " + precio +
                ", la descripcion del superheroe es: " + superheroe +
                ", las dimensiones de las figuras son " + dimensiones;
    }
    
    public void subirPrecio(double cantidad){
        //le sumo al precio inicial la cantidad decidida
        precio += cantidad;
    }
}
