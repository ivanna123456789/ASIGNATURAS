/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorial;

/**
 *
 * @author Nocturno
 */
public class Prueba {

    
    public int Factorial(int num){
        int factorial = 1;
        for(int i = 1; i<=num; i++){
            factorial = factorial*i;
        }

        return factorial;
    }
    
    public int multiplica (int a, int b){
        return a*b;
    }
}
