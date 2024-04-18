/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosmatriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class EjerciciosMatriz {
    public static int generaNumAleatorios (int minimo, int maximo){
        return (int)Math.floor(Math.random() * (maximo + 1 - minimo) + minimo );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int filas = 5;
        int columnas = 0;
        
        System.out.print("Vamos a hacer una matriz de números con 5 filas, dime cuantas columnas quieres que tenga: ");
        columnas = input.nextInt();
        int arrayBidimensional [][] = new int [filas][columnas];
        int minimo = 0;
        int maximo = 10;
        
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                arrayBidimensional[i][j]= 5;
                System.out.print(generaNumAleatorios(minimo, maximo) + " ");
            }
            System.out.println("");
        }
    }
}
