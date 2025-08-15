/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenda.calculadoracontest;

/**
 *
 * @author aleja
 */
public class Calculadora {
    public int sumar (int a , int b){
        return  a + b;
    }
    
    public int dividir (int a , int b){
        if (b == 0 ) throw  new IllegalArgumentException( " no se puede dividir entre cero");
        return  a / b;
    }
    public int multiplicar (int a , int b){
        return  a * b;
    }
    
}
