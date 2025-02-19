package org.example;

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
        Trigonometria.seno(0);
        assertEquals(0, Trigonometria.seno(0));
    }

    @Test
    void coseno() {
        Trigonometria.coseno(0);
        assertEquals(1, Trigonometria.coseno(0));
    }

    @Test
    void tangente() {
        Trigonometria.tangente(0);
        assertEquals(0, Trigonometria.tangente(0));
    }

    @Test
    void menu() {
        Trigonometria.menu();
    }
}