import java.util.Random;

public class C4MatrizSumaFilas {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Random rand = new Random();

        // Cargar la matriz con números aleatorios entre 0 y 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }

        // Mostrar la matriz y la suma de cada fila
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
                sumaFila += matriz[i][j];
            }

            System.out.println(" | Suma fila " + i + ": " + sumaFila);
        }
    }
}