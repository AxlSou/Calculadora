package calculadora;

import java.util.Scanner;

/**
 * Clase que permite realizar operaciones de cociente, inverso y raiz cuadrada.
 *
 * @version 1.0
 * @author Axel Soubielle Almada (AxlSou)
 */

public class Cociente {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Divide dos números enteros y devuelve el resultado como un double.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resultado de la división de a entre b.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public static double dividirEnteros(int a, int b) {
        return dividirReales(a, b);
    }

    /**
     * Divide dos números reales y devuelve el resultado.
     *
     * @param a El dividendo.
     * @param b El divisor.
     * @return El resultado de la división de a entre b.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public static double dividirReales(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("ERROR: Division por cero no permitida.");
        }
        return a / b;
    }

    /**
     * Calcula el inverso de un número real.
     *
     * @param a El número a invertir.
     * @return El inverso de a (1/a).
     * @throws ArithmeticException Si se intenta calcular el inverso de cero.
     */
    public static double inverso(double a) {
        if (a == 0) {
            throw new ArithmeticException("ERROR: Inverso de cero no permitido.");
        }
        return 1 / a;
    }

    /**
     * Calcula la raíz cuadrada de un número real.
     *
     * @param a El número al que se le calculará la raíz cuadrada.
     * @return La raíz cuadrada de a.
     * @throws ArithmeticException Si se intenta calcular la raíz cuadrada de un número negativo.
     */
    public static double raizCuadrada(double a) {
        if (a < 0) {
            throw new ArithmeticException("ERROR: Raiz cuadrada de un numero negativo no permitida.");
        }
        return Math.sqrt(a);
    }


    /**
     * Muestra un menú que permite al usuario elegir entre diferentes operaciones matemáticas.
     */
    public static void menu() {
        String opcion;
        do {
            System.out.println("Introduce una opcion: ");
            System.out.println("E: Dividir enteros");
            System.out.println("R: Dividir reales");
            System.out.println("I: Inverso");
            System.out.println("C: Raiz cuadrada");
            System.out.println("X: Salir");
            System.out.print("Selecciona una opcion: ");
            opcion = scanner.nextLine().trim().toUpperCase();

            if (opcion.length() != 1) {
                System.out.println("\nERROR: Opcion no valida\n");
                continue;
            }

                switch (opcion) {
                    case "E":
                        System.out.println("Introduce el dividendo: ");
                        int dividendo = verificarEntero();
                        System.out.println("Introduce el divisor: ");
                        int divisor = verificarEntero();
                        System.out.println("El cociente es: " + dividirEnteros(dividendo, divisor));
                        break;
                    case "R":
                        System.out.println("Introduce el dividendo: ");
                        double dividendoR = verificarDouble();
                        System.out.println("Introduce el divisor: ");
                        double divisorR = verificarDouble();
                        System.out.println("El cociente es: " + dividirReales(dividendoR, divisorR));
                        break;
                    case "I":
                        System.out.println("Introduce el numero: ");
                        double numero = verificarDouble();
                        System.out.println("El inverso es: " + inverso(numero));
                        break;
                    case "C":
                        System.out.println("Introduce el numero: ");
                        double numeroC = verificarDouble();
                        System.out.println("La raiz cuadrada es: " + raizCuadrada(numeroC));
                        break;
                    case "X":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("\nERROR: Opcion no valida");
                        System.out.println();
                }
            System.out.println();
        } while (!opcion.equals("X"));
        scanner.close();
    }

    public static double verificarDouble(){
        while(!scanner.hasNextDouble()){
            System.out.println("Has introducido un valor erróneo, recuerde,decimales separados por comas");
            scanner.next();
        }
        double numero = scanner.nextDouble();
        scanner.nextLine();
        return numero;
    }

    public static int verificarEntero(){
        while(!scanner.hasNextInt()){
            System.out.println("Has introducido un valor erróneo, introduza un entero");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}
