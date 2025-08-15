/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.agenda.calculadoracontest.Calculadora;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafael Barragán Acevedo
 */
public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    
    @Test
    void testSuma(){
        assertEquals(5, calc.sumar(2, 3));
    }
    
    @Test
    void testMultiplicar(){
        assertEquals(6, calc.multiplicar(2, 3));
    }
    
    @Test
    void testDividir(){
        assertEquals(8, calc.multiplicar(16, 2));
    }
    
    
    
    
    
    
}
