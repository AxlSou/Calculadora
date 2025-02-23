package calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    // Test para calcular la media de un conjunto de números
    @Test
    void testCalcularMedia() {
        double[] numeros = {1, 2, 3, 4, 5};
        double resultado = Estadistica.CalcularMedia(numeros);

        // Verificamos que la media sea 3.0
        assertEquals(3.0, resultado, "La media de los números debe ser 3.0");
    }

    // Test para calcular la varianza
    @Test
    void testCalcularVarianza() {
        double[] numeros = {1, 2, 3, 4, 5};
        double resultado = Estadistica.CalcularVarianza(numeros);

        // La varianza de estos números es 2.0
        assertEquals(2.0, resultado, "La varianza debe ser 2.0");
    }

    // Test para calcular la desviación estándar
    @Test
    void testCalcularDesviacionEstandar() {
        double[] numeros = {1, 2, 3, 4, 5};
        double resultado = Estadistica.CalcularDesviacionEstandar(numeros);

        // La desviación estándar debe ser aproximadamente 1.4142135623730951
        assertEquals(1.4142135623730951, resultado, 0.0000001, "La desviación estándar debe ser aproximadamente 1.414");
    }

    // Test para cuando la entrada está vacía
    @Test
    void testEntradaVacia() {
        double[] numerosVacios = {};
        double resultado = Estadistica.CalcularMedia(numerosVacios);

        // Verificamos que la media de una lista vacía sea 0.0
        assertEquals(0.0, resultado, "La media de una entrada vacía debe ser 0.0");
    }

    // Test para cuando hay números negativos
    @Test
    void testConNumerosNegativos() {
        double[] numeros = {-1, -2, -3, -4, -5};
        double resultado = Estadistica.CalcularMedia(numeros);

        // La media de estos números es -3.0
        assertEquals(-3.0, resultado, "La media de los números negativos debe ser -3.0");
    }
}
