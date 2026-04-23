import java.util.Scanner;

public class C5MatrizDiagonal {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);

        // Ingreso de la matriz
        System.out.println("Ingrese los valores de la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar la diagonal principal
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        sc.close();
    }
}