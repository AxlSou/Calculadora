package calculadora;

import java.util.Scanner;

public class Producto {

    private static Scanner leer = new Scanner(System.in);
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
     * Método para obtener los resultados utilizando los demas métodos
     * @param args
     */
    public static void main(String[] args) {

        final Scanner leer = new Scanner(System.in);

        int opcion = 0;
        do {
            opcion = Producto.menu();
            switch (opcion) {
                case 1:
                    double a;
                    System.out.println("Introduzca un número real");
                    a = Producto.verificarReal(leer);
                    double b;
                    System.out.println("Introduzca otro número real");
                    b = Producto.verificarReal(leer);
                    System.out.println("Resultado = " + Producto.productoReales2(a, b));
                    break;
                case 2:
                    System.out.println("Introduzca un número entero");
                    int c = Producto.verificarEntero(leer);
                    System.out.println("Introduzca otro número entero");
                    int d = Producto.verificarEntero(leer);
                    System.out.println("Resultado = " + Producto.productoEnteros(c, d));
                    break;
                case 3:
                    System.out.println("Introduzca un número real");
                    double e = Producto.verificarReal(leer);
                    System.out.println("Introduzca otro número real");
                    double f = Producto.verificarReal(leer);
                    System.out.println("Introduzca otro número real");
                    double g = Producto.verificarReal(leer);
                    System.out.println("Resultado = " + Producto.productoReales3(e, f, g));
                    break;
                case 4:
                    System.out.println("Introduzca la base");
                    double base = Producto.verificarReal(leer);
                    System.out.println("Introduzca el exponente");
                    double exp = Producto.verificarReal(leer);
                    System.out.println("Resultado = " + Producto.potencia(base, exp));
                    break;
            }

        } while (opcion != 5);

        System.out.println("FIN DE PROGRAMA");

        leer.close();
    }
}
