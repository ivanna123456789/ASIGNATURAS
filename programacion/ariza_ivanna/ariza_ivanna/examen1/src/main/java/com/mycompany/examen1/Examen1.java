/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Examen1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //libreria que me perimite recibir datos del usuario
        //inicializo las tres variables que voy a utilizar
        int a = 0; 
        int b = 0;
        int c = 0;
        System.out.println("Bienvenido usuario, con este programa vamos a poder calcular una ecuación cuadrática.");
        System.out.println("Para ello necesito que introduzacas los valores de a, b y c.");
        //le explico al usuario el programa y le pido los valores
 
        System.out.println("Introduce el valor a: ");
        a = input.nextInt();
        //pido el numero a
        System.out.println("Introduce el valor b: ");
        b = input.nextInt();
        //pido el numero b
        System.out.println("Introduce el valor c: ");
        c = input.nextInt();
        //pido el numero c
        
        solucion(a, b, c);

    }
    
    public static void solucion(int a, int b, int c){
        //hago un procedimiento que me permita calcular la ecuación
        double discriminante = 0;
        //primero claculo el discriminante para ver si cumple con alguno de las 3 soluciones
        discriminante = Math.pow(b, 2)-(4*a*c);
        if (discriminante<0){
            //si el disc es menor que cero
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        else if (discriminante==0){
            double x1 = (-b)/(2*a);
            System.out.println("La ecuación tiene solo una ecuación real: " + x1);
            //si el disc es cero
        }
        else {
            //si el disc es mayor que cero
            double solu1 = (-b)+ Math.sqrt(discriminante) / ( 2*a);
            double solu2 = (-b)+ Math.sqrt(discriminante) / (2*a);
            System.out.println("La ecuación tiene dos soluciones:");
            System.out.println("solución 1: " + solu1);
            System.out.println("solución 2: " + solu2);
        }
    }
}
