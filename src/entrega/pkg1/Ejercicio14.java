package entrega.pkg1;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        System.out.println("Ingrese numero: ");
        x = input.nextDouble();
        System.out.println("Cuadrado: " + Math.pow(x,2));
        System.out.println("Cubo: " + Math.pow(x,3));
    }
}
