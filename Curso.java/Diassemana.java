import java.util.Scanner;
// Dado un dia de la semana 
public class Diassemana {
    public static void mai(String[]args){
        Scanner s = new Scanner(System.in);
        String dia;
        int hora, minutos, dianumerico = 0;
        System.out.println("Ingrese un día de la semana de lunes a viernes");
        dia = s.nextLine();

        switch(dia){
            case "Lunes":
                dianumerico = 0;
            break;
            
            case "Martes":
                dianumerico = 1;
            break;

            case "Miercoles":
                dianumerico = 2;
            break;

            case "Jueves":
                dianumerico = 3;
            break;

            case "Viernes":
                dianumerico = 4;
            break;

            default:
                System.out.print("El día ingresado no se encuentra dentro del rango de días");
                
        }
        System.out.println("Ingrese la hora");
        hora = s.nextInt();
        System.out.println("Ingrese los minutos");
        minutos = s.nextInt();
        int aux =  0;
        int minutosdia = 1440;
        int minutosviernes = 1080;
        if (dianumerico == 0){
            aux = hora*60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 3)+minutosviernes;
            System.out.print("Los minutos que faltan para alcanzar el día viernes son");
        } else if (dianumerico == 1){
            aux = hora*60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 3)+minutosviernes;
            System.out.print("Los minutos que faltan para alcanzar el día viernes son");
        }
        else if (dianumerico == 2){
            aux = hora*60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 3)+minutosviernes;
            System.out.print("Los minutos que faltan para alcanzar el día viernes son");
        }
        else if (dianumerico == 3){
            aux = hora*60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 3)+minutosviernes;
            System.out.print("Los minutos que faltan para alcanzar el día viernes son");
        }
        else if (dianumerico == 4){
            aux = hora*60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 3)+minutosviernes;
            System.out.print("Los minutos que faltan para alcanzar el día viernes son");
        }
        s.close();
    }
}