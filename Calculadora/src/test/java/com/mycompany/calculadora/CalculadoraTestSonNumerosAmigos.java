package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author zaval
 */
public class CalculadoraTestSonNumerosAmigos {
    Calculadora calculadora = new Calculadora(); // Instanciamos la clase Calculadora
     @Test
    public void testSonNumerosAmigos220y284() {
        // NA01: 220 y 284 son números amigos
        boolean resultado = calculadora.sonAmigos(220, 284);
        assertTrue(resultado, "220 y 284 deberían ser números amigos");
    }

    @Test
    public void testSonNumerosAmigos284y220() {
        // NA02: 284 y 220 son números amigos (relación bidireccional)
        boolean resultado = calculadora.sonAmigos(284, 220);
        assertTrue(resultado, "284 y 220 deberían ser números amigos");
    }
    
    @Test
    public void testNoSonNumerosAmigos1y1() {
        // NA03: 1 y 1 no son números amigos
        boolean resultado = calculadora.sonAmigos(1, 1);
        assertFalse(resultado, "1 y 1 no deberían ser números amigos");
    }

    @Test
    public void testNoSonNumerosAmigos0y0() {
        // NA04: 0 y 0 no son números amigos
        boolean resultado = calculadora.sonAmigos(0, 0);
        assertFalse(resultado, "0 y 0 no deberían ser números amigos");
    }
}
    

