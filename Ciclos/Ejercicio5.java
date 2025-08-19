package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        double totalVentas = 0; // acumulador de ventas

        while (opcion != 3) {
            // Menú
            System.out.println("\n--- Menú del Cajero ---");
            System.out.println("1. Registrar un pedido");
            System.out.println("2. Mostrar el total de ventas");
            System.out.println("3. Salir del sistema");
            System.out.print("Elige una opción: ");
            
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el precio del pedido: ");
                    double precio = entrada.nextDouble();

                    if (precio > 0) {
                        totalVentas += precio; // acumular ventas
                        System.out.println("Pedido registrado correctamente.");
                    } else {
                        System.out.println("Error: el precio debe ser positivo.");
                    }
                    break;

                case 2:
                    System.out.println("El total de ventas es: $" + totalVentas);
                    break;

                case 3:
                    System.out.println("¡Gracias por usar el sistema! Hasta pronto.");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

        entrada.close();
    }
}
