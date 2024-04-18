/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejrciciocajas;

/**
 *
 * @author Nocturno
 */
public class Ejrciciocajas {

    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.setAlto(4);
        caja1.setAncho(6);
        caja1.setLargo(8);
        
        Caja caja2 = new Caja(10,5,6);
        
        Caja caja3 = new Caja(7,7);
        caja3.setAncho(7);
        
        System.out.println(caja1.toString());
        System.out.println(caja1.esCubo());
        
        System.out.println(caja2.toString());
        System.out.println(caja1.volumen());
        
        System.out.println(caja3.toString());
    }
}
