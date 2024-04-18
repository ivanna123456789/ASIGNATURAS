/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasealumno;

/**
 *
 * @author Nocturno
 */
public class Clasealumno {

    public static void main(String[] args) {
        teclado t1 = new teclado("Newskill");
        Ordenador or1 = new Ordenador (t1);
        
        System.out.println("El ordenador or1 tienen un teclado modelo " + or1.getTeclado().getModelo());
        
    }
}
