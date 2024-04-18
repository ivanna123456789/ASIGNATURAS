/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numarray;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Le pido 10 números al usuario
        System.out.println("Bienvenido usuario, introduce 10 números enteros y te los mostraré por pantalla: ");
        int numeros [];//declaro un arra vacío
        numeros = new int [10];//el array tiene 10 lugares
        
        //guardo los 10 numeros en un array
        for(int i=0; i<10;i++){
            /*hago un do while para que me vuelva a preguntar
            hasta que meta un número válido*/
            do {
                System.out.print("Número " + (i+1)+ ": ");
                numeros[i]=input.nextInt();
            }while(numeros[i]<=0);
        }
        
        int numfinal = numeros.length;
        //hago una variable done almaceno la longitud del array
        for(int i=0; i<5;i++){
            System.out.print(numeros[i] + " - " + numeros[numfinal-1] + " - ");
            numfinal--;    
            //imprimo en un solo for el primer número y el final menos 1 
            //al número final le resto uno más para que en la siguiente interacción me imprima uno menos
        }
    }
}
