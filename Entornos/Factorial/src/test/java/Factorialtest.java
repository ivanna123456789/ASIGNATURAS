/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.factorial.Prueba;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Timeout;


/**
 *
 * @author Nocturno
 */
public class Factorialtest {
    
    
    @Test
    @Timeout(value=1, unit=TimeUnit.MILLISECONDS)
    public void testMultiplica(){
        int a = 2;
        int b = 2;
        Prueba objeto = new Prueba();
        int resultadoesperado = 4;
        int resul = objeto.multiplica(a, b);
        assertEquals(resultadoesperado, resul);
    }
    

    @Test
    public void testMultiplica1(){
        int a = -2;
        int b = 2;
        Prueba objeto = new Prueba();
        int resultadoesperado = -4;
        int resul = objeto.multiplica(a, b);
        assertEquals(resultadoesperado, resul);
    }
     
    /*@Disabled*/
    @Test
    public void testFactorial(){
        int fact = 3;
        Prueba fct = new Prueba();
        int ressultadoEsperado = 6;
        int res = fct.Factorial(fact);
        assertEquals(ressultadoEsperado,res);
    }
    
    /*private static Aritmetica ar;
    
    
    @BeforeEach
    @Test
    @Order(2)
    public void init(){
        ar = new Aritmetica();
        System.out.println("lala");
    }
    
    @AfterEach
    @Test
    @Order(1)
    public void init3(){
        ar = null;
        System.out.println("fin");
    }
    
    @Test
    public void testSuma(){
        assertEquals(2, ar.suma(1, 1), 0);
    }
    
    @Test
    public void testResta(){
        assertEquals(5, ar.resta(10, 5));
    }
    
    @Test
    public void testMultiplicacion(){
        assertEquals(4, ar.multipicacion(2, 2));
    }
    
    @Test
    public void testDivision(){
        assertEquals(2, ar.division(10, 5));
    }*/
}
