/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Clase {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double chicos;
        double chicas;
        
        
        System.out.println("Vamos a calcular el procentaje de chicos y chicas que hay en una clase.");
        System.out.println("Introduce el numero de chicos: ");
        chicos = input.nextInt();
        System.out.println("Ahora introduce el numero de chicas: ");
        chicas = input.nextInt();
        
        double total = chicos+chicas;
        
        double porChicos = (chicos*100)/total;
        double porChicas = 100-porChicos;
        
        System.out.println("El porcentaje de chicos es: " + porChicos + (" y el de chicas es : ") + porChicas);
        
        
    }
}
