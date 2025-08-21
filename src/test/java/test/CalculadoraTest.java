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
      //*******************************tests de sumas******************************* 
    @Test
    void testSuma() {
        assertEquals(4, calc.sumar("2", "2"), "Al realizar la operacion  nuestro resultado de 2 + 2 tiene que ser igual a 4");
    }

    @Test
    void testSumaNegativos() {
        assertEquals(-5, calc.sumar("-2", "-3"), "Al realizar la operacion  nuestro resultado de -2 + -3 tiene que ser igual a -5");
    }

    @Test
    void testSumaPositivoNegativo() {
        assertEquals(4, calc.sumar("5", "-1"), "Al realizar la operacion  nuestro resultado de 5 + -1 tiene que ser igual a 4");
    }

    @Test
    void testSumaConStringsNovalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.sumar("m", "4");
        });
    }

    //*******************************tests de multiplicar*******************************  

@Test
    void testMultiplicar(){
        assertEquals(6, calc.multiplicar(2, 3));
    }
    //*******************************tests de divicion*******************************  
    @Test
    void testDividir(){
        assertEquals(8, calc.multiplicar(16, 2));
    }
    //*******************************test de resta*******************************  
    @Test
    void testRestar(){
        assertEquals(2, calc.restar("6", "4"),"Al realizar la operacion  nuestro resultado de 6-4 tiene que ser igual a 2");
    }

    @Test
    void testRestarNumerosPositivos(){
        assertEquals(2, calc.restar("+6", "+4"),"Al realizar la operacion  nuestro resultado de (+6)-(+4) tiene que ser igual a 2");
    }

    @Test
    void testRestarNumeroPositivo(){
        assertEquals(2, calc.restar("6", "+4"),"Al realizar la operacion  nuestro resultado de 6-(+4) tiene que ser igual a 2");
    }
    @Test
    void testRestarConStringsNovalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            calc.sumar("m", "4");
        });
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
    

void testDividirEntreCero(){
        var e = assertThrows(IllegalArgumentException.class  

, ()-> calc.dividir(1, 0));
        assertEquals("No se puede dividir entre 0", e.getMessage());
    }
    
    @Test
    void testPromedioEntreCuatroNumeros(){
        assertEquals(2, calc.promedioEntreCuatroNumeros(1, 2, 3, 4));
    }
}
