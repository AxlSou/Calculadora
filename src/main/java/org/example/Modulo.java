package org.example;

/*
Clase Módulo
@author David Fernández Martínez (DavidPachu1)
@version 1.0
 */
public class Modulo {

    /* Metodo para calcular el módulo (residuo de la división entera)
     * @param a el dividendo
     * @param b el divisor (debe ser un número positivo y diferente de cero)
     * @return el residuo de la división de a entre b
     * @throws IllegalArgumentException si b es 0 o b es un número negativo
     */
    public static int calcularModulo(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Lo siento, el divisor no puede ser 0");
        }
        if (b < 0){
            throw new IllegalArgumentException("Lo siento, el divisor debe ser un numero positivo");
        }

        return a % b;
    }

    /* Metodo para calcular el valor absoluto
     * @param a el número del cual se desea calcular el valor absoluto
     * @return el valor absoluto de a
     */
    public static double calcularValorAbsoluto(double a) {
        if (a >= 0) {
            return a;
        }
        else {
            return -a;
        }
    }

    /** Metodo principal para probar otros métodos
     * @param args argumentos de línea de comando
     */
    public static void main(String[] args) {
        // Ejemplo de uso del metodo calcularModulo
        int a = 0;
        int b = 3;
        int residuo = calcularModulo(a,b);
        System.out.println("El residuo de " + a + " dividido por " + b + " es: " + residuo);

        // Ejemplo de uso del metodo calcularValorAbsoluto
        double numero = 8;
        double valorAbsoluto = calcularValorAbsoluto(numero);
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}

