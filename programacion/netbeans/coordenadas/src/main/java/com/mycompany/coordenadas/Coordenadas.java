/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coordenadas;

/**
 *
 * @author Nocturno
 */
public class Coordenadas {

    public static void main(String[] args) {
        double res;
        Punto punto1 = new Punto(1,3);
        Punto punto2 = new Punto(4);
        punto2.setY(5);
        
        
        res = punto1.calcularDistanciaEuclidea(punto2);
        
        System.out.println("La distancia entre el punto 1 y el punto 2 es " + res);
        
    }
}
