/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author Nocturno
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Bienvenido usuario, vamos a tener dos arrays y los combinaremos en unn tercero de tres de tres:");
        
        int tabla1 [] = {1,1,1,1,1,1,1,1,1,1,1,1};
        int tabla2 [] = {2,2,2,2,2,2,2,2,2,2,2,2};
        int tabla3 [] = new int[24];
        
        System.out.println("La primera tabla es: ");
        for (int i=0; i<12; i++){
            System.out.print(tabla1[i] + "-");
        }
        System.out.println("");
        System.out.println("La segunda tabla es: ");
         for (int i=0; i<12; i++){
            System.out.print(tabla2[i] + "-");
        }
        System.out.println("");
        
        for (int i=0; i<24; i++){
            for(int a=0; a<3; a++){
                tabla3[a]=tabla1[i];
            }
            for(int b=0; b<3; b++){
                tabla3[b]=tabla2[i];
            }
        }
    }
}
