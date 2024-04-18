/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbol;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Arbol {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double distancia;
        double grados;
        
        System.out.println("Vamos a calcular la altura de un árbol a partir de la distancia a la qu estés y los grados que introduzcas." );
        System.out.println("Introduce a que distancia está el árbol:" );
        distancia = input.nextDouble();
        System.out.println("Introduce los grados:" );
        grados = input.nextDouble();
        
        double num = Math.toRadians(grados);
        
        double y = distancia*(Math.tan(num));
        
        System.out.println("La altura del árbol es: "+ y);
    }
}
