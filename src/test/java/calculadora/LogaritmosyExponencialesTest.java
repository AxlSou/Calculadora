package calculadora;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LogaritmosyExponencialesTest {

    @Test
    void testLogaritmoNatural() {
        // Caso 1: Número positivo
        double resultado = calculadora.LogaritmosyExponenciales.logaritmoNatural(2.71828);
        assertEquals(1.0, resultado, 0.0001); // Usamos un delta para comparar números decimales

        // Caso 2: Número menor o igual a 0 (debe lanzar una excepción)
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.LogaritmosyExponenciales.logaritmoNatural(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.LogaritmosyExponenciales.logaritmoNatural(-5);
        });
    }

    @Test
    void testLogaritmoBase10() {
        // Caso 1: Número positivo
        double resultado = calculadora.LogaritmosyExponenciales.logaritmoBase10(100);
        assertEquals(2.0, resultado, 0.0001);

        // Caso 2: Número menor o igual a 0 (debe lanzar una excepción)
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.LogaritmosyExponenciales.logaritmoBase10(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.LogaritmosyExponenciales.logaritmoBase10(-10);
        });
    }

    @Test
    void testExponencial() {
        // Caso 1: Exponente positivo
        double resultado = calculadora.LogaritmosyExponenciales.exponencial(1);
        assertEquals(2.71828, resultado, 0.0001);

        // Caso 2: Exponente negativo
        resultado = calculadora.LogaritmosyExponenciales.exponencial(-1);
        assertEquals(0.367879, resultado, 0.0001);

        // Caso 3: Exponente cero
        resultado = calculadora.LogaritmosyExponenciales.exponencial(0);
        assertEquals(1.0, resultado, 0.0001);
    }


    @Test
    void testMenu() {
        String input = "N\n2.71828\nX\n"; // Prueba el logaritmo natural y luego sale
        Scanner sc = new Scanner(input);
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        calculadora.LogaritmosyExponenciales.menu(); // Ejecuta el menú con la entrada simulada
    }
}