/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decimalbinario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nocturno
 */
public class Decimalbinario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numero = "";
        String texto = JOptionPane.showInputDialog("Introduce un número decimal para convertilo en binario: ");
        int num = Integer.parseInt(texto);
        String binario = decimalBinario(numero);

        System.out.println("El número " + numero + "en decimal es " +  + " en binario");
        
    }
    
    public static int decimalBinario(int num){
        String binario ="";
        String digito ="";
        for (int i=num; i>0; i/=2){
            if (num%2==1){
               digito = "1";
            }
             else{
                digito = "0";
            }
            binario = digito + binario;
        }
        return binario;
    }
}
