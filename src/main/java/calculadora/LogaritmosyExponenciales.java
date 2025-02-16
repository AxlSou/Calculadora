package calculadora;

import java.util.Scanner;

public class LogaritmosyExponenciales {

    /**
     * Clase Logaritmos y Exponenciales
     * Esta clase proporciona funciones para calcular logaritmos y exponenciales.
     * Los métodos son:
     * 1 -> Cálculo del logaritmo natural (base e).
     * 2 -> Cálculo del logaritmo en base 10.
     * 3 -> Cálculo de la exponencial (e^x).
     * @author Marta Mercado (martam-art)
     * @version 1.0
     */

    /**
     * Calcula el logaritmo natural (base e) de un número.
     * Fórmula: ln(x) = y, si e^y = x.
     *
     * @param x El número (x > 0)
     * @return El logaritmo natural de x
     * @throws IllegalArgumentException si x <= 0
     */
    public static double logaritmoNatural(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Valor erróneo, el valor de x debe ser mayor que 0");
        }
        return Math.log(x);
    }
    /**
     * Calcula el logaritmo en base 10 de un número.
     * Fórmula: log10(x) = y, donde 10^y = x.
     *
     * @param x El número (x > 0)
     * @return El logaritmo en base 10 de x
     * @throws IllegalArgumentException si x <= 0
     */
    public static double logaritmoBase10(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Valor erróneo, el valor de x debe ser mayor que 0");
        }
        return Math.log10(x);
    }
    /**
     * Calcula la exponencial (e^x) de un número.
     * Fórmula: e^x.
     *
     * @param x El exponente.
     * @return El valor de e elevado a x.
     */
    public static double exponencial(double x) {
        return Math.exp(x);
    }

    /**
     * Solicita al usuario un número mayor que 0 y valida la entrada.
     * Si el usuario ingresa un valor no numérico, se muestra un mensaje de error y se solicita nuevamente.
     * Si el usuario ingresa un número menor o igual a 0, se muestra un mensaje de error y se vuelve a pedir.
     * No finaliza hasta que se ingrese un número válido.
     *
     * @param sc el objeto {@code Scanner} utilizado para leer la entrada del usuario.
     * @return un número válido mayor que 0 ingresado por el usuario.
     */
    private static double verificarNumero(Scanner sc) {
        if (sc == null) {
            throw new IllegalArgumentException("El Scanner no puede ser null.");
        }

        double numero;

        do {
            System.out.print("Ingrese un número mayor que 0: ");

            while (!sc.hasNextDouble()) {
                System.out.print("Error: Ingrese un número válido: ");
                sc.next();
            }

            numero = sc.nextDouble();

            if (numero <= 0) {
                System.out.println("Error: El número debe ser mayor que 0.");
            }
        } while (numero <= 0);

        return numero;
    }


    /**
     * Lo siguiente es un menú interactivo para realizar los cálculos de logaritmos y exponenciales..
     */

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Estás en el menú Logaritmos y Exponenciales");
            System.out.println("¿Qué quieres hacer?: ");
            System.out.println("Logaritmo Natural (N)");
            System.out.println("Logaritmo Base 10 (B)");
            System.out.println("Exponencial (E)");
            System.out.println("Salir (X)");

            opcion = Character.toUpperCase(sc.next().charAt(0));
            switch (opcion) {
                case 'N':
                    double x = verificarNumero(sc);
                    System.out.println("El logaritmo natural de " + x + " es: " + logaritmoNatural(x));
                    break;

                case 'B':
                    double y = verificarNumero(sc);
                    System.out.println("El logaritmo en base 10 de " + y + " es: " + logaritmoBase10(y));
                    break;

                case 'E':
                    System.out.print("Ingrese el exponente: ");
                    double exponente = sc.nextDouble();
                    System.out.println("El resultado de e^" + exponente + " es: " + exponencial(exponente));
                    break;

                case 'X':
                    System.out.println("Saliendo del menú...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 'X');

    }
            }
