package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        // Ciclo que se repetirá hasta que el usuario elija salir (opción 5)
        while (opcion != 5) {
            // Menú de opciones
            System.out.println("\n--- Menú de Administración ---");
            System.out.println("1. Actualizar");
            System.out.println("2. Eliminar");
            System.out.println("3. Crear");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = entrada.nextInt(); // leer la opción

            // Switch para manejar las opciones
            switch (opcion) {
                case 1:
                    System.out.println("Usuario actualizado correctamente");
                    break;
                case 2:
                    System.out.println("Usuario eliminado correctamente");
                    break;
                case 3:
                    System.out.println("Usuario creado correctamente");
                    break;
                case 4:
                    System.out.println("Listado de usuarios mostrado correctamente");
                    break;
                case 5:
                    System.out.println("Haz salido con éxito!");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }

        entrada.close(); // Cerrar el scanner
    }
}
