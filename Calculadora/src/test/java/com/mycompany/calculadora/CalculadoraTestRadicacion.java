package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zaval
 */
public class CalculadoraTestRadicacion {
    Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
    
   @Test
    public void testRadicacionCuadrada() {
        // RAD01: Raíz cuadrada de 9.0 = 3.0
        double resultado = calculadora.radicacion(9.0, 2.0);
        assertEquals(3.0, resultado, 0.0001, "La raíz cuadrada de 9.0 debería ser 3.0");
    }

    @Test
    public void testRadicacionCubicaNegativo() {
        // RAD04: Raíz cúbica de -8.0 = -2.0
        double resultado = calculadora.radicacion(-8.0, 3.0);
        assertEquals(-2.0, resultado, 0.0001, "La raíz cúbica de -8.0 debería ser -2.0");
    }

    @Test
    public void testRadicacionCuadradaNegativo() {
        // RAD05: Raíz cuadrada de -9.0 es Indefinido (en números reales)
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculadora.radicacion(-9.0, 2.0);
        });
        assertTrue(exception.getMessage().contains("Resultado indefinido para raíz par de un número negativo"));
    }
    
    @Test
    public void testRadicacionCuadradaDeCero() {
        // RAD06: Raíz cuadrada de 0.0 = 0.0
        double resultado = calculadora.radicacion(0.0, 2.0);
        assertEquals(0.0, resultado, 0.0001, "La raíz cuadrada de 0.0 debería ser 0.0");
    }

    @Test
    public void testRadicacionCubicaDeCero() {
        // RAD07: Raíz cúbica de 0.0 = 0.0
        double resultado = calculadora.radicacion(0.0, 3.0);
        assertEquals(0.0, resultado, 0.0001, "La raíz cúbica de 0.0 debería ser 0.0");
    }

    @Test
    public void testRadicacionUno() {
        // RAD08: Raíz n-ésima de 1.0 (independientemente del índice) = 1.0
        double resultado = calculadora.radicacion(1.0, 100.0);
        assertEquals(1.0, resultado, 0.0001, "La raíz n-ésima de 1.0 debería ser siempre 1.0");
    }

    @Test
    public void testRadicacionConIndiceNegativo() {
        // RAD09: Raíz de 8.0 con índice -3.0 = 0.5
        double resultado = calculadora.radicacion(8.0, -3.0);
        assertEquals(0.5, resultado, 0.0001, "La raíz de 8.0 con índice negativo -3.0 debería ser 0.5");
    }

    @Test
    public void testRaizFraccionaria() {
        // RAD10: Raíz fraccionaria 1.0^(1/2) = 1.0
        double resultado = calculadora.radicacion(1.0, 2.0);
        assertEquals(1.0, resultado, 0.0001, "La raíz cuadrada de 1.0 debería ser 1.0");
    }
    
}
