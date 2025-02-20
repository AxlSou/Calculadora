package org.example;

import java.util.Scanner;

/**
 * Clase Suma
 * Clase que proporciona la operación matemática Suma con varias opciones:
 *  1 -> Suma de dos números reales
 *  2 -> Suma de dos números enteros
 *  3 -> Suma de tres números reales
 *  4 -> Suma de valor acumulado
 * @author Iván Díaz (ivXLR8)
 * @version 1.0
 */

public class Suma {

    public static void menu (){
        Scanner sc = new Scanner(System.in);
        char opcion = 0;
        do{
            System.out.println("Estás en el menu Suma");
            System.out.println("¿Qué quieres  hacer?");
            System.out.println("Suma 2 reales (1)");
            System.out.println("Suma 2 enteros (2)");
            System.out.println("Suma 3 reales (3)");
            System.out.println("Suma valor acumulado (4)");
            System.out.println("Para salir pulse (Q)");

            opcion = sc.next().charAt(0);
            switch(opcion){
                case '1':
                    System.out.println("Ingrese un numero real, recuerde, decimales separados por comas");
                    double primerNumeroReal = verificarDouble(sc);
                    System.out.println("Ingrese un  segundo numero real, recuerde, decimales separados por comas");
                    double segundoNumeroReal = verificarDouble(sc);
                    System.out.println("La suma es: " + Suma.sumaDosReales(primerNumeroReal, segundoNumeroReal));
                    break;
                case '2':
                    System.out.println("Ingrese un numero entero");
                    int Int1 = verificarEntero(sc);
                    System.out.println("Ingrese un  segundo numero entero");
                    int Int2 = verificarEntero(sc);
                    System.out.println("La suma es: " + Suma.sumaDosEnteros(Int1, Int2));
                    break;
                case '3':
                    System.out.println("Ingrese un numero real, recuerde, decimales separados por comas");
                    double primerReal = verificarDouble(sc);
                    System.out.println("Ingrese un  segundo numero real, recuerde, decimales separados por comas");
                    double segundoReal = verificarDouble(sc);
                    System.out.println("Ingrese un  tercer numero real, recuerde, decimales separados por comas");
                    double tercerReal = verificarDouble(sc);
                    System.out.println("La suma es: " + Suma.sumaTresReales(primerReal, segundoReal, tercerReal));
                    break;
                case '4':
                    System.out.println("Introduce un número para sumar (o '0' para salir):");
                    double numeroInicial = sc.nextDouble();
                    System.out.println("La suma total es : " + Suma.sumaAcumulacion(numeroInicial));


            }
        } while (opcion != 'Q' && opcion != 'q');
     }

    /**
     * Un metodo que me permite verificar que la entrada en consola es un Double.
     * @param sc (lectura por consola del valor introducido)
     * Si el valor introducido es un Double, el programa almacena la entrada, en caso de no serlo, te indica
     * como introducirlo correctamente
     */
    public static double verificarDouble(Scanner sc){
        while(!sc.hasNextDouble()){
            System.out.println("Has introducido un valor erróneo, recuerde,decimales separados por comas");
            sc.next();
        }
        return sc.nextDouble();
    }

    /**
     * Un metodo que me permite verificar que la entrada en consola es un Entero (Integer).
     * @param sc (lectura por consola del valor introducido)
     * Si el valor introducido es un Entero, el programa almacena la entrada, en caso de no serlo, te indica
     * como introducirlo correctamente
     */

    public static int verificarEntero(Scanner sc){
        while(!sc.hasNextInt()){
            System.out.println("Has introducido un valor erroneo, introduzca un entero");
            sc.next();
        }
        return sc.nextInt();
    }

    /** Metodo que me permite realizar la suma de dos números reales
     * @param primerNumeroR : entrada del primer número real
     * @param segundoNumeroR : entrada del segundo número real
     * @return : La suma de los dos números reales
     */
    public static double  sumaDosReales (double  primerNumeroR, double  segundoNumeroR){
        return primerNumeroR + segundoNumeroR;
    }

    /**
     * Metodo que me permite obtener la suma de dos números enteros
     * @param primerNumeroI : entrada primero entero
     * @param segundoNumeroI : entrada segundo entero
     * @return : suma de enteros
     */
    public static int  sumaDosEnteros (int primerNumeroI, int segundoNumeroI){
        return primerNumeroI + segundoNumeroI;

    }

    /**
     *Metodo que devuelve la suma de tres números reales
     * @param primerNumeroR : entrada del primer número real
     * @param segundoNumeroR : entrada del segundo número real
     * @param tercerNumeroR : entrada del tercer número real
     * @return : La suma de los tres números reales
     */
    public static double  sumaTresReales (double  primerNumeroR, double  segundoNumeroR, double tercerNumeroR){
        return primerNumeroR + segundoNumeroR + tercerNumeroR;
    }

    /**
     * Metodo que devuelve la suma final de una sucesión de números, para finalizar el programa, hay que introducir
     * '0'.
     * @param numeroInicial : entrada de un primer número leido por consola
     * @return: la suma final de los dígitos introducidos por consola
     */
    public static double sumaAcumulacion (double numeroInicial) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el siguiente numero a sumar");
        double numero = sc.nextDouble();
        double valorAcumulado = numeroInicial;
        while (numero != 0){
            valorAcumulado += numero;
            System.out.println(valorAcumulado);
            System.out.println("+");

            numero = sc.nextDouble();
        }
        return valorAcumulado;
    }
}