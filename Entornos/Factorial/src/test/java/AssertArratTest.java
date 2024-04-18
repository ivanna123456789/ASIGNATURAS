/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
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
public class AssertArratTest {
    @Test
    public void test1() {
        String[] nombresEsperados = {"java", "junit", "jboss"};
        String[] nombresActuales = {"java", "junit", "jboss"};
        
        assertArrayEquals(nombresEsperados, nombresActuales, "Fallo - No son los mismos arreglos");
    }
    
    @Test
    public void test2(){
        int[] numEsperados = {2,3,4};
        int[] numActuales = {2,3,4};
        
        assertArrayEquals(numEsperados, numActuales,"Fallo - No son los mismos arreglos");
    }
    
    @Test
    public void test3(){
        boolean[] booleanEsperados = {true, false, true};
        boolean[] booleanActuales = {true, false, true};
        
        assertArrayEquals(booleanEsperados, booleanActuales,"Fallo - No son los mismos arreglos");
    }
    
    public boolean validarMax(int maximo){
        boolean max = false;
        for (int i = 0; i < maximo; i++) {
            if(i == 3){
                max = true;
                break;
            }
        }
        return max;
    }
    @Test
    public void testValidarMax(){
        assertTrue(validarMax(4), "Esta variable no es false");
    }
    
    @Test
    public void testAsserNotNull(){
        ArrayList<String> nombre = new ArrayList<String>();
        /*for (int i = 0; i < 3; i++) {
            if(i==2){
                nombre = null;
            } 
        }*/
        assertNotNull(nombre, "La lista está null");
    }
    @Test
    public void testAssertNotSame(){
        boolean esMaximo = validarMax(4);//devuelve true
        boolean noEsMaximo = validarMax(5);//devuelve false
        
        assertNotSame(esMaximo, noEsMaximo, "Fallo - no son iguales los dos objetos");
    }

}
