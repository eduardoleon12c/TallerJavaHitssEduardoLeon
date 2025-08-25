package arreglos;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la X (n): ");
        int n = entrada.nextInt();

        // Validar si n es 0
        if (n == 0) {
            System.out.println("ERROR");
            return; 
        }

        // Recorremos filas
        for (int i = 0; i < n; i++) {
            // Recorremos columnas
            for (int j = 0; j < n; j++) {
                if (j == i || j == (n - 1 - i)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println(); 
        }
    }
}
