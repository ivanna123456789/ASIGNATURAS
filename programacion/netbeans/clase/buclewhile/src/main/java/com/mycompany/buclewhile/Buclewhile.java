/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buclewhile;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Buclewhile {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero;
        int cont = 1;
        int positivo = 0;
        int negativo = 0;
        int nulo = 0 ;
        while (cont<= 10)
        {
            System.out.println("Porfavor introduce un numero: ");
            numero = input.nextInt();
                if (numero>0){
                    positivo = positivo+1;
                }
                else if (numero<0){
                    negativo = negativo+1;
                }
                else{
                    nulo = nulo+1;
                }
            cont = cont+1;
        }
        System.out.println("Has introducido 10 numeros ");
        System.out.println("De esos 10 numeros "+ positivo +" son positivos");
        System.out.println(negativo +" son negativos");
        System.out.println("y "+ nulo +" son nulos");
    }
}
