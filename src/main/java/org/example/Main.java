package org.example;
import calculadora.*;

import java.util.Scanner;

/**
 * @Author Noelia Prieto del Puerto
 * @Author Iván Díaz Moreno(ivXLR8)
 * @Author Marta Mercado Aguilar (martam-art)
 * @Author David Fernández Martínez(DavidPachu1)
 * @Author Axel Soubielle(AxlSou)
 * @Author Ruben Serrano Nohales(usuario git:guarin99)
 * @Author Ana Marilú Hernández Olivares(SoyMarilu)
 * @Author Jorge Vizuete Mendez (jorgevizu4)
 *
 * @version 1.0
 */


/**
 * Clase Main donde accedemos a un menu interactivo donde podemos seleccionar la
 * funcion de la calculadora que queremos utilizar
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola! Estas en Calculadora ");

        Scanner leer = new Scanner(System.in);

        char opcion;
        /**
         * Muestra el menu por pantalla
         */
        do {
            System.out.println("----menu---");
            System.out.println("¿Que quieres hacer?");
            System.out.println("Sumar -->pulsa 1");
            System.out.println("Restar -->pulsa 2");
            System.out.println("Producto -->pulsa 3");
            System.out.println("Cociente -->pulsa 4");
            System.out.println("Modulo -->pulsa 5");
            System.out.println("Estadistica -->pulsa 6");
            System.out.println("Logaritmos y Exponenciales -->pulsa 7");
            System.out.println("Trigonometria -->pulsa 8");
            System.out.println("Para salir -->pulsa 0");


            opcion = leer.next().charAt(0);
            leer.nextLine();
            switch (opcion) {
                /**
                 * Cada uno de los casos nos instancia a cada metodo
                 * que implementara la calculadora
                 */
                case '1':
                    calculadora.Suma.menu();
                    break;

                case '2':
                    break;

                case '3':
                    Producto.menu();
                    break;

                case '4':
                    Cociente.menu();
                    break;

                case '5':
                    Modulo.menu();
                    break;

                case '6':
                    Estadistica.menu();
                    break;

                case '7':
                    LogaritmosyExponenciales.menu();
                    break;

                case '8':
                    Trigonometria.menu();
                    break;
            }
        }while (opcion != '0');
        System.out.println("Salio del programa");

    }
}