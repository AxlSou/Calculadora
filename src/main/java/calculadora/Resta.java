package calculadora;

import java.util.Scanner;

/**
 * Clase Resta
<<<<<<< HEAD
 * Esta clase implementa métodos para realizar operaciones de resta con diferentes tipos de números.
 * Además, mantiene un valor acumulado al cual se le pueden restar valores sucesivamente.
 *
 * @author: Marilu Hernandez (SoyMarilu)
 * @version 1.0
=======
 *
 * Proporciona métodos para restar números reales y enteros, y un menú interactivo para seleccionar la operación.
 * Autor: Marilu Hernandez
 * Perfil de GitHub: SoyMarilu
>>>>>>> marilu-resta
 */
public class Resta {

    private double valorAcumulado;

    /**
     * Constructor que inicializa el valor acumulado a 0.
     */
    public Resta() {
        this.valorAcumulado = 0;
    }

    /**
     * Muestra el menú interactivo para realizar operaciones de resta.
     */
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        Resta resta = new Resta();
        char opcion;

        do {
            System.out.println("\n----- MENÚ RESTA -----");
            System.out.println("1. Restar 2 números reales");
            System.out.println("2. Restar 2 números enteros");
            System.out.println("3. Restar 3 números reales");
            System.out.println("4. Restar valor al acumulado");
            System.out.println("Q. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.next().charAt(0);
            sc.nextLine();

            switch (opcion) {
                case '1':
                    double real1 = pedirDouble(sc, "Ingrese el primer número real: ");
                    double real2 = pedirDouble(sc, "Ingrese el segundo número real: ");
                    System.out.println("Resultado: " + resta.restar(real1, real2));
                    break;

                case '2':
                    int int1 = pedirEntero(sc, "Ingrese el primer número entero: ");
                    int int2 = pedirEntero(sc, "Ingrese el segundo número entero: ");
                    System.out.println("Resultado: " + resta.restar(int1, int2));
                    break;

                case '3':
                    double r1 = pedirDouble(sc, "Ingrese el primer número real: ");
                    double r2 = pedirDouble(sc, "Ingrese el segundo número real: ");
                    double r3 = pedirDouble(sc, "Ingrese el tercer número real: ");
                    System.out.println("Resultado: " + resta.restar(r1, r2, r3));
                    break;

                case '4':
                    double valor = pedirDouble(sc, "Ingrese el valor a restar del acumulado: ");
                    resta.restarAcumulado(valor);
                    System.out.println("Valor acumulado actual: " + resta.getValorAcumulado());
                    break;

                case 'Q':
                case 'q':
                    System.out.println("Saliendo del menú Resta. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 'Q' && opcion != 'q');
    }

    /**
     * Resta dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la resta.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Resta dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la resta.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Resta tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la resta.
     */
    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Resta un valor al acumulado.
     * @param valor Valor a restar.
     */
    public void restarAcumulado(double valor) {
        this.valorAcumulado -= valor;
    }

    /**
     * Obtiene el valor acumulado actual.
     * @return Valor acumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }

    /**
     * Solicita y valida la entrada de un número entero.
     * @param sc Scanner para la entrada.
     * @param mensaje Mensaje a mostrar.
     * @return Número entero válido.
     */
    private static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Solicita y valida la entrada de un número real.
     * @param sc Scanner para la entrada.
     * @param mensaje Mensaje a mostrar.
     * @return Número real válido.
     */
    private static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.print("Entrada inválida. Ingrese un número real: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
