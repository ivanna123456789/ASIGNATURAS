/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculodecifras;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Calculodecifras {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("En este programa vamos a leer un numero positivo y te diré cuantas cifras tiene.");
        
        int num = 0;
        do {
             System.out.println("Introduce un número positivo: ");
             num = input.nextInt();
        }while(num<=0);
        
        if (num<10){
            System.out.println("El número tiene una cifra");
        }
        else if (num>=10 && num<100){
            System.out.println("El número tiene dos cifras");
        }
        else if (num>=100 && num<1000){
            System.out.println("El número tiene tres cifras");
        }
        else if (num>=1000 && num<10000){
            System.out.println("El número tiene cuatro cifras");
        }
        
    }
}
