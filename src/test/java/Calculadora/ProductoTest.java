package Calculadora;

import Calculadora.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ProductoTest {

    private Producto producto;
    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    @Test
    void productoReales2() {
        // Caso1: dos numeros reales positivos
        assertEquals(20.0, Producto.productoReales2(4.0, 5.0));
        assertEquals(8, Producto.productoReales2(4.0, 2));
        // Caso2: un numero real positivo y otro negativo
        assertEquals(-20.0, Producto.productoReales2(-4.0, 5.0));
        //Caso3: multiplicar por 0
        assertEquals(0.0, Producto.productoReales2(4.0, 0.0));
        // Caso4: dos numeros reales negativos
        assertEquals(20.0, Producto.productoReales2(-4.0, -5.0));

    }

    @Test
    void productoEnteros() {
        assertEquals(-20, Producto.productoReales2(-4, 5));
        assertEquals(0, Producto.productoReales2(4.0, 0));
        assertEquals(20, Producto.productoReales2(-4, -5));
        assertEquals(8, Producto.productoReales2(4, 2));
    }

    @Test
    void productoReales3() {
        // Caso1: tres numeros reales positivos
        assertEquals(40.0, Producto.productoReales3(4.0,5.0,2.0));
        // Caso2: un negativo  y dos positivos
        assertEquals(-40.0, Producto.productoReales3(-4.0,5.0,2.0));
        // Caso3: dos negativos, un positivo
        assertEquals(40.0, Producto.productoReales3(-4.0,5.0,-2.0));
        // Caso4: tres negativos
        assertEquals(-49.5, Producto.productoReales3(-4.5,-5.5,-2.0));
    }
    @Test
    void potencia() {
        // Caso 1: base positiva, exponente positivo
        assertEquals(1.0, Producto.potencia(1.0, 5.0));
        assertEquals(25.0, Producto.potencia(5.0, 2));
        assertEquals(8754, Producto.potencia(8754, 1));
        // Caso 2: base positiva, exponente negativo
        assertEquals(0.25, Producto.potencia(2.0, -2));
        // Caso 3: base 0, exponente 0 (se resuelve con 1 por convenio)
        assertEquals(1, Producto.potencia(0, 0));
        //Caso 4: base positiva, exponente 0
        assertEquals(1, Producto.potencia(1, 0));
        //Caso 5: excepción, base 0 , exponente negativo
        assertThrows(ArithmeticException.class, () -> Producto.potencia(0.0, -2));
    }

}

