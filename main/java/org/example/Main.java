package org.example;

import java.util.Scanner;
/**
 * Clase que ejecuta operaciones de resta para una calculadora.
 * @author Marilú Hernández
 * @version 1.0
 * GitHub SoyMarilu
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resta resta = new Resta();

        // Resta de dos números reales
        System.out.print("Ingrese el primer número real: ");
        double num1Real = scanner.nextDouble();
        System.out.print("Ingrese el segundo número real: ");
        double num2Real = scanner.nextDouble();
        double resultadoReal = resta.restar(num1Real, num2Real);
        System.out.println("Resultado resta real: " + resultadoReal);

        // Resta de dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1Entero = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2Entero = scanner.nextInt();
        int resultadoEntero = resta.restar(num1Entero, num2Entero);
        System.out.println("Resultado resta entera: " + resultadoEntero);

        // Resta de tres números reales
        System.out.print("Ingrese el primer número real: ");
        double num1TresReales = scanner.nextDouble();
        System.out.print("Ingrese el segundo número real: ");
        double num2TresReales = scanner.nextDouble();
        System.out.print("Ingrese el tercer número real: ");
        double num3TresReales = scanner.nextDouble();
        double resultadoTresReales = resta.restar(num1TresReales, num2TresReales, num3TresReales);
        System.out.println("Resultado resta tres reales: " + resultadoTresReales);

        // Resta con valor acumulado
        System.out.print("Ingrese el valor a restar al acumulado: ");
        double valorAcumulado = scanner.nextDouble();
        resta.restarAcumulado(valorAcumulado);
        double acumulado = resta.getAcumulado();
        System.out.println("Valor acumulado: " + acumulado);

        scanner.close(); // Cerrar el scanner para liberar recursos//
    }
}
