/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ejercico_entornos.Product;
import com.mycompany.ejercico_entornos.ShoppingCart;
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
public class ShoppingCartTest{
    
    ShoppingCart s;
    @BeforeEach
    public void Init(){
        s =  new ShoppingCart();
    }
    
    
    @Test
    public void emptyTest(){
        assertTrue(s.isEmpty());
    }
    
    @Test
    public void getBalance(){
        Product pan = new Product("pan", 1);
        Product agua = new Product("agua", 1);
        s.addItem(pan);
        s.addItem(agua);
        assertEquals(2, s.getBalance(),"Mal");
    }
    
    @Test 
    public void getItemCount(){
        Product pan = new Product("pan", 1);
        Product agua = new Product("agua", 1);
        s.addItem(pan);
        s.addItem(agua);
        assertEquals(2, s.getItemCount(), "Mal");
    }
    
    @Test
    public void ShoppingCartTest1(){
        assertNotNull(s);
        
    }
    
    @Test
    public void ShoppingCartTest2(){
        Product pan = new Product("pan", 1);
        Product agua = new Product("agua", 1);
        s.addItem(pan);
        s.addItem(agua);
        assertFalse(s.isEmpty());
    }
    
}
