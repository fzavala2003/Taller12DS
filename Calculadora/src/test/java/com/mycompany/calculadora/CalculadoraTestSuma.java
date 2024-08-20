package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTestSuma {

    Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
    
    @Test
    public void testSumaNegativos() {
        // SUM1: -3.5 + (-5.2) = -8.7
        double resultado = calculadora.suma(-3.5, -5.2);
        assertEquals(-8.7, resultado, 0.0001, "La suma de -3.5 y -5.2 debería ser -8.7");
    }
    
    @Test
    public void testSumaCeroYPositivo() {
        // SUM2: 0.0 + 5.6 = 5.6
        double resultado = calculadora.suma(0.0, 5.6);
        assertEquals(5.6, resultado, 0.0001, "La suma de 0.0 y 5.6 debería ser 5.6");
    }

    @Test
    public void testSumaPositivos() {
        // SUM3: 7.3 + 3.2 = 10.5
        double resultado = calculadora.suma(7.3, 3.2);
        assertEquals(10.5, resultado, 0.0001, "La suma de 7.3 y 3.2 debería ser 10.5");
    }
    
    @Test
    public void testSumaNumerosGrandes() {
        // SUM5: 1000.99 + 2000.01 = 3001.00
        double resultado = calculadora.suma(1000.99, 2000.01);
        assertEquals(3001.00, resultado, 0.0001, "La suma de 1000.99 y 2000.01 debería ser 3001.00");
    }

    @Test
    public void testSumaPositivoYNegativo() {
        // SUM6: -7.75 + 8.25 = 0.50
        double resultado = calculadora.suma(-7.75, 8.25);
        assertEquals(0.50, resultado, 0.0001, "La suma de -7.75 y 8.25 debería ser 0.50");
    }
    
    @Test
    public void testSumaCeros() {
        // SUM7: 0.0 + 0.0 = 0.0
        double resultado = calculadora.suma(0.0, 0.0);
        assertEquals(0.0, resultado, 0.0001, "La suma de 0.0 y 0.0 debería ser 0.0");
    }

    @Test
    public void testSumaMuchosDecimales() {
        // SUM8: 0.12345678 + 0.87654321 = 1.00000000
        double resultado = calculadora.suma(0.12345678, 0.87654321);
        assertEquals(1.00000000, resultado, 0.0001, "La suma de 0.12345678 y 0.87654321 debería ser 1.00000000");
    }
    
    

    
}