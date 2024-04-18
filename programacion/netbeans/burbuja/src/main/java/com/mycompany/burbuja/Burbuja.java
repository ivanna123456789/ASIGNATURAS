/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.burbuja;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Burbuja {
    
    public static void imprimirArray(int array[]){
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void burbuja(int array[]){
        int i, j, aux;
        
        for(i=0; i<array.length; i++){
            for(j=0; j<array.length-1-i; j++){
                if (array[j] > array[j+1])
                {
                    //hago el cambio con el aux
                   aux = array[j];
                   array[j] = array[j+1];
                   array[j+1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        //creación de las variables
        int array[] = new int [5];
        Scanner teclado = new Scanner(System.in);
        
        //SOLICITO AL USUSARIO QUE INTRDUZCA LOS VALROES
        for (int i=0; i<array.length; i++)
        {
            System.out.print("Ingrese el número " + (i+1) + " : ");
            array[i] = teclado.nextInt();
        }
        System.out.println("\n");
        System.out.println("El array origina es: ");
        //imprimir array
        imprimirArray(array);
        
        //imprimir el método de la burbuja
        burbuja(array);
        System.out.println("\n");
        System.out.println("El array ordenado es: ");
        //imprimir array final
        imprimirArray(array);
    }
}
