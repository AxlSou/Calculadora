package calculadora;

import java.util.Scanner;

/**
 * Clase que facilita los metodos para calcular funciones trigonometricas basicas.
 * Funcion para calcular el seno , coseno y tangente de un angulo en radianes.
 * Inculuye un menu para que el usuario pueda realizar los calculos.
 * @author Ruben Serrano Nohales (usuario git:guarin99)
 * @version 1.0
 * */
public class Trigonometria {

    /**
     * Calculo del seno de un angulo en radianes.
     *
     * @param a El angulo en radianes.
     * @return  El valor del seno del angulo.

     * */
    public static double seno(double a){
        return Math.sin (a);
    }

    /**
     * Calculo del coseno de un angulo en radianes.
     *
     * @param a El angulo en radianes.
     * @return  El valor del coseno del angulo.
     *
     * */

    public static double coseno(double a) {
        return Math.cos(a);
    }

    /**
     * Calcula la tangente de un angulo en radianes.
     *
     * @param a El angulo en radianes.
     * @return  El valor de la tangente del angulo.
     * */

    public  static double tangente(double a) {
        return seno(a) / coseno(a);
    }

    /**
     * Muestra un menu que nos permite seleccionar la operacion a realizar.
     * El menu se repite hasta que el usuario elije salir.
     * */

    public static void menu(){
        Scanner leer = new Scanner(System.in);

        char opcion;

        do {
            System.out.println("Estas en el menu de trigonometria");
            System.out.println("¿Que quieres hacer?");
            System.out.println("Calcular el seno(1)");
            System.out.println("Calcular el coseno(2)");
            System.out.println("Calcular la tangente(3)");
            System.out.println("Salir(0)");


            opcion = leer.next().charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("Introduce tu angulo en radianes");
                    if (leer.hasNextDouble()) {
                        double anguloSeno = (leer.nextDouble());
                        double resultadoSeno = seno(anguloSeno);
                        System.out.println("El seno de " + anguloSeno + " es " + resultadoSeno);
                    } else {
                        System.out.println("La entrada no es valida");
                    }

                    break;

                case '2':
                    System.out.println("Introduce tu angulo en radianes");
                    if (leer.hasNextDouble()) {
                        double anguloCoseno = (leer.nextDouble());
                        double resultadoCoseno = coseno(anguloCoseno);
                        System.out.println("El coseno de " + anguloCoseno + " es " + resultadoCoseno);
                    } else {
                        System.out.println("La entrada no es valida");
                    }

                    break;

                case '3':
                    System.out.println("Introduce tu angulo en radianes");
                    double anguloTangente = (leer.nextDouble());
                    if (Math.abs(coseno(anguloTangente)) == 0) {
                        System.out.println("El coseno no puede ser cero");
                    } else {
                        double resultadoTangente = tangente(anguloTangente);
                        System.out.println("La tangente de " + anguloTangente + " es " + resultadoTangente);
                    }

                    break;
            }
        }while (opcion != '0');

    }
}
