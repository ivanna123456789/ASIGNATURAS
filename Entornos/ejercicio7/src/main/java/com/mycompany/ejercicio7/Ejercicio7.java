/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        /*Ejercicio 7- Escribe un programa que lea un número entero positivo (n>0) y varias 
		palabras hasta la introducción de la palabra “fin”. A continuación, mostrarás todas las 
		palabras de la frase que tienen menos de ‘n’ caracteres. Por ejemplo, si el número es 7, si 
		introduzco las palabras “Programación”, “Ciclo” , “Formativo”, “Grado”, “Superior” 
		“en” “Maria” “Moliner”, “fin”, el resultado será:
		“Ciclo Grado en Maria"*/
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		String cadena = "";
		String palabras = "";
		boolean xxxx = false ;
		
		System.out.println("Bienvenido ususario.");
		do {
			System.out.println("Introduce un número entero positivo: ");
			num = input.nextInt();
		}while(num<=0);
		
		
		System.out.println("Ahora introduce palabras hasta que introduzcas \"fin\": ");
	
		do {
			System.out.print ("Palabaras: ");
			Scanner teclado = new Scanner(System.in);
			palabras = teclado.nextLine();
			if(palabras.toLowerCase() == "fin") {
				cadena = cadena + " " + palabras;
			}
			else if (palabras.equalsIgnoreCase("fin")) {
				break;
			}
		}while(!xxxx);
		
		System.out.println("La cadena que has introducido es la siguiente: ");
		System.out.println("\"" + cadena + "\"");
                
                
                
                
    }
}
