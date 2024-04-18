/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.factorial.Aritmetica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author Nocturno
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AritmeticaTest {
    private static Aritmetica ar;
   
    /*@BeforeAll
    public static void init(){
        ar = new Aritmetica();
        System.out.println("lala");
    }
    
    @AfterEach
    public void init2(){
        ar = new Aritmetica();
        System.out.println("lele");
    }*/
    
    @Test
    @Order(4)
    public void testSuma(){
        ar = new Aritmetica();
        assertEquals(2, ar.suma(1, 1));
        System.out.println("Mandarina");
    }
    
    @Test
    @Order(1)
    public void testResta(){
        ar = new Aritmetica();
        assertEquals(5, ar.resta(10, 5));
        System.out.println("Platano");
    }
    
    @Test
    @Order(2)
    public void testMultiplicacion(){
        ar = new Aritmetica();
        assertEquals(4, ar.multipicacion(2, 2));
        System.out.println("Pera");
    }
    
    @Test
    @Order(3)
    public void testDivision(){
        ar = new Aritmetica();
        assertEquals(2, ar.division(10, 5));
        System.out.println("Sandia");
    }
    
}
