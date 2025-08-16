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
        assertEquals(5, calc.sumar(2, 2));
    }
    
    @Test
    void testMultiplicar(){
        assertEquals(6, calc.multiplicar(2, 3));
    }
    
    @Test
    void testDividir(){
        assertEquals(8, calc.multiplicar(16, 2));
    }
    
    @Test
    void testRestar(){
        assertEquals(2, calc.restar(6, 4));
    }
    
    
    @Test
    void testPotencia(){
        assertEquals(16, calc.potencia(2.0, 4.0));
    }
    
    @Test 
    void testRaizCuadrada(){
        assertEquals(Math.sqrt(50), calc.raizCuadrada(50.0));
    }
    
    @Test
    void testDividirPorCero(){
        var e = assertThrows(IllegalArgumentException.class, ()-> calc.dividir(1, 0));
        assertEquals("", e.getMessage());
    }
    
    @Test
    void testPromedioEntreCuatroNumeros(){
        assertEquals(2, calc.promedioEntreCuatroNumeros(1, 2, 3, 4));
    }
}
