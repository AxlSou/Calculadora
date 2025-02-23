package calculadora;
/**
 * Clase Resta
 * Esta clase implementa métodos para realizar operaciones de resta con diferentes tipos de números.
 * Además, mantiene un valor acumulado al cual se le pueden restar valores sucesivamente.
 *
 * @author: Marilu Hernandez (SoyMarilu)
 * @version 1.0
 */

public class Resta {

    private double valorAcumulado;
    /**
             * Constructor que inicializa el valor acumulado en 0.
             */
            public Resta() {
                this.valorAcumulado = 0;
            }

            /**
             * Resta dos números reales.
             * @param a Primer número real.
             * @param b Segundo número real.
             * @return La resta de a y b.
             */
            public double restar(double a, double b) {
                return a - b;
            }

            /**
             * Resta dos números enteros.
             * @param a Primer número entero.
             * @param b Segundo número entero.
             * @return La resta de a y b.
             */
            public int restar(int a, int b) {
                return a - b;
            }

            /**
             * Resta tres números reales.
             * @param a Primer número real.
             * @param b Segundo número real.
             * @param c Tercer número real.
             * @return La resta de a, b y c.
             */
            public double restar(double a, double b, double c) {
                return a - b - c;
            }

            /**
             * Resta un valor del acumulado.
             * @param valor Valor a restar del acumulado.
             */
            public void restarAcumulado(double valor) {
                this.valorAcumulado -= valor;
            }

            /**
             * Obtiene el valor acumulado.
             * @return El valor acumulado actual.
             */
            public double getValorAcumulado() {
                return valorAcumulado;
            }
}
