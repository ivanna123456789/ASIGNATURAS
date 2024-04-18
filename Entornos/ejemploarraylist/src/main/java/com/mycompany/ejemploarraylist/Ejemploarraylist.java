/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploarraylist;
import java.util.ArrayList;
/**
 *
 * @author Nocturno
 */
public class Ejemploarraylist {

    public static void main(String[] args) {
        
        ArrayList <String> listOfStrings = new ArrayList(20);
        
        ArrayList listOfStrings2 = new ArrayList();
        
        listOfStrings2.add("Hola");
        listOfStrings2.add("adios");
        
        ArrayList auxiliarListOfStrings = new ArrayList();
        
        auxiliarListOfStrings.addAll(listOfStrings2);
        
        //metodo para saber si existe un elemento en un array
        listOfStrings2.add("Hola");
        boolean contieneHola = listOfStrings2.contains("Hola");
        //metodo para eliminar un elemento de un array list
        boolean eliminado = listOfStrings2.remove("Hola");
                
        //metodo para obtener el tamaño del array list
        ArrayList <String> stringList = new ArrayList();
        stringList.add("Pistacho");
        int totalSize = stringList.size();
        
        System.out.println("\nPor el metodo normal:");
        stringList.add("Cacahuete");
        stringList.add("Pipas");
        stringList.add("Almendras");
        stringList.add("Anacardos");
        
        //maneras de recorrer un array list
        //manera convencional
        for(int i=0; i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        
        System.out.println("\nPor el metodo for-each:");
        //Manera con bucle For-Each
        for(String palabrita : stringList){
            System.out.println(palabrita);
        }
    }
}
