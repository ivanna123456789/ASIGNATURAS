/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversiontitulo;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Conversiontitulo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String frase = "";
        String frase2 = "";
        
        int espacios; 
        
        System.out.println("Bienvenido, introduce una frase acabada en punto y la convertiré en un título: ");
        frase = input.nextLine();
        
        frase = frase.toLowerCase();//la frase pasa a ser toda en minusculas
        
        frase2 = frase2 + Character.toUpperCase(frase.charAt(0));
        for (int i = 1; i< frase.length()-1 ; i++){
            if (frase.charAt(i) == ' '){
                frase2 = frase2 + " " + Character.toUpperCase(frase.charAt(i+1));  
                i++;
            }
            else 
            {
                frase2 = frase2+frase.charAt(i);
            }
        }
        
        System.out.println("La frase final es: " + frase2);    
    }
}
