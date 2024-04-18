/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebpoo;

/**
 *
 * @author Nocturno
 */
public class PruebPOO {

    public static void main(String[] args) {
        
        //crear los metodos
        libro libro2 = new libro(165, "Luna de pluton", "Gus", 30);
        libro libro1 = new libro(111, "HolaBuenosDias", "Maria", 500);

        libro2.setNumPag(600);
        
        //comprobamos que libro tiene mas paginas
        if(libro1.getNumPag() > libro2.getNumPag()){
            System.out.println(libro1.getTitulo() + " tiene mas paginas");
        }
        else{
            System.out.println(libro2.getTitulo() + " tiene mas paginas");
        }
        
        //mostramos el estado del toString 
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
    }
}
