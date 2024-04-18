/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author Nocturno
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona ("Maria", 23, 'F');
        Persona persona3 = new Persona ("pepe", 17, 'M', 60, 1.70);
        
        System.out.println("persona 1: \n" + persona1 + "\n\n");
        System.out.println("persona 2: \n" + persona2 + "\n\n");
        System.out.println("persona 3: \n" + persona3);
    }
    
    
}
