public class C1ParesArr {

    public static void main(String[] args) {

        int[] numeros = {10, 4, 5, 7, 3, 5, 7, 9, 4, 2, 5, 7, -56};

        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}

