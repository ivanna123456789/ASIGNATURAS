/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer7;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Ejer7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean creciente = false;
        boolean decreciente = false;
        
        int arraynum [] = new int [10];
        int num = 0;
        System.out.println("Bienvenido usuario, introduce 10 números: ");
        for(int i=0; i<arraynum.length; i++){
            System.out.print("Numero " + (i+1) + ": ");
            arraynum[i]=input.nextInt();
        }
        
        System.out.println("El array que has introducido es el siguiente: ");
        for(int i=0; i<arraynum.length; i++){
            System.out.print(arraynum[i] + " - ");
        }
        
        for(int i=0; i<9; i++){
            
        }
    }
}
