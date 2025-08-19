package ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion, promedioMenor, promedioMayor, promedioTotal;
        double sumaMenor = 0, sumaMayor = 0, sumaTotal = 0, sumaUno = 0;
        int contadorMenor = 0, contadorMayor = 0, contadorTotal = 0, contadorUno = 0;

        for(int i = 0; i < 20; i++) {
            System.out.print("Ingrese la calificación del alumno " + (i + 1) + ": ");
            calificacion = entrada.nextDouble();

            if(calificacion < 0 || calificacion > 10) {
                System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                break;
            }else if(calificacion == 1){
                contadorUno++;
            }else if(calificacion < 6) {
                sumaMenor += calificacion;
                contadorMenor++;
            } else if(calificacion >= 6) {
                sumaMayor += calificacion;
                contadorMayor++;
            } 
            sumaTotal += calificacion;
            contadorTotal++;
        }
        if (contadorMenor > 0) {
            promedioMenor = sumaMenor / contadorMenor;
            System.out.println("El promedio de calificaciones menores a 6 es: " + promedioMenor);
        } else {
            System.out.println("No se ingresaron calificaciones menores a 6.");
        }
        if (contadorMayor > 0) {
            promedioMayor = sumaMayor / contadorMayor;
            System.out.println("El promedio de calificaciones mayores o iguales a 6 es: " + promedioMayor);
        } else {
            System.out.println("No se ingresaron calificaciones mayores o iguales a 6.");
        }
        if (contadorTotal > 0) {
            promedioTotal = sumaTotal / contadorTotal;
            System.out.println("El promedio total de calificaciones es: " + promedioTotal);
        } else {
            System.out.println("No se ingresaron calificaciones.");
        }
        if (contadorUno > 0) {
            System.out.println("Se ingresaron " + contadorUno + " calificaciones de 1.");
        } else {
            System.out.println("No se ingresaron calificaciones de 1.");
        }
        entrada.close();
    }
}
