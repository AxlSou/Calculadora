package calculadora;

import calculadora.Suma;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {

    @Test
    public void testSumaDosReales() {
        assertEquals(5.5, Suma.sumaDosReales(2.5, 3.0));
        assertEquals(-1.5, Suma.sumaDosReales(-2.5, 1.0));
        assertEquals(0.0, Suma.sumaDosReales(0.0, 0.0));
    }

    @Test
    public void testSumaDosEnteros() {
        assertEquals(5, Suma.sumaDosEnteros(2, 3));
        assertEquals(-1, Suma.sumaDosEnteros(-2, 1));
        assertEquals(0, Suma.sumaDosEnteros(0, 0));
    }

    @Test
    public void testSumaTresReales() {
        assertEquals(6.0, Suma.sumaTresReales(1.0, 2.0, 3.0));
        assertEquals(-1.0, Suma.sumaTresReales(-1.0, 1.0, -1.0));
        assertEquals(0.0, Suma.sumaTresReales(0.0, 0.0, 0.0));
    }

    @Test
    public void testSumaAcumulacion() {

       /* double resultado = Suma.sumaAcumulacion(5);

        assertTrue(resultado >= 5); // Esto es solo un chequeo de base
            */
    }

}
