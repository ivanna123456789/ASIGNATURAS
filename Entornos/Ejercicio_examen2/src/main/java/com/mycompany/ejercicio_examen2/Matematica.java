/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_examen2;

/**
 *
 * @author Ivanna Ariza
 */
public class Matematica {
    //atributos
    private int a;
    private int b;
    
    //constuctor
    public Matematica (int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int suma(){
        return a+b;
    }
    
    public int multiplica(){
        return a*b;
    }
    
    public int resta(){
        if(a<b){
            return 0;
        }else{
            return a-b;
        }
    }
}
