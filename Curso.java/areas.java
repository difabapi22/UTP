import java.util.Scanner;

/*
Generar un menu de calculo de areas, debe contener el cuadrado, rectangulo y triangulo
*/

public class areas{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double lado=0, ancho=0, largo=0, base=0, altura=0;
        System.out.print("Escoja una opcion del menu\n\s1 - Cuadrado\n\s2 - Rectangulo\n\s3 - Triangulo\n\s>>> ");
        int opcion = sc.nextInt();

        switch(opcion){
            case 1:
            System.out.print("Ingrese un lado (cm): ");
            lado = sc.nextDouble();
            System.out.println("El area del cuadrado es: "+(lado*lado)+"cm²");break;

            case 2:
            System.out.print("Ingrese el largo (cm): ");
            largo = sc.nextDouble();
            System.out.print("Ingrese el ancho (cm): ");
            ancho = sc.nextDouble();
            System.out.println("El area del rectangulo es: "+(largo*ancho)+"cm²");break;

            case 3:
            System.out.print("Ingrese la altura (cm): ");
            altura = sc.nextDouble();
            System.out.print("Ingrese la base (cm): ");
            base = sc.nextDouble();
            System.out.println("El area del traingulo es: "+(base*altura/2)+"cm²");break;

            default: System.out.println("La opcion seleccionada es incorrecta.");break;
        }
        sc.close();
    }
}
