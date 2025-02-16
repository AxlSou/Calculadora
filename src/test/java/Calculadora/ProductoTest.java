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
        assertEquals(20.0, Producto.productoReales2(4.0, 5.0));
        assertEquals(-20.0, Producto.productoReales2(-4.0, 5.0));
        assertEquals(0.0, Producto.productoReales2(4.0, 0.0));
        assertEquals(20.0, Producto.productoReales2(-4.0, -5.0));
        assertEquals(8, Producto.productoReales2(4.0, 2));
    }

    @Test
    void productoEnteros() {

        assertEquals(-20, Producto.productoReales2(-4, 5));
        assertEquals(0, Producto.productoReales2(4.0, 0));
        assertEquals(20, Producto.productoReales2(-4, -5));
        assertEquals(8, Producto.productoReales2(4, 2));
        assertEquals(8, Producto.productoReales2(4, 2));
    }

    @Test
    void productoReales3() {
        assertEquals(-40.0, Producto.productoReales3(-4.0,5.0,2.0));
        assertEquals(40.0, Producto.productoReales3(4.0,5.0,2.0));
        assertEquals(40.0, Producto.productoReales3(-4.0,5.0,-2.0));
        assertEquals(-49.5, Producto.productoReales3(-4.5,-5.5,-2.0));
    }
    @Test
    void potencia() {
        assertEquals(1.0, Producto.potencia(1.0, 5.0));
        assertEquals(25.0, Producto.potencia(5.0, 2));
        assertEquals(8754, Producto.potencia(8754, 1));
        assertEquals(0.25, Producto.potencia(2.0, -2));
        assertEquals(null, Producto.potencia(0, 0));
        assertEquals(1, Producto.potencia(1, 0));
    }

}

