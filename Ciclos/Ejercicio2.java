package ejercicios;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entradas;
        int numero;
        int menor = Integer.MAX_VALUE;

        System.out.println("Ingrese los numeros a comparar: ");
        entradas = scanner.nextInt();

        if(entradas < 10){
            System.out.println("Debe ingresar al menos 10 numeros");
            return;
        }

        //Ciclo para que entradas
        for(int i = 0; i <= entradas; i++){
            System.out.println("Ingrese el numero " + i + ": ");
            numero = scanner.nextInt();

            //Verificar si es el menor
            if(numero < menor){
                menor = numero;
            }
        }

        // Mostrar el numero menor
        System.out.println("El numero menor es: " + menor);

        if(menor < 10){
            System.out.println("El numero menor es menor que 10!");
        }else {
            System.out.println("El numero menor es mayor o igual a 10!");
        }
    }
}
