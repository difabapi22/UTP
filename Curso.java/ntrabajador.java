import java.util.Scanner;

/*A partir del sueldo de un trabajador apliquemos el 20% si su sueldo es <5000 y el 12 el caso contrario
imprimir el nuevo sueldo
*/

public class ntrabajador {
    public static void main(String []args){
        double nuevosueldo;
        System.out.print("Ingrese el nombre: ");
        Scanner sc = new Scanner(System.in);
        var nombre = sc.next();

        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = sc.nextDouble();
        if (sueldo >= 5000 ){
            nuevosueldo = sueldo * 1.05;
        }
        else {
            nuevosueldo = sueldo*1.12;
        }
        System.out.print ("El nuevo sueldo del trabajador "+nombre + "es: " +nuevosueldo );
        sc.close();
    }
}
