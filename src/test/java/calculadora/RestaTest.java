package calculadora;
import calculadora.Resta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    private Resta resta;

    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    @Test
    void testRestarPositivos() {
        assertEquals(5, resta.restar(10, 5));
    }

    @Test
    void testRestarNegativos() {
        assertEquals(-2, resta.restar(-5, -3));
    }

    @Test
    void testRestarResultadoNegativo() {
        assertEquals(-4, resta.restar(3, 7));
    }

    @Test
    void testRestarConCero() {
        assertEquals(5, resta.restar(5, 0));
        assertEquals(-5, resta.restar(0, 5));
    }

    @Test
    void testRestarIguales() {
        assertEquals(0, resta.restar(9, 9));
    }

    @Test
    void testRestarDecimales() {
        assertEquals(4.3, resta.restar(7.5, 3.2), 0.0001);
    }

    @Test
    void testRestarTresNumeros() {
        assertEquals(4, resta.restar(10, 4, 2));
    }

    @Test
    void testRestarAcumulado() {
        resta.restarAcumulado(5);
        assertEquals(-5, resta.getValorAcumulado(), 0.0001);

        resta.restarAcumulado(3);
        assertEquals(-8, resta.getValorAcumulado(), 0.0001);

        resta.restarAcumulado(-2);
        assertEquals(-6, resta.getValorAcumulado(), 0.0001);
    }

    @Test
    void testGetValorAcumuladoInicial() {
        assertEquals(0, resta.getValorAcumulado(), 0.0001);
    }
}
