/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coordenadas;

/**
 *
 * @author Nocturno
 */
public class Punto {
    //Atributos
    private double x;
    private double y;
    
    //constructor
    public Punto (double _x, double _y){
        x = _x;
        y = _y;
    }
    public Punto (double _x){
        x = _x;
    }
    public Punto(){}
    
    //metodos
    public double getX() {//func
        return x;
    }

    public void setX(double x) {//pro
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double calcularDistanciaEuclidea(Punto otroPunto){
        double x1 = this.x;
        double y1 = this.y;
        double x2 = otroPunto.x;
        double y2 = otroPunto.y;
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
    
}
