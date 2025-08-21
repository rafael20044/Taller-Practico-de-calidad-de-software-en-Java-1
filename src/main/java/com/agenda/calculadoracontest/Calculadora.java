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
    
    public double dividir (int a , int b){
        if (b == 0 ) throw  new IllegalArgumentException( " no se puede dividir entre cero");
        return  a / b;
    }
    public int multiplicar (int a , int b){
        return  a * b;
    }
    
    public int restar (int a, int b){
        return a - b;
    }
    
    public Double potencia (Double a, Double b){
        return Math.pow(a, b) ;
    }
    
    public Double raizCuadrada(Double a){
        return Math.sqrt(a);
    }
    
    public double promedioEntreCuatroNumeros(int n1, int n2, int n3, int n4){
        return (n1 + n2+ n3 + n4)/4;
    }
}
