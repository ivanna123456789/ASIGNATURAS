/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ejercicio_examen2.Matematica;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ivanna Ariza
 */
public class MatematicaTest {
    Matematica m;
    
    @BeforeEach
    public void MatematicaTest(){
        m = new Matematica(2, 3);
    }
    
    @Test
    public void SumaTest(){
        assertEquals(5, m.suma(), "Error en la suma");
    }
    
    @Test
    public void restaTest(){
        assertEquals(0, m.resta(), "Error en la resta");
    }
    
    @Test
    public void multiplicaTest(){
        assertNotSame(2,m.suma(), "Son iguales");
    }
    
    @Test
    public void sumaTest2(){
        assertNotNull(m.suma(), "Objeto nulo");
    }
    
    @Test
    public void multiplicaTest2(){
        assertEquals(6, m.multiplica(), "Error en la multiplicacion");
    }
    
    
    
}
