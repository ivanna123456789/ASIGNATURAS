/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejearrays;

/**
 *
 * @author Nocturno
 */
public class EjeArrays {

    public static void main(String[] args) {
        //declaro array unidimensional, todos del mismo tipo
        int numeros[] = {10, 20, 30, 40, 50};
        
        System.out.println("Mostramos los elementos del array: ");
        
        for (int i =0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
        //array de string tridimensional
        String[][] matrizDeNombres = {
            {"Daniel", "Félix", "Milagros"},
            {"Javier", "Damián", "Rafa"},
            {"Alan", "Mateo", "Ivanna"}
        };
        
        //mostramos matriz
        for (int fila = 0; fila < matrizDeNombres.length; fila++){
            for (int columna = 0; columna < matrizDeNombres[fila].length; columna++){
                System.out.print(matrizDeNombres[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
