/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicoherencia;

/**
 *
 * @author Nocturno
 */
public class Refrigerado extends Producto{
    //atributos
    private int codSup;
    
    //consructores
    public Refrigerado(){
    }
    
    public Refrigerado(String _fechaCad, int _numLote, String _nombre,int _clasificacion, int _codSup){
        super(_fechaCad, _numLote, _nombre, _clasificacion);
        codSup = _codSup;
    }
    
    //metodos
    public int getCodSup() {
        return codSup;
    }

    public void setCodSup(int codSup) {
        this.codSup = codSup;
    }
    
    @Override
    public String toString(){
        return super.toString() + ", es un producto refrigerado, cod de supervision: " + codSup;
    }
    
}
