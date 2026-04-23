import java.util.Scanner;
public class C3Nombre {

    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Marta", "Pedro", "Juan"};
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre");

        String nom=sc.nextLine();

        for (String n : nombres) {
            if (n.equals(nom)){
            System.out.println(" El nombre " + (n) + " esta en el arreglo ");
            }
        }
    }
}
