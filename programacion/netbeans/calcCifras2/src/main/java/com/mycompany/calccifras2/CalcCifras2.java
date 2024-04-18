/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calccifras2;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class CalcCifras2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("En este programa vamos a leer un numero positivo y te diré cuantas cifras tiene.");
        
        int num = 0;
        do {
             System.out.println("Introduce un número positivo: ");
             num = input.nextInt();
        }while(num<=0);
        
        //con un tostring
    }
}
