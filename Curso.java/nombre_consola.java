import java.util.Scanner;

public class nombre_consola{
public static void main(String[] args){
        Scanner s = new Scanner(System.in);
                System.out.println("Ingrese su nombre: ");
                String myString1 = s.nextLine();
                System.out.println("Ingrese su apellido: ");
                String myString2 = s.nextLine();
                System.out.println("Su nombre completo es: " + myString1 +" " +myString2);
        s.close();
        }
}