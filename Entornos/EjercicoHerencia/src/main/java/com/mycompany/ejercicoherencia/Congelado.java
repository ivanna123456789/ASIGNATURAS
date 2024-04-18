/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicoherencia;

/**
 *
 * @author Nocturno
 */
public class Congelado extends Producto{
    //atributos
    private double tempCon;
    
    //constructores

    /**
     *
     */
    public Congelado(){
    }
    
    /**
     *
     * @param _fechaCad
     * @param _numLote
     * @param _nombre
     * @param _clasificacion
     * @param _tempCon
     */
    public Congelado(String _fechaCad, int _numLote, String _nombre, int _clasificacion, double _tempCon){
        super(_fechaCad, _numLote, _nombre, _clasificacion);
        tempCon = _tempCon;
    }
    
    //metodos

    /**
     *
     * @return
     */
    public double getTempCon() {
        return tempCon;
    }

    /**
     *
     * @param tempCon
     */
    public void setTempCon(double tempCon) {
        this.tempCon = tempCon;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return super.toString() + ", es un congelado, temperatura de congelado:" + tempCon;
    }
    
}
