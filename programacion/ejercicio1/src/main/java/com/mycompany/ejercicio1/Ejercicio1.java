/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Nocturno
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Cuenta cuenta_c1 = new Cuenta ("Carlos");
        Cuenta cuenta_c2 = new Cuenta ();
        Cuenta cuenta_c3 = new Cuenta ("Lucas", 100);
        
        //ingresaar dinero
        cuenta_c1.ingresar(300);
        cuenta_c3.ingresar(400);
        
        //retiramos dinero
        cuenta_c1.retirar(500);
        cuenta_c3.retirar(100);
        
        //muestro la informacion
        System.out.println(cuenta_c1.toString());
        System.out.println(cuenta_c3.toString());
        
    }
}
