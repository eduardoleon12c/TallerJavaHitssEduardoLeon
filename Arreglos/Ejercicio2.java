package arreglos;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un arreglo con 10 elementos en el rango de 1 a 9
        int[] arreglo = {1, 1, 7, 8, 4, 8, 8, 5, 9, 7};

        int numeroMasRepite = arreglo[0];
        int maxOcurrencias = 0;

        // Recorremos el arreglo para contar las ocurrencias
        for (int i = 0; i < arreglo.length; i++) {
            int contador = 0;

            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    contador++;
                }
            }

            // Actualizar si encontramos un número con más ocurrencias
            if (contador > maxOcurrencias) {
                maxOcurrencias = contador;
                numeroMasRepite = arreglo[i];
            }
        }

        // Imprimir resultados
        System.out.println("La mayor ocurrencia es: " + maxOcurrencias);
        System.out.println("El elemento que más se repite es: " + numeroMasRepite);
        System.out.println("En el ejemplo, el elemento que más se repite es el número "
                + numeroMasRepite + " con una ocurrencia de " + maxOcurrencias + " veces.");
    }
}
