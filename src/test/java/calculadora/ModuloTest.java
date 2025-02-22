package calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ModuloTest {

    @ParameterizedTest
    @CsvSource({"0, 3, 0", "1, 3, 1", "2, 3, 2", "3, 3, 0", "4, 3, 1", "5, 3, 2", "6, 3, 0", "7, 3, 1", "8, 3, 2", "9, 3, 0"})
    void calcularModulo(int a, int b, int expected) {
        //given csv source
        // when
        // then
        assertEquals(expected, Modulo.calcularModulo(a, b));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenDivisorIsZero() {
        //given
        int a = 0;
        int b = 0;
        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> Modulo.calcularModulo(a, b));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenDivisorIsNegative() {
        //given
        int a = 0;
        int b = -3;
        // when
        // then
        assertThrows(IllegalArgumentException.class, () -> Modulo.calcularModulo(a, b));
    }

    @Test
    void calcularValorAbsoluto() {
        //given
        double numero = 8;
        double numero2 = -8;
        double numero3 = 0;
        double numero4 = 0.5;
        double numero5 = -0.5;
        double numero6 = -1065;
        double numero7 = 1065;
        // when
        // then
        assertEquals(8, Modulo.calcularValorAbsoluto(numero));
        assertEquals(8, Modulo.calcularValorAbsoluto(numero2));
        assertEquals(0, Modulo.calcularValorAbsoluto(numero3));
        assertEquals(0.5, Modulo.calcularValorAbsoluto(numero4));
        assertEquals(0.5, Modulo.calcularValorAbsoluto(numero5));
        assertEquals(1065, Modulo.calcularValorAbsoluto(numero6));
        assertEquals(1065, Modulo.calcularValorAbsoluto(numero7));
    }
}