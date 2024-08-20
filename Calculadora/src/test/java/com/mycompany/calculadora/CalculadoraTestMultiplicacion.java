package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 *
 * @author CltControl
 */
public class CalculadoraTestMultiplicacion {
    Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
    
    @Test
    public void testMultiplicacionNegativos() {
        // MUL01: -3.5 * -5.2 = 18.2
        double resultado = calculadora.multiplicacion(-3.5, -5.2);
        assertEquals(18.2, resultado, 0.0001, "La multiplicación de -3.5 y -5.2 debería ser 18.2");
    }
    
    @Test
    public void testMultiplicacionCeroYPositivo() {
        // MUL02: 0.0 * 5.5 = 0.0
        double resultado = calculadora.multiplicacion(0.0, 5.5);
        assertEquals(0.0, resultado, 0.0001, "La multiplicación de 0.0 y 5.5 debería ser 0.0");
    }

    @Test
    public void testMultiplicacionPositivos() {
        // MUL03: 7.4 * 3.2 = 23.68
        double resultado = calculadora.multiplicacion(7.4, 3.2);
        assertEquals(23.68, resultado, 0.0001, "La multiplicación de 7.4 y 3.2 debería ser 23.68");
    }
    
    @Test
    public void testMultiplicacionNumerosGrandes() {
        // MUL04: 3000.5 * 1000.3 = 3001500.15
        double resultado = calculadora.multiplicacion(3000.5, 1000.3);
        assertEquals(3001400.15, resultado, 0.0001, "La multiplicación de 3000.5 y 1000.3 debería ser 3001500.15");
    }

    @Test
    public void testMultiplicacionPositivoYNegativo() {
        // MUL05: -7.8 * 8.4 = -65.52
        double resultado = calculadora.multiplicacion(-7.8, 8.4);
        assertEquals(-65.52, resultado, 0.0001, "La multiplicación de -7.8 y 8.4 debería ser -65.52");
    }

    @Test
    public void testMultiplicacionCeros() {
        // MUL06: 0.0 * 0.0 = 0.0
        double resultado = calculadora.multiplicacion(0.0, 0.0);
        assertEquals(0.0, resultado, 0.0001, "La multiplicación de 0.0 y 0.0 debería ser 0.0");
    }
    
}
