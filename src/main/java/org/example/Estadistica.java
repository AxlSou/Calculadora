package org.example;

import java.io.OptionalDataException;
import java.util.Scanner;

/**
 * Clase para calcular diferentes formulas de estadística:
 * Proporciona operaciones de media, varianza y desviación estándar.
 *
 * @autor Noelia Prieto del Puerto
 * @version 1.0
 */

public class Estadistica {

    /**
     * Media de un array de números.
     *
     */
    public static double CalcularMedia(double [] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    /**
     * Varianza de un array de números.
     */

    public static double CalcularVarianza(double [] numeros){
        double suma = 0;
        for (double numero : numeros){
            suma += numero;
        }
        double media = suma/numeros.length;
        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }

        return sumaCuadrados / numeros.length;
    }

    /**
     * Desviación Estándar de un array de números.
     */

    public static double CalcularDesviacionEstandar(double [] numeros){
        double suma = 0;
        for (double numero : numeros){
            suma += numero;
        }
        double media = suma/numeros.length;
        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }

        double varianza = sumaCuadrados / numeros.length;
        return Math.sqrt(varianza);
    }


    /**
     * Menú interactivo para el usuario y poder elegir la función que desea.
     */
    public static void menu () {
        Scanner sc = new Scanner(System.in);
        char opcion = 0;
        do {
            System.out.println("Estás en el menu Estadística");
            System.out.println("¿Qué quieres  hacer?");
            System.out.println("Calcular la media (1)");
            System.out.println("Calcular la varianza (2)");
            System.out.println("Calcular la desviación estándar (3)");
            System.out.println("Para salir pulse (Q)");

            opcion = sc.next().charAt(0);
            sc.nextLine();

            if (opcion >= '1' && opcion <= '3') {
                System.out.println("Introduce los números separados por espacios:");
                String input = sc.nextLine();
                String[] strNumbers = input.split(" ");


                double[] numeros = new double[strNumbers.length];
                for (int i = 0; i < strNumbers.length; i++) {
                    numeros[i] = Double.parseDouble(strNumbers[i]);
                }

                switch (opcion) {
                    case '1':
                        System.out.println("La media es: " + CalcularMedia(numeros));

                        break;
                    case '2':
                        System.out.println("La varianza es: " + CalcularVarianza(numeros));

                        break;
                    case '3':
                        System.out.println("La desviación estándar es : " + CalcularDesviacionEstandar(numeros));

                        break;
                    default:
                        System.out.println("Opción incorrecta. Escriba otro número del 1 al 3 o Q para salir.");


                }
            }

        } while (opcion != 'Q' && opcion != 'q');

    }
}

