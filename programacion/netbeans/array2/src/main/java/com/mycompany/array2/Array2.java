/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array2;

/**
 *
 * @author Nocturno
 */
public class Array2 {

    public static void main(String[] args) {;
        int numeros[] = {10, 20, 30, 40, 50};
        int suma = 0;
        int mayor = 0;
        int numbuscado =30;
        System.out.println("Mostramos los elementos del array: ");
        
        for (int i =0; i<numeros.length; i++){
            System.out.println(numeros[i]);
            suma = suma + numeros[i];
        }
        System.out.println("La suma de todos los números dentro del array es: " + suma);
        
        for (int i=0; i<numeros.length; i++){
            if (mayor<numeros[i]){
                mayor = numeros [i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        
        for (int i =0; i<numeros.length; i++){
            if (numbuscado == numeros[i]){
                System.out.println("He encontrado el elemento");
            }
        }
    }
}
