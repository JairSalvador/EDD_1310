package ico.fes;
import java.io.IOException;
import java.util.Scanner;

public class BalanceoMain {

    public static void main(String[] args) throws IOException {
        int texto;
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que texto quiere leer? ");
        System.out.println("Inserte 1 para comprobar el balanceo del texto1.txt");
        System.out.println("Inserte 2 para comprobar el balanceo del texto2.txt");

        texto = teclado.nextInt();
        switch (texto) {
            case 1 -> {
                System.out.println("EL TEXTO ES:");
                nombre = "texto1.txt";
                Balanceo p = new Balanceo(nombre);
                System.out.println(p.balanceo());
            }
            case 2 -> {
                System.out.println("EL TEXTO ES:");
                nombre = "texto2.txt";
                Balanceo p = new Balanceo(nombre);
                System.out.println(p.balanceo());
            }

            default ->
                throw new AssertionError();
        }

    }
}
