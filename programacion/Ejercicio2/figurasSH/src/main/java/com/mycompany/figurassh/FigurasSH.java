/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurassh;

/**
 *
 * @author Nocturno
 */
public class FigurasSH {

    public static void main(String[] args) {
        Superheroe sh1 = new Superheroe("Spiderman");
        Dimension d1 = new Dimension(20, 30, 60);
        sh1.setDescripcion("El superheroe del pueblo");
        
        Superheroe sh2 = new Superheroe("Thor");
        Dimension d2 = new Dimension(60, 30, 20);
        sh2.setDescripcion("Fuerte luchador");
        
        Superheroe sh3 = new Superheroe("Ironman");
        Dimension d3 = new Dimension(10, 20, 15);
        sh1.setDescripcion("Un millonario incomprendido");
        
        Superheroe sh4 = new Superheroe("Superman");
        Dimension d4 = new Dimension(10, 20, 15);
        sh1.setDescripcion("Muy majo");
        
        Superheroe sh5 = new Superheroe("Hulk");
        Dimension d5 = new Dimension(10, 20, 15);
        sh5.setDescripcion("Con superfuerza");
        
        //System.out.println(sh1.toString());
        
        Coleccion c1 = new Coleccion("COLECCION: 1");
        Coleccion c2 = new Coleccion("COLECCION: 2");
        Coleccion c3 = new Coleccion("COLECCION: 3");
        
        //COLECCION 1
        Figura fig1 = new Figura("111", 25, d1, sh1);
        c1.añadirFigura(fig1);
        
        Figura fig2 = new Figura("122", 40, d2, sh2);
        c1.añadirFigura(fig2);
        
        Figura fig3 = new Figura("133", 10, d3, sh3);
        c1.añadirFigura(fig3);
        
        Figura fig4 = new Figura("144", 20, d4, sh4);
        c1.añadirFigura(fig4);
        
        Figura fig5 = new Figura("155", 30, d5, sh5);
        c1.añadirFigura(fig5);
        
        System.out.println("\ncoleccion 1:" + c1.toString());
        System.out.println(c1.masValioso());
        System.out.println("\n\n");
        
        //COLLECCION 2
        Figura fig6= new Figura("211", 30, d1, sh1);
        c2.añadirFigura(fig6);
        
        Figura fig7 = new Figura("222", 60, d2, sh2);
        c2.añadirFigura(fig7);
        
        Figura fig8 = new Figura("233", 10, d3, sh3);
        c2.añadirFigura(fig8);
        
        Figura fig9 = new Figura("244", 20, d4, sh4);
        c2.añadirFigura(fig9);
        
        Figura fig10 = new Figura("255", 35, d5, sh5);
        c2.añadirFigura(fig10);
        
        System.out.println("\ncoleccion 1:" + c2.toString());
        System.out.println(c2.masValioso());
        System.out.println("\n\n");
        
        //COLECCION 3
        Figura fig11= new Figura("311", 70, d1, sh1);
        c3.añadirFigura(fig11);
        
        Figura fig12 = new Figura("322", 15, d2, sh2);
        c3.añadirFigura(fig12);
        
        Figura fig13 = new Figura("333", 60, d3, sh3);
        c3.añadirFigura(fig13);
        
        Figura fig14 = new Figura("344", 25, d4, sh4);
        c3.añadirFigura(fig14);
        
        Figura fig15 = new Figura("355", 35, d5, sh5);
        c3.añadirFigura(fig15);
        
        System.out.println("\ncoleccion 1:" + c3.toString());
        System.out.println(c3.masValioso());
        System.out.println("\n\n");
        
        
    }
}
