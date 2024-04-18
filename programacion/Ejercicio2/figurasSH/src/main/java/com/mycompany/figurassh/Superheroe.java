/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurassh;

/**
 *
 * @author Nocturno
 */
public class Superheroe {
    //atributos 
    private String nombre;
    private String descripcion;
    private boolean capa;
    
    //constructores
    public Superheroe(String _nombre){
        nombre = _nombre;
        descripcion = "";
        capa = false;
    }
    
    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    
    //comando que hay que poner siempre en el to String para evitar errores 
    @Override
    public String toString(){
        String tienecapa = ""; //string vacio
        if(capa == false){//entra si no tiene
            tienecapa = "no tiene capa";
        }else{//entra si tiene capa
            tienecapa= "si tiene capa";
        }
        //devuelve todos los datos de la clse y concatena si tienen o no tiene capa
        return "El superheroe se llama " + nombre + ", su descripcion es " + descripcion + "y " + tienecapa;
    }
    
    
    
}
