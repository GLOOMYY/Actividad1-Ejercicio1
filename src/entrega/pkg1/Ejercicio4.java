
package entrega.pkg1;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        double edadMamaDeJuan,edadJuan,edadAlberto,edadAna;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan: ");
        edadJuan = input.nextDouble();

        edadAlberto = (2.0f/3.0f)*edadJuan;
        edadAna = edadJuan * (4.0f/3.0f);
        edadMamaDeJuan = edadJuan + edadAlberto + edadAna;

        System.out.println("La edad de Alberto es:" + edadAlberto);
        System.out.println("La edad de Juan es: " + edadJuan);
        System.out.println("La edad de Ana es: " + edadAna);
        System.out.println("La edad de la mama de Juan es: " + edadMamaDeJuan);
    }
    
}