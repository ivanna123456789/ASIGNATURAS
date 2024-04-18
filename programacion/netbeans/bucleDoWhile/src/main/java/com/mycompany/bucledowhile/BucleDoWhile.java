/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucledowhile;

/**
 *
 * @author Nocturno
 */
public class BucleDoWhile {

    public static void main(String[] args) {
        int num = 1;
        System.out.println("Vamos a imprimir los número del 1 al 100 a continuación:  ");
        
        do{
            System.out.print (num + "-");
            num++;
        } while(num<=100);
    }
}
