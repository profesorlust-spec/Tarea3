public class C2Intrcmb {

    public static void main(String[] args) {

        int[] vec1  = {2, 6, 4, 5, 8, 9, 6, 4};
        int[] vec11 = {2, 2, 4, 10, 8, 7, 6, 6};

        int[] vec2  = {10, 2, 5, 10, 4, 7, 5, 6};
        int[] vec22 = {10, 2, 5, 10, 4, 7, 5, 6};

        int aux;

        // Intercambio entre vec1 y vec11 (si vec1 es par)
        for (int i = 0; i < vec1.length; i++) {
            if (vec1[i] % 2 == 0) {
                aux = vec1[i];
                vec1[i] = vec11[i];
                vec11[i] = aux;
            }
        }

        // Intercambio entre vec2 y vec22 (si vec2 es par)
        for (int i = 0; i < vec2.length; i++) {
            if (vec2[i] % 2 == 0) {
                aux = vec2[i];
                vec2[i] = vec22[i];
                vec22[i] = aux;
            }
        }

        // Mostrar resultados
        System.out.println("vec1:");
        mostrar(vec1);

        System.out.println("vec11:");
        mostrar(vec11);

        System.out.println("vec2:");
        mostrar(vec2);

        System.out.println("vec22:");
        mostrar(vec22);
    }

    static void mostrar(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}