/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadordepalabras;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Contadordepalabras {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String frase = "";
        System.out.println("Bienvenido, introduce una frase para que pueda contar las palabras que has introducido: ");
        frase = input.nextLine();
        
        int numeroPalabras = contarPalabras(frase);
        System.out.println("La frase: \"" + frase + "\" tiene en total " + numeroPalabras + " palabras");
        
    }
    
    public static int contarPalabras(String frase){
        int contador= 1;
        int posicion;
        if (frase.isEmpty()){
            contador = 0;
        }
        else 
        {
            posicion = frase.indexOf(" ");
            while(posicion != -1){
                contador ++;
                posicion = frase.indexOf(" ", posicion + 1);
            }
        }
        return contador;
    }
}
