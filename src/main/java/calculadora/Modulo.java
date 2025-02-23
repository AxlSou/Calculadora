package calculadora;

import java.util.Scanner;

/**
Clase Módulo
@author David Fernández Martínez (DavidPachu1)
@version 1.0
 */
public class Modulo {

    /** Metodo para calcular el módulo (residuo de la división entera)
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

    /** Metodo para calcular el valor absoluto
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
     */
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Calcular módulo");
            System.out.println("2. Calcular valor absoluto");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el dividendo: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingresa el divisor: ");
                    int b = scanner.nextInt();
                    try {
                        int resultado = calcularModulo(a, b);
                        System.out.println("El residuo de " + a + " dividido por " + b + " es: " + resultado);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Ingresa un número: ");
                    double numero = scanner.nextDouble();
                    double valorAbsoluto = calcularValorAbsoluto(numero);
                    System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);

    }
}

