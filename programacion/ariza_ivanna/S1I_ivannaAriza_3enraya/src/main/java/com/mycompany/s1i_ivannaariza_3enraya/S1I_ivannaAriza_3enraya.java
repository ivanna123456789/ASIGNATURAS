/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.s1i_ivannaariza_3enraya;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class S1I_ivannaAriza_3enraya {
    
    public static void tablerovacio(char tablero[][]){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                tablero[i][j]='-';
            }
        }
    }
    
    public static void pintartablero(char tablero[][]){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //libreria scanner
        char tablero [][]= new char [3][3]; //creo una matriz 3x3
        int fila=0; //variable fila
        int columna=0; //variable columna
        
        boolean turno = true; //booleano que me sevirá para comprobaciones mas a delante
        boolean tresEnRaya=false; //booleano para decir si alguien gana o no
        boolean empate=false;
        tablerovacio(tablero);//relleno el tablero de rallitas
        
        //imprimo por pantalla la explicacion del juego
        System.out.println("Bienvenidos al juego de tres en raya.");
        System.out.println("Va a comenzar el jugador 1 (que tendrá la X)");
        System.out.println("Continuará el jugador 2 (que tendrá la O)\n");
        System.out.println("*****************************************\n");
        
        do{//do while para comprobar que has ganado o empatado
            System.out.println("Es el turno del jugador 1");//empieza el jugador 1
            pintartablero(tablero);//imprime el tablero vacio
            do{//do while para preuntarle al usuario la posicion que quieres
                do{
                System.out.print("Dame la fila: ");
                fila = input.nextInt();
                }while(fila<0||fila>2);//comprueba que es un num valido
                do{
                    System.out.print("Dame la columna: ");
                    columna = input.nextInt();
                }while(fila<0||fila>2);
                if(tablero[fila][columna]=='-'){//si el lugar está vacio lo rellena
                    tablero[fila][columna]='X';
                    turno=false;
                }
                else{
                    System.out.println("Esa casilla ya está cogida");//si no esta vacio pide que decidas otro
                }
            }while(turno==true);
            
            
            //demasiado codigo para comprobar si has hecho tres en raya en alguna linea
            if(tablero[0][0]=='X' &&tablero[0][1]=='X' && tablero[0][2]=='X' || tablero[0][0]=='O' &&tablero[0][1]=='O' && tablero[0][2]=='O'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                } 
            }
            if(tablero[1][0]=='X' &&tablero[1][1]=='X' && tablero[1][2]=='X' || tablero[1][0]=='O' &&tablero[1][1]=='O' && tablero[1][2]=='O' ){
                if(tablero[1][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[2][0]=='X' &&tablero[2][1]=='X' && tablero[2][2]=='X' || tablero[2][0]=='O' &&tablero[2][1]=='O' && tablero[2][2]=='O'){
                if(tablero[2][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][0]=='X' &&tablero[1][0]=='X' && tablero[2][0]=='X' || tablero[0][0]=='X' &&tablero[1][0]=='X' && tablero[2][0]=='X'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][1]=='X' &&tablero[1][1]=='X' && tablero[2][1]=='X' || tablero[0][1]=='X' &&tablero[1][1]=='X' && tablero[2][1]=='X'){
                if(tablero[0][1]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][2]=='X' &&tablero[1][2]=='X' && tablero[2][2]=='X' || tablero[0][2]=='X' &&tablero[1][2]=='X' && tablero[2][2]=='X'){
                if(tablero[0][2]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            
            //diagonales 
            if(tablero[0][0]=='X' &&tablero[1][1]=='X' && tablero[2][2]=='X' || tablero[0][0]=='X' &&tablero[1][1]=='X' && tablero[2][2]=='X'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][2]=='X' &&tablero[1][1]=='X' && tablero[2][0]=='X' || tablero[0][2]=='X' &&tablero[1][1]=='X' && tablero[2][0]=='X'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }

            
            System.out.println("Es el turno del jugador 2");
            pintartablero(tablero);
            
            do{
                do{
                    System.out.print("Dame la fila: ");
                    fila = input.nextInt();
                }while(fila<0||fila>2);
                do{
                    System.out.print("Dame la columna: ");
                    columna = input.nextInt();
                }while(fila<0||fila>2);
                
                if(tablero[fila][columna]=='-'){
                    tablero[fila][columna]='O';
                    turno=true;
                }
                else{
                    System.out.println("Esa casilla ya está cogida");
                }
            }while(turno==false);
            
            //comprobarTresEnRaya(tablero);
            if(tablero[0][0]=='X' &&tablero[0][1]=='X' && tablero[0][2]=='X' || tablero[0][0]=='O' &&tablero[0][1]=='O' && tablero[0][2]=='O'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                } 
            }
            if(tablero[1][0]=='X' &&tablero[1][1]=='X' && tablero[1][2]=='X' || tablero[1][0]=='O' &&tablero[1][1]=='O' && tablero[1][2]=='O' ){
                if(tablero[1][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[2][0]=='X' &&tablero[2][1]=='X' && tablero[2][2]=='X' || tablero[2][0]=='O' &&tablero[2][1]=='O' && tablero[2][2]=='O'){
                if(tablero[2][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][0]=='X' &&tablero[1][0]=='X' && tablero[2][0]=='X' || tablero[0][0]=='X' &&tablero[1][0]=='X' && tablero[2][0]=='X'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][1]=='X' &&tablero[1][1]=='X' && tablero[2][1]=='X' || tablero[0][1]=='X' &&tablero[1][1]=='X' && tablero[2][1]=='X'){
                if(tablero[0][1]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][2]=='X' &&tablero[1][2]=='X' && tablero[2][2]=='X' || tablero[0][2]=='X' &&tablero[1][2]=='X' && tablero[2][2]=='X'){
                if(tablero[0][2]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            
            if(tablero[0][0]=='X' &&tablero[1][1]=='X' && tablero[2][2]=='X' || tablero[0][0]=='X' &&tablero[1][1]=='X' && tablero[2][2]=='X'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
            if(tablero[0][2]=='X' &&tablero[1][1]=='X' && tablero[2][0]=='X' || tablero[0][2]=='X' &&tablero[1][1]=='X' && tablero[2][0]=='X'){
                if(tablero[0][0]=='X'){
                    System.out.println("Enhora buena, has ganado jugador 1 :D");
                tresEnRaya=true;
                }else{
                    System.out.println("Enhora buena, has ganado jugador 2 :D");
                    tresEnRaya=true;
                }
            }
           
        }while(tresEnRaya==false || empate==false);//sale delbucle si ganas o si empatas
        
        
        
    }
}
