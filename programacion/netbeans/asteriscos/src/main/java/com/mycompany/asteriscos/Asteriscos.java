/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.asteriscos;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Asteriscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a hacer una piramide con astericos con el numero de filas que desees");
        System.out.println("Introduce el número de filas: ");
        int numFilas = sc.nextInt();
        for (int alt=1; alt <= numFilas; alt++){
            //espacios en blanco 
            for (int blancos=1; blancos<=(numFilas-alt); blancos++){
                System.out.print(" ");
            }
            //asteriscos
            for (int asteriscos=1; asteriscos<=(alt*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
