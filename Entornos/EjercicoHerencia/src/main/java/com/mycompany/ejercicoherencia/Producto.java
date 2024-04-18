/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicoherencia;

/**
 *
 * @author Nocturno
 */
public class Producto {
    //atributos
    private String fechaCad;
    private int numLote;
    private String nombre;
    private int clasificacion;
    
    //constructores
    public Producto(){
    }
    
    public Producto(String _fechaCad, int _numLote, String _nombre, int _clasificacion){
        fechaCad = _fechaCad;
        numLote =_numLote;
        nombre = _nombre;
        clasificacion = _clasificacion;
    }

    
    //metodos
    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre + ", numero de lote: " + numLote + ", fecha de caducidad: " + fechaCad + ", num de clasificacion: " + clasificacion;
    }
}
