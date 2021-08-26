// Generar un menu de calculo de areas, debe contener el cuadrado, el rectangulo y triangulo
import java.util.Scanner;
public class Opciones {
    public static void main (String[]args){
        System.out.println(" Seleccione una opcion del menu \n\s 1 - Cuadrado \n\s 1 - Rectangulo \n\s 1 - Trangulo ");
        Scanner s = new Scanner(System.in);
        double a=0, b=0;
        int opcion =s.nextInt();

        switch(opcion){
            case 1:
            System.out.println("Ingrese el valor del lado");
            a= s.nextDouble();
            System.out.println("El area del cuadrado es: " + a*a);
            break;

            case 2:
            System.out.println("Ingrese el valor de la base del rectangulo");
            a= s.nextDouble();
            System.out.println("Ingrese el valor de la base de la altura del rectangulo");
            b= s.nextDouble();
            System.out.println("El area del rectangulo es: " + a*b);
            break;

           
        } 
        s.close();    
    }    
}
