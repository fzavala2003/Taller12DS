package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author CltControl
 */
public class CalculadoraTestResta {
     Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
     
      @Test
    public void testRestaNegativos() {
        // RES01: -3.5 - (-5.2) = 1.7
        double resultado = calculadora.resta(-3.5, -5.2);
        assertEquals(1.7, resultado, 0.0001, "La resta de -3.5 y -5.2 debería ser 1.7");
    }
    
    @Test
    public void testRestaCeroYPositivo() {
        // RES02: 0.0 - 5.5 = -5.5
        double resultado = calculadora.resta(0.0, 5.5);
        assertEquals(-5.5, resultado, 0.0001, "La resta de 0.0 y 5.5 debería ser -5.5");
    }

    @Test
    public void testRestaPositivos() {
        // RES03: 7.4 - 3.2 = 4.2
        double resultado = calculadora.resta(7.4, 3.2);
        assertEquals(4.2, resultado, 0.0001, "La resta de 7.4 y 3.2 debería ser 4.2");
    }
    
    @Test
    public void testRestaNumerosGrandes() {
        // RES04: 3000.5 - 1000.3 = 2000.2
        double resultado = calculadora.resta(3000.5, 1000.3);
        assertEquals(2000.2, resultado, 0.0001, "La resta de 3000.5 y 1000.3 debería ser 2000.2");
    }

    @Test
    public void testRestaPositivoYNegativo() {
        // RES05: -7.8 - 8.4 = -16.2
        double resultado = calculadora.resta(-7.8, 8.4);
        assertEquals(-16.2, resultado, 0.0001, "La resta de -7.8 y 8.4 debería ser -16.2");
    }

    @Test
    public void testRestaMayorQueMenor() {
        // RES06: 3.5 - 7.7 = -4.2
        double resultado = calculadora.resta(3.5, 7.7);
        assertEquals(-4.2, resultado, 0.0001, "La resta de 3.5 y 7.7 debería ser -4.2");
    }

    @Test
    public void testRestaPositivoYNegativoInverso() {
        // RES07: 5.3 - (-3.2) = 8.5
        double resultado = calculadora.resta(5.3, -3.2);
        assertEquals(8.5, resultado, 0.0001, "La resta de 5.3 y -3.2 debería ser 8.5");
    }
    
    @Test
    public void testRestaPositivoConCero() {
        // RES08: 5.5 - 0.0 = 5.5
        double resultado = calculadora.resta(5.5, 0.0);
        assertEquals(5.5, resultado, 0.0001, "La resta de 5.5 y 0.0 debería ser 5.5");
    }

    @Test
    public void testRestaIguales() {
        // RES09: 5.5 - 5.5 = 0.0
        double resultado = calculadora.resta(5.5, 5.5);
        assertEquals(0.0, resultado, 0.0001, "La resta de 5.5 y 5.5 debería ser 0.0");
    }

    @Test
    public void testRestaCeros() {
        // RES10: 0.0 - 0.0 = 0.0
        double resultado = calculadora.resta(0.0, 0.0);
        assertEquals(0.0, resultado, 0.0001, "La resta de 0.0 y 0.0 debería ser 0.0");
    }
}
