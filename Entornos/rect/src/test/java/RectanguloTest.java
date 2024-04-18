/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.rect.Rectangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nocturno
 */
public class RectanguloTest {
    @Test
    void testAncho(){
        //probando el metodo getAncho
        int ancho = 20;
        Rectangulo rect1 = new Rectangulo (ancho, 40);
        assertEquals(ancho,rect1.getAncho());
    }
    
    @Test
    void testAlto(){
        //probando el metodo getAlto
        int alto = 10;
        Rectangulo rect2 = new Rectangulo (20, alto);
        assertEquals(alto, rect2.getAlto());
    }
    
    @Test
    void testArea(){
        //probando el metodo getArea
        int area = 4;
        Rectangulo rect3 = new Rectangulo (2, 2);
        assertEquals(area, rect3.getArea());
    }

}
