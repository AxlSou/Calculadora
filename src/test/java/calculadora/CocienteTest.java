package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para la clase Cociente.
 * @author Ruben Serrano(Guarin99)
 * @version 1.0
 */


class CocienteTest {
    /**
     * Verifica la división de números enteros.
     */
    @Test
    void dividirEnteros() {

        assertEquals(2.0, Cociente.dividirEnteros(10, 5));
        assertEquals(-2.0, Cociente.dividirEnteros(-10, 5));
        assertEquals(0.0, Cociente.dividirEnteros(0, 5));
    }

    /**
     * Verifica que se lance una excepción ArithmeticException al intentar dividir entre cero.
     */
    @Test
    void testDividirEnterosPorCero() {
        assertThrows(ArithmeticException.class, () -> Cociente.dividirEnteros(2, 0),
                "No se puede dividir entre 0");
    }

    /**
     * Verifica la división de números reales.
     */
    @Test
    void dividirReales() {
        assertEquals(2.5, Cociente.dividirReales(5.0, 2.0));
        assertEquals(-2.5, Cociente.dividirReales(-5.0, 2.0));
        assertEquals(0.0, Cociente.dividirReales(0.0, 2.0));
    }

    /**
     * Verifica que se lance una excepción ArithmeticException al intentar dividir entre cero.
     */
    @Test
    public void testDividirRealesPorCero() {
        assertThrows(ArithmeticException.class, () -> {
                    Cociente.dividirReales(5.0, 0.0);
                },
                "No se puede dividir entre 0");
    }

    /**
     * Verifica que el inverso de un número positivo y negativo sea calculado correctamente.
     */
    @Test
    public void textInverso() {
        assertEquals(0.5, Cociente.inverso(2.0));
        assertEquals(-0.5, Cociente.inverso(-2.0));
    }

    /**
     * Verifica que se lance una excepción ArithmeticException al intentar calcular el inverso de cero.
     */
    @Test
    public void textInversoCero() {
        assertThrows(ArithmeticException.class, () -> {
                    Cociente.inverso(0.0);
                },
                "No se podemos  sacar el valor inverso de 0");
    }

    /**
     * Verifica que la raíz cuadrada de un número positivo y cero sea calculada correctamente.
     */
    @Test
    public void raizCuadrada() {
        assertEquals(3, Cociente.raizCuadrada(9));
        assertEquals(0, Cociente.raizCuadrada(0));
    }

    /**
     * Verifica que se lance una excepción ArithmeticException al intentar calcular la raíz cuadrada de un número negativo.
     */
    @Test
    public void raizCuadradaDeNegativo() {
        assertThrows(ArithmeticException.class, () -> {
                    Cociente.raizCuadrada(-2);},
                "No se podemos  sacar la raiz cuadrada de un numero negativo");
    }


}