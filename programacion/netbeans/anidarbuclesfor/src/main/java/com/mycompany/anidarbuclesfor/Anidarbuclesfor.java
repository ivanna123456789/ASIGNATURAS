/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anidarbuclesfor;

/**
 *
 * @author Nocturno
 */
public class Anidarbuclesfor {

    public static void main(String[] args) {
        //funcionamiento de break y continue
        //System.out.println("Hello World!");
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                System.out.print("[x]");
                if (j==7){
                    System.out.print("\n");
                }
            }
        }
    }
}
