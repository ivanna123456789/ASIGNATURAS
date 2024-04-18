/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurassh;

/**
 *
 * @author Nocturno
 */
public class Dimension {
    //attributos
    private double alto;
    private double ancho;
    private double profundidad;
    
    //constructores
    public Dimension(){
        alto = 0;
        ancho = 0;
        profundidad = 0;
    }
    
    public Dimension(double _alto, double _ancho, double _profundidad){
        alto = _alto;
        ancho = _ancho;
        profundidad = _profundidad;
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

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public double getVolumen(){
        //me calcula el volumen
        return (alto*ancho*profundidad);
    }
    
    @Override
    public String toString(){
        //devuelve todos los datos de la clase y le concateno el metodo que me devuelve el volumen
        return "El alto de la figura es " + alto + 
                " centimetros, el ancho es " + ancho + 
                ", la profundidad es " + profundidad + 
                " y el volumen total es " + getVolumen();
    }
    
}
