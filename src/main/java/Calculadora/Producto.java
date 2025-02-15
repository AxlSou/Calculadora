package Calculadora;

import java.util.Scanner;

/**
 * Clase que permite realizar operaciones de multiplicacion.
 *
 * @version 1.0
 * @since 1.0
 * @author Jorge Vizuete Mendez
 */

public class Producto {

   private static Scanner leer = new Scanner(System.in);

   public static void main(String[] args){

        int opcion = 0;

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca un número real");
                    double a = verificarReal(sc);
                    System.out.println("Introduzca otro número real");
                    double b = verificarReal(sc);
                    System.out.println("Resultado = " + Producto.productoReales2(a, b));
                    break;
                case 2:
                    System.out.println("Introduzca un número entero");
                    int a = verificarEntero(sc);
                    System.out.println("Introduzca otro número entero");
                    int b = verificarEntero(sc);
                    System.out.println("Resultado = " + Producto.productoEnteros(a, b));
                    break;
                case 3:
                    System.out.println("Introduzca un número real");
                    double a = verificarReal(sc);
                    System.out.println("Introduzca otro número real");
                    double b = verificarReal(sc);
                    System.out.println("Introduzca otro número real");
                    double c = verificarReal(sc);
                    System.out.println("Resultado = " + Producto.productoReales3(a, b, c));
                    break;
                case 4:
                    System.out.println("Introduzca la base");
                    double base = verificarReal(sc);
                    System.out.println("Introduzca el exponente");
                    double exp = verificarReal(sc);
                    System.out.println("Resultado = " + potencia(base, exp));
                    break;
            }

        } while (opcion != 5);

        System.out.println("FIN DE PROGRAMA");

        leer.close();
    }

    /**
     * Método que imprime el menú por la pantalla
     * @param opcion (scanner que se introduce en la consola)
     * @return Elige la operación que se desea realizar
     */
    public static int menu() {
        int opcion = 0;

        System.out.println("1.- Producto de dos números reales");
        System.out.println("2.- Producto de dos números enteros");
        System.out.println("3.- Productos de tres números reales");
        System.out.println("4.- Potencia de un número");
        System.out.println("5.- Salir");
        System.out.println("Teclea una opción (5 para salir)");
        opcion = leer.nextInt();
        while (opcion < 1 || opcion > 5) {
            System.out.println("Opccion incorrecta. Elige un numero entre 1 y 5.");
            opcion = leer.nextInt();
        }

        return opcion;
    }

    /**
     * Método que verifica que la entrada en consola es un Integer.
     * @param sc (lectura por consola)
     * @return Si el valor introducido es un Integer, el programa almacena la entrada, en caso de no serlo, te indica
     * como introducirlo correctamente
     */
    public static int verificarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Has introducido un valor erroneo, introduzca un número entero");
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Método que verifica que la entrada en consola es un Double.
     * @param sc (lectura por consola)
     * @return Si el valor introducido es un Double, el programa almacena la entrada, en caso de no serlo, te indica
     * como introducirlo correctamente
     */
    public static double verificarReal(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Has introducido un valor erróneo, introduzca un número real");
            sc.next();
        }
        return sc.nextDouble();
    }

    /**
     * Método que permite multiplicar dos números reales
     * @param a = primer número real
     * @param b = segundo número real
     * @return producto de los dos parámetros
     */
    public static double productoReales2(double a, double b) {
        return a * b;
    }

    /**
     * Método que permite multiplicar dos números enteros
     * @param a = primer número entero
     * @param b = segundo número entero
     * @return producto de los dos parámetros
     */
    public static int productoEnteros(int a, int b){
        return a * b;
    }

    /**
     * Método que permite multiplicar tres números reales
     * @param a = primer número real
     * @param b = segundo número real
     * @param c = tercer número real
     * @return producto de los tres parámetros
     */
    public static double productoReales3(double a, double b, double c){
        return a * b * c;
    }

    /**
     * Método que permite obtener la potencia de un número
     * @param base
     * @param exp
     * @return potencia de la base elevado a su exponente
     */
    public static double potencia (double base, double exp) {
        return Math.pow(base, exp);
    }

    /**
     * Método para el test de la clase
     */
}
