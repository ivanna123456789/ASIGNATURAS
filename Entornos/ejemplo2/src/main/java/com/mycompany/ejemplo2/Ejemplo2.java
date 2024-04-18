/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo2;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Double radio, volumen;
        
        System.out.println("Vamos a calcular el volumen de una esfera");
        System.out.println("Introduce el radio: ");
        radio = input.nextDouble();
        volumen = (4 / 3) * 3.1415 * (radio * radio * radio);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
