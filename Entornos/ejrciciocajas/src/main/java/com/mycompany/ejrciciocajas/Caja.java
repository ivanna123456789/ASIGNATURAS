/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejrciciocajas;

/**
 *
 * @author Nocturno
 */
public class Caja {
    //Atributos
    private double alto;
    private double ancho;
    private double largo;
    
    
    //constructores
    public Caja(){}
    
    public Caja(double _alto, double _ancho, double _largo){
        alto =  _alto;
        ancho = _ancho;
        largo = _largo;
    }
    public Caja(double _alto, double _largo){
        alto =  _alto;
        largo = _largo;
    }
    
    
    //metodos
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
    public String toString(){
        return "La caja 1 tiene las dimensiones: " + alto + " de alto, " + ancho + " de ancho y " + largo + " de largo ";
    }
    
    public void esCubo(double _alto, double _ancho, double _largo){
        if(_alto==_ancho && _alto==_largo){
            System.out.println("Esta caja es un cubo");
        }
        else{
            System.out.println("Esta caja no es un cubo");
        }
    }
    
    public void volumen(double _alto, double _ancho, double _largo){
        double vol = _alto * _ancho * _largo;
        System.out.println("El volumen es " + vol);
    }
    
}
