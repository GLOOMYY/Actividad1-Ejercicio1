package entrega.pkg1;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r, area, longitud;
        System.out.println("Ingrese el radio: ");
        r = input.nextFloat();
        area = (float) (Math.pow(r,2)*3.14);
        longitud = (float) (2.0*3.14*r);
        System.out.println("El area es: "+area);
        System.out.println("La longitud es: "+longitud);
    }
}
