import org.example.Estadistica;

import java.util.Scanner;

public class EstadisticaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar los números desde la consola
        System.out.println("Introduce los números separados por espacios:");
        String input = scanner.nextLine().trim();  // Eliminar espacios en blanco al principio y al final

        // Verificar si la entrada no está vacía
        if (input.isEmpty()) {
            System.out.println("No se ingresaron números. El programa terminará.");
            return;
        }

        // Separar los números y convertirlos en un array de doubles
        String[] strNumbers = input.split("\\s+");  // Utilizamos expresión regular para separar por cualquier cantidad de espacios
        double[] numeros = new double[strNumbers.length];

        try {
            // Convertir cada valor ingresado en un número
            for (int i = 0; i < strNumbers.length; i++) {
                numeros[i] = Double.parseDouble(strNumbers[i]);
            }

            // Prueba para CalcularMedia
            System.out.println("Test de CalcularMedia:");
            double media = Estadistica.CalcularMedia(numeros);
            System.out.println("La media es: " + media);
            System.out.println();

            // Prueba para CalcularVarianza
            System.out.println("Test de CalcularVarianza:");
            double varianza = Estadistica.CalcularVarianza(numeros);
            System.out.println("La varianza es: " + varianza);
            System.out.println();

            // Prueba para CalcularDesviacionEstandar
            System.out.println("Test de CalcularDesviacionEstandar:");
            double desviacionEstandar = Estadistica.CalcularDesviacionEstandar(numeros);
            System.out.println("La desviación estándar es: " + desviacionEstandar);
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Asegúrese de ingresar solo números separados por espacios.");
        }
    }
}
