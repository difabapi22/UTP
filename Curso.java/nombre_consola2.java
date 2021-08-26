import java.util.Scanner;
public class nombre_consola2 {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);        
        int edad;
        String cadena;
        System.out.println("Ingrese un nombre: ");
        cadena = s.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = s.nextInt();
        System.out.println("El nombre es: " +cadena +" y la edad es: " +edad);
        s.close();
    }      
}