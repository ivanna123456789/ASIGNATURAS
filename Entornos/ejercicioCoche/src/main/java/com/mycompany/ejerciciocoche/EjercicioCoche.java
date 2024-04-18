/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocoche;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class EjercicioCoche {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //programa que acelere de cero a cien
        int usuario;
        Coche miCoche = new Coche("Seat", "Ibiza", 0);
        
        System.out.println("La velocidad a la que va mi Ibiza es " + miCoche.getVelocidadActual());
        
        for(int i = 0; i<11; i++){
            do{
                System.out.print("Acelerar(1) o frenar(2): ");
                usuario = input.nextInt();
            }while (usuario>2 && usuario<0);
            
            switch(usuario){
                case 1:
                    miCoche.acelerar(10);
                    System.out.println("El coche tiene una velocidad de: " + miCoche.getVelocidadActual());
                    if(miCoche.getVelocidadActual()>=100 ){
                        miCoche.motorGripado();
                        System.out.println("\nTu coche se ha estropeado porque el motor se ha gripado, empezará a reducir velocidad\n");
                
                        for(int j = 0; j<10; j++){
                            miCoche.frenar(10);
                            System.out.println("El coche tiene una velocidad de: " + miCoche.getVelocidadActual());
                        }
                    }
                    break;
                case 2:
                    if(miCoche.getVelocidadActual() == 0){
                        System.out.println("No puedo frenar más");
                    }
                    else{
                        miCoche.frenar(10);
                        System.out.println("El coche tiene una velocidad de: " + miCoche.getVelocidadActual());
                    }
                    break;
            }
        } 
    }
}
