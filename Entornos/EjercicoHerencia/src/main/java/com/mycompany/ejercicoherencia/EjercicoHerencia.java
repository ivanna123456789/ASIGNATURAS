/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicoherencia;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class EjercicoHerencia {

    public static void main(String[] args) {
        Fresco f1 = new Fresco( "11/01/25", 1,"queso", 1, "01/01/24", "España");
        Fresco f2 = new Fresco( "11/01/25", 1,"queso",1, "01/01/24", "Francia");
        Fresco f3 = new Fresco( "11/01/25", 1,"queso",1,"01/01/24", "Italia");
        Refrigerado r1 = new Refrigerado("20/01/25", 2,"salmon",2, 222);
        Refrigerado r2 = new Refrigerado("20/01/25", 2,"salmon",2, 222);
        Refrigerado r3 = new Refrigerado("20/01/25", 2,"salmon",2, 222);
        Refrigerado r4 = new Refrigerado("20/01/25", 2,"salmon",2, 222);
        Congelado c1 = new Congelado("10/01/25", 3,"trucha",3, -20);
        Congelado c2 = new Congelado("10/01/25", 3,"trucha",3, 12);
        Congelado c3 = new Congelado("10/01/25", 3,"trucha",3, 5);
        Congelado c4 = new Congelado("10/01/25", 3,"trucha",3, 18);
        
        //arraylist
        ArrayList<Producto> productos = new ArrayList<Producto>();
        ArrayList<Fresco> productosFrescos = new ArrayList<Fresco>();
        productosFrescos.add(f1);
        productosFrescos.add(f2);
        productosFrescos.add(f3);
        ArrayList<Refrigerado> productosRefrigerado = new ArrayList<Refrigerado>();
        productosRefrigerado.add(r1);
        productosRefrigerado.add(r2);
        productosRefrigerado.add(r3);
        productosRefrigerado.add(r4);
        ArrayList<Congelado> productosCongelado = new ArrayList<Congelado>();
        productosCongelado.add(c1);
        productosCongelado.add(c2);
        productosCongelado.add(c3);
        productosCongelado.add(c4);
        
        for (int i=0; i < productosFrescos.size(); i++) {
            System.out.println(productosFrescos.get(i));
        }
        System.out.println("--------------------------");
        for (int i=0; i < productosRefrigerado.size(); i++) {
            System.out.println(productosRefrigerado.get(i));
        }
        System.out.println("--------------------------");
        for (int i=0; i < productosCongelado.size(); i++) {
            System.out.println(productosCongelado.get(i));
        }
        System.out.println("-------------------------- \n\n\n");
        System.out.println("ArrayList de todos los productos: ");
        
        //añado todo al array entero
        productos.addAll(productosFrescos);
        productos.addAll(productosRefrigerado);
        productos.addAll(productosCongelado);
        //imprimo
        for (int i=0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
        
        
        System.out.println("----------------------");
        System.out.println("Producto congelado a menos de -18º:");
        for (int i=0; i < productosCongelado.size(); i++) {
            if(productosCongelado.get(i).getTempCon() < -18){
                System.out.println(productosCongelado.get(i));
            }
        }
        
        System.out.println("----------------------");
        System.out.println("Producto fresco cuyo pais sea España:");
        for (int i = 0; i < productosFrescos.size(); i++) {
            if(productosFrescos.get(i).getPais() == "España"){
                System.out.println(productosFrescos.get(i));
            }
        }

        ArrayList<Producto> otros = new ArrayList<Producto>();
        System.out.println("----------------------");
        System.out.println("Elimino los productos refgerados");
        for (int i=0; i < productos.size(); i++) {
            if(productos.get(i).getClasificacion() == 2){
                otros.add(productos.get(i));  
            }
        }
         productos.removeAll(otros);
         
        //imprimo para comprobar
        for (int i=0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
        
        
        
        System.out.println("----------------------\n");
        System.out.println("Guardo en otro array los productos de francia:");
         ArrayList<Producto> francia = new ArrayList<Producto>();
        for (int i = 0; i < productosFrescos.size(); i++) {
            if(productosFrescos.get(i).getPais() == "Francia"){
                francia.add(productos.get(i));  
            }
        }
        //imprimo para comprobar
        for (int i=0; i < francia.size(); i++) {
            System.out.println(francia.get(i));
        }
    }
}
