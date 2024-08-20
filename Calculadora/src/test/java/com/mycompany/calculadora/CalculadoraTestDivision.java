package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



/**
 *
 * @author zaval
 */
public class CalculadoraTestDivision {
    Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
    @Test
    public void testDivisionPositivos() {
        // DIV01: 10.0 / 2.0 = 5.0
        double resultado = calculadora.division(10.0, 2.0);
        assertEquals(5.0, resultado, 0.0001, "La división de 10.0 entre 2.0 debería ser 5.0");
    }

    @Test
    public void testDivisionNegativoYPositivo() {
        // DIV02: -9.0 / 3.0 = -3.0
        double resultado = calculadora.division(-9.0, 3.0);
        assertEquals(-3.0, resultado, 0.0001, "La división de -9.0 entre 3.0 debería ser -3.0");
    }

    @Test
    public void testDivisionPositivoYNegativo() {
        // DIV03: 7.5 / -2.5 = -3.0
        double resultado = calculadora.division(7.5, -2.5);
        assertEquals(-3.0, resultado, 0.0001, "La división de 7.5 entre -2.5 debería ser -3.0");
    }

    @Test
    public void testDivisionNumeradorCero() {
        // DIV04: 0.0 / 4.0 = 0.0
        double resultado = calculadora.division(0.0, 4.0);
        assertEquals(0.0, resultado, 0.0001, "La división de 0.0 entre 4.0 debería ser 0.0");
    }

    @Test
    public void testDivisionPeriodica() {
        // DIV05: 1.0 / 3.0 = 0.33333333
        double resultado = calculadora.division(1.0, 3.0);
        assertEquals(0.33333333, resultado, 0.0001, "La división de 1.0 entre 3.0 debería ser 0.33333333");
    }

    @Test
    public void testDivisionNumerosGrandes() {
        // DIV06: 1000.0 / 1.0 = 1000.0
        double resultado = calculadora.division(1000.0, 1.0);
        assertEquals(1000.0, resultado, 0.0001, "La división de 1000.0 entre 1.0 debería ser 1000.0");
    }

    @Test
    public void testDivisionPorCero() {
        // DIV07: 5.0 / 0.0 = Error / Infinito
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.division(5.0, 0.0);
        });
        assertTrue(exception.getMessage().contains("División por cero"));
    }
    
    @Test
    public void testDivisionMuchosDecimales() {
        // DIV08: 1.12345678 / 0.87654321 = 1.281690129
        double resultado = calculadora.division(1.12345678, 0.87654321);
        assertEquals(1.281690129, resultado, 0.0001, "La división de 1.12345678 entre 0.87654321 debería ser 1.28125000");
    }

    @Test
    public void testDivisionCeroentreCero() {
        // DIV09: 0.0 / 0.0 = Error / Infinito
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.division(0.0, 0.0);
        });
        assertTrue(exception.getMessage().contains("División por cero"));
    }
    
}
