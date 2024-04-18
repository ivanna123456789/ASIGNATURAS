/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadenasconstring;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Cadenasconstring {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String palabra = "";
        String palabraInvertida = "";
        
        System.out.println("Bienvenido, introduce una palabra y te diré si es palindromo o no: ");
        palabra = input.nextLine();
        
        //invertimos la cadena
        for (int i = palabra.length()-1; i >= 0; i--)
        {
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }
        System.out.println(palabraInvertida);
        
        //solucion
        if (palabra.equalsIgnoreCase(palabraInvertida)){
            System.out.println("La palabra " + palabra + " es un palindromo");
        }
        else {
            System.out.println("La palabra " + palabra + " no un palindromo");
        }
            
    }
}
