package org.example;

/**
 * Clase que implementa operaciones de resta para una calculadora.
 * @author Marilú Hernández
 * @version 1.0
 */
public class Resta {

    private double acumulado;

    /**
     * Constructor de la clase Resta.
     * Inicializa el valor acumulado a 0.
     */
    public Resta() {
        this.acumulado = 0;
    }

    /**
     * Resta dos números reales.
     * @param num1 El primer número real.
     * @param num2 El segundo número real.
     * @return La diferencia entre num1 y num2.
     */
    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Resta dos números enteros.
     * @param num1 El primer número entero.
     * @param num2 El segundo número entero.
     * @return La diferencia entre num1 y num2.
     */
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Resta tres números reales.
     * @param num1 El primer número real.
     * @param num2 El segundo número real.
     * @param num3 El tercer número real.
     * @return La diferencia entre num1, num2 y num3.
     */
    public double restar(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    /**
     * Resta un valor al valor acumulado.
     * @param valor El valor a restar al acumulado.
     */
    public void restarAcumulado(double valor) {
        this.acumulado -= valor;
    }

    /**
     * Obtiene el valor acumulado.
     * @return El valor acumulado.
     */
    public double getAcumulado() {
        return this.acumulado;
    }
}