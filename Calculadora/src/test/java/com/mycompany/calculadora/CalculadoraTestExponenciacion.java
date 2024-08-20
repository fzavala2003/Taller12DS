package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zaval
 */
public class CalculadoraTestExponenciacion {
    Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
    
    @Test
    public void testExponenciacionPositivos() {
        // EXP01: 2.0 ^ 3.0 = 8.0
        double resultado = calculadora.exponenciacion(2.0, 3.0);
        assertEquals(8.0, resultado, 0.0001, "La exponenciación de 2.0 elevado a 3.0 debería ser 8.0");
    }

    @Test
    public void testExponenciacionNegativoYPositivoImpar() {
        // EXP02: -2.0 ^ 3.0 = -8.0
        double resultado = calculadora.exponenciacion(-2.0, 3.0);
        assertEquals(-8.0, resultado, 0.0001, "La exponenciación de -2.0 elevado a 3.0 debería ser -8.0");
    }
    
    @Test
    public void testExponenciacionNegativoYPositivoPar() {
        // EXP03: -2.0 ^ 2.0 = 4.0
        double resultado = calculadora.exponenciacion(-2.0, 2.0);
        assertEquals(4.0, resultado, 0.0001, "La exponenciación de -2.0 elevado a 2.0 debería ser 4.0");
    }

    @Test
    public void testExponenciacionA0Positivo() {
        // EXP04: 2.0 ^ 0.0 = 1.0
        double resultado = calculadora.exponenciacion(2.0, 0.0);
        assertEquals(1.0, resultado, 0.0001, "Cualquier número elevado a 0 debería ser 1.0");
    }

    @Test
    public void testExponenciacionCeroElevadoPositivo() {
        // EXP05: 0.0 ^ 3.0 = 0.0
        double resultado = calculadora.exponenciacion(0.0, 3.0);
        assertEquals(0.0, resultado, 0.0001, "0 elevado a cualquier número positivo debería ser 0.0");
    }

    @Test
    public void testExponenciacionCeroElevadoACero() {
        // EXP06: 0.0 ^ 0.0 = 1.0 / Indefinido
        double resultado = calculadora.exponenciacion(0.0, 0.0);
        assertEquals(1.0, resultado, 0.0001, "Matemáticamente 0 elevado a 0 puede ser tratado como 1.0 o indefinido");
    }

    @Test
    public void testExponenciacionDecimales() {
        // EXP07: 2.5 ^ 1.5 = 3.952847075
        double resultado = calculadora.exponenciacion(2.5, 1.5);
        assertEquals(3.952847075, resultado, 0.0001, "La exponenciación de 2.5 elevado a 1.5 debería ser 3.952847075");
    }

    @Test
    public void testBaseNegativaExponenteFraccionarioPar() {
        // Elevar -16 a la 1/4 (raíz cuarta de -16) es indefinido en números reales
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.exponenciacion(-16.0, 1.0 / 4.0);
        });
        assertTrue(exception.getMessage().contains("Resultado indefinido para raíz par de un número negativo"));
    }

    
    @Test
    public void testExponenciacionConExponenteNegativo() {
        // EXP09: 10.0 ^ -2.0 = 0.01
        double resultado = calculadora.exponenciacion(10.0, -2.0);
        assertEquals(0.01, resultado, 0.0001, "La exponenciación de 10.0 elevado a -2.0 debería ser 0.01");
    }

    @Test
    public void testExponenciacionBaseUno() {
        // EXP10: 1.0 ^ 1000.0 = 1.0
        double resultado = calculadora.exponenciacion(1.0, 1000.0);
        assertEquals(1.0, resultado, 0.0001, "Cualquier número base 1 elevado a cualquier exponente debería ser 1.0");
    }
    @Test
    public void testBasenegativaExponenteFraccionarioImpar() {
        // Elevar -8 a la 1/3 (raíz cúbica de -8) = -2.0
        double resultado = calculadora.exponenciacion(-8.0, 1.0 / 3.0);
        assertEquals(-2.0, resultado, 0.0001, "La raíz cúbica de -8 debería ser -2.0");
    }
}
