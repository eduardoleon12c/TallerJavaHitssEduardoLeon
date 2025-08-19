package ejercicios;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = in.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = in.nextInt();

        // Verificar signos
        int signo = 1;
        if (numero1 < 0) {
            signo *= -1;
            numero1 = -numero1; // hacerlo positivo
        }
        if (numero2 < 0) {
            signo *= -1;
            numero2 = -numero2; // hacerlo positivo
        }

        // Multiplicación mediante sumas
        int resultado = 0;
        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }

        // Agregar el signo
        resultado *= signo;

        System.out.println("El resultado es: " + resultado );
        in.close();

    }
}
