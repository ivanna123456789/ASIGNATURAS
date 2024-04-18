/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cubo;

/**
 *
 * @author Nocturno
 */
public class Cubo {

    public static void main(String[] args) {
        int marca[][][] = new int [9][9][9];
        for(int i = 0; i < marca.length; i++){
            for(int j = 0; j < marca[0].length; j++){
                for(int k = 0; k < marca[0][0].length; k++){
                    if(j==0||j==8||i==0||i==8||k==0||k==8){
                        marca[i][j][k]=1;
                    }
                    else{
                        marca[i][j][k]=0 ;
                    }
                    System.out.print(marca[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
        }

    }
}
