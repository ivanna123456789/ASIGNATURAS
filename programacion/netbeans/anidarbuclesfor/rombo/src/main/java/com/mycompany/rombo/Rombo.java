/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rombo;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Rombo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a hacer una rombo con astericos con el numero de filas que desees");
        int numFilas;
        do{
           System.out.println("Introduce el número de filas: ");
           numFilas = sc.nextInt();
        }while(numFilas%2==0 && numFilas<0);
        
        numFilas = numFilas/2+1;
        
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
        
        numFilas--;
        for (int alt=1; alt <= numFilas; alt++){
            //blancos
            for (int blancos=1; blancos <= alt; blancos++){
                System.out.print(" ");
            }
            //asteriscos
            for (int asteriscos=1; asteriscos<=(numFilas-alt)*2+1; asteriscos++){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
 
    }
}
