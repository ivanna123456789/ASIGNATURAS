/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebapoo2;

/**
 *
 * @author Nocturno
 */
public class PruebaPOO2 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5, "Negro");
        Circulo circulo2 = new Circulo(10, "Rojo");
        
        circulo1.setColor("Amarillo chillón");
        
        System.out.println("El color del circulo 1 es: " + circulo1.getColor());
        
        Circulo circulo3 = new Circulo (15);
        circulo3.setColor("Verde");
        
        System.out.println("El area del circulo1 es " + String.format("%.3f",circulo1.calcularArea()));
        System.out.println("El area del circulo2 es " + circulo2.calcularArea());
        System.out.println("El area del circulo3 es " + circulo3.calcularArea());
        
    }
}
