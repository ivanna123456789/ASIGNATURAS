/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioagentesmith;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class EjercicioAgenteSmith {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre = "";
        String respuesta = "";
        String tarea = "";
        String tiempo = " ";
        double gasto1 = 2.50;
        double gasto2 = 3.50;
        double gasto3 = 1.60;
        
        System.out.println("Smith: - Bienvenido ¿Cómo se llama? ");
        System.out.print("Usuario: - ");
        nombre = input.nextLine();
        System.out.println("Smith: - Buenos días, " + nombre + ".");
        System.out.println("¿Qué tal día ha tenido? (bueno o malo)");
        System.out.print(nombre + ": - ");
        respuesta = input.nextLine();

        if (respuesta.toLowerCase().equals("bueno")){
            System.out.println("Smith: - Me alegro mucho.");
        }
        else if (respuesta.toLowerCase().equals("malo")){
            System.out.println("Smith: - Vaya, lo siento mucho.");
        }
        else {
            System.out.println("Smith: - Lo siento, no le entiendo.");
        }
        
        System.out.println("Smith: - Bueno, ¿que tarea desea hacer ahora? (a, b o c)");
        System.out.println("         (a) Agenda");
        System.out.println("         (b) Ver gastos");
        System.out.println("         (c) El tiempo");
        System.out.print("\n");
        System.out.print(nombre + ": - ");
        tarea = input.nextLine();
        
        switch(tarea.toLowerCase()){
            case "a":
                System.out.println("       AGENDA");
                System.out.println("----------------------");
                System.out.println("Iván:    666 66 66 66");
                System.out.println("Elena:   676 76 76 76");
                System.out.println("Alan     999 99 99 99");
                System.out.println("Georgi:  696 69 69 69");
                System.out.print("\n");
                break;
            case "b":
                System.out.println("       GASTOS");
                System.out.println("-------------------------");
                System.out.println(" 1 - Patatas     " + gasto1 + " €");
                System.out.println(" 2 - Tomates     " + gasto2 + " €");
                System.out.println(" 3 - Zanahorias  " + gasto3 + " €");
                System.out.println("       -------------------");
                double suma = gasto1 + gasto2 + gasto3;
                double IVA = suma*21/121;
                double IVA2 = (String.format(%2f, IVA));
                System.out.println("               SUMA: " + suma + " €");
                System.out.println("            Desglose");
                System.out.println("             de IVA: " + IVA );
                System.out.println("             -----------------)");
                double total = suma - IVA;
                System.out.println("              TOTAL: " + IVA + " €");
                System.out.print("\n");
                break;
            case "c":
                System.out.println("Smit: - El tiempo lo quieres para Segovia o para Cádiz");
                System.out.print(nombre + ": - ");
                tiempo = input.nextLine();
                
                if (tiempo.toLowerCase ().equals("segovia")){
                    System.out.println("Smith: - En Segovia hace una temperatura de 8.0ºC y hay un 22% de precipitaciones. ");
                }
                else if (tiempo.toLowerCase().equals("cádiz")){
                    System.out.println("Smith: - En Cádiz hace 18º y 2% de probabilidad de precipitación.");
                }
                else {
                    System.out.println("Smith: - No tengo datos sobre esa ciudad.");
                }
                System.out.print("\n");
                break;
            default:
                System.out.println("Smith: - Lo siento, no le entiendo.");
        } 
        
        System.out.println("Smith: - Gracias por utilizar mis servicios, " + nombre + ". Que tenga un buen día."); 
    }
}
