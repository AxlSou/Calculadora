package Calculadora;

import org.example.Trigonometria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrigonometriaTest {

    private Trigonometria trigonometria;

    @BeforeEach
    void setUp() {
        trigonometria = new Trigonometria();
    }

    @Test
    void seno() {
        Trigonometria.seno(Math.PI/2);
        assertEquals(1, Trigonometria.seno(Math.PI/2));
    }

    @Test
    void coseno() {
        Trigonometria.coseno(Math.PI);
        assertEquals(-1, Trigonometria.coseno(Math.PI));
    }

    @Test
    void tangente() {
        Trigonometria.tangente(0);
        assertEquals(0, Trigonometria.tangente(0));
    }
}