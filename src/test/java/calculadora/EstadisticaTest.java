package TestEstadistica;

import org.example.Estadistica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticaTest {

    // Método para ingresar los números desde la consola (lo simula en los tests)
    private double[] obtenerNumerosDesdeConsola(String input) {
        String[] strNumbers = input.split("\\s+");
        double[] numeros = new double[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numeros[i] = Double.parseDouble(strNumbers[i]);
        }
        return numeros;
    }

    @Test
    public void testConNumerosDesdeConsola() {
        // Simulando la entrada de consola
        String input = "1 2 3 4 5";  // Este string simula lo que el usuario ingresa en la consola
        double[] numeros = obtenerNumerosDesdeConsola(input);

        // Test para CalcularMedia
        double resultadoMedia = Estadistica.CalcularMedia(numeros);
        assertEquals(3.0, resultadoMedia, "La media debe ser 3.0");

        // Test para CalcularVarianza
        double resultadoVarianza = Estadistica.CalcularVarianza(numeros);
        assertEquals(2.0, resultadoVarianza, "La varianza debe ser 2.0");

        // Test para CalcularDesviacionEstandar
        double resultadoDesviacion = Estadistica.CalcularDesviacionEstandar(numeros);
        assertEquals(1.4142135623730951, resultadoDesviacion, "La desviación estándar debe ser aproximadamente 1.414");
    }

    @Test
    void testEntradaVacia() {
        String input = "";  // Entrada vacía para verificar cómo lo maneja el programa
        double[] numeros = obtenerNumerosDesdeConsola(input);

        // Test para CalcularMedia con entrada vacía
        double resultado = Estadistica.CalcularMedia(numeros);
        assertEquals(0.0, resultado, "La media de una entrada vacía debe ser 0.0");
    }

    @Test
    void testConNumerosNegativos() {
        String input = "-1 -2 -3 -4 -5";  // Simulando entrada con números negativos
        double[] numeros = obtenerNumerosDesdeConsola(input);

        // Test para CalcularMedia con números negativos
        double resultado = Estadistica.CalcularMedia(numeros);
        assertEquals(-3.0, resultado, "La media de los números negativos debe ser -3.0");
    }
}
