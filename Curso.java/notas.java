import java.util.Scanner;
public class notas {
    public static void main (String []args){
        Scanner s = new Scanner (System.in);
        String nombre; int edad;

        System.out.println("Ingrese su nombre: ");
        nombre =s.nextLine();
        System.out.println("Ingrese su edad ");
        edad = s.nextInt();
        System.out.println("Su nombre es:" +nombre + " Su edad es: " + edad + "años");
        s.close();
    }
}

