package entrega.pkg1;


public class Ejercicio12 {
        public static void main(String[] args) {
            float bruto = 48*5000;
            float retencion = (float) (bruto*0.125);
            float neto = bruto - retencion;
                    
            System.out.println("El salario bruto es: "+bruto);
            System.out.println("La retencion en la fuente es: "+retencion);
            System.out.println("El salario neto es: "+neto);
        }
}
