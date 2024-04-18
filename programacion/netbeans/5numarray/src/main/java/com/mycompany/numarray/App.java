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
        System.out.println("Bienvenido usuario, ingresa 5 números y te diré cúantos son positivos, negativos y ceros: ");
        int numeros [];//inicializo un array vacío
        numeros = new int [5];//le digo al arrray que tiene 5 sitios
        
        //inicializo las variables que voy a utilizar
        int positivo=0;
        int negativo=0;
        int ceros=0;
        int num1=0;
        int num2=0;
        int num3=0;
        
        //hago un for para meter cada numero en un hueco del array
        for (int i=0; i<5; i++){
            System.out.print("Número " + (i+1) + ":");
            numeros[i] = input.nextInt();
        }
        
        for (int i=0;i<5;i++){
            if (numeros[i]>0){
               positivo = positivo + numeros[i];
               num1=num1+1;
            }
            else if (numeros[i]<0){
                negativo = negativo + numeros[i];
                num2=num2+1;
            }
            else{
                ceros++;
                num3=num3+1;
            }
        }
        
        double mediapositivo = positivo/num1;
        double medianegativo = negativo/num2;
                    
        System.out.println("La media de los psitivos es: " + mediapositivo);
        System.out.println("La media de los negativos es: " + medianegativo);
        System.out.println("El total de ceros es: " + num3); 
    }
}
