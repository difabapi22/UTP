// Programa dado un día de la semana de lunes a viernes y una hora con minutos, nos calcule cuántos minutos faltan para el fin de semana.
// A las 18:00 horas del viernes finaliza el fin de semana
import java.util.Scanner;
public class Diassemanaenclase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dia;
        int hora, minutos, dianumerico=0;
        System.out.println("Ingrese un día de la semana del rango lunes a viernes: ");
        dia = s.nextLine();        
        switch(dia)
            {
                case "lunes":
                    dianumerico = 0;                    
                break;
                
                case "martes":
                    dianumerico = 1;
                break;

                case "miercoles":
                    dianumerico = 2;
                break;

                case "jueves":
                    dianumerico = 3;
                break;

                case "viernes":
                    dianumerico = 4;
                break;

                default:
                    System.out.println("El día introducido no está en el rango de lunes-viernes");
            }
        System.out.println("Ingrese la hora del día: ");
        hora = s.nextInt();
        System.out.println("Ingrese los minutos del día: ");
        minutos = s.nextInt();
        int aux = 0;
        int minutosdia = 1440;
        int minutosviernes = 1080;        
        if (dianumerico == 0)
        {
            aux = hora * 60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 3) + minutosviernes;
            System.out.println("Los minutos que faltan para alcanzar el fin de semana viernes son: " +minutos);
        }
        else if (dianumerico == 1)
        {
            aux = hora * 60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + (minutosdia * 2) + minutosviernes;
            System.out.println("Los minutos que faltan para alcanzar el fin de semana viernes son: " +minutos);
        }
        else if (dianumerico == 2)
        {
            aux = hora * 60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + minutosdia + minutosviernes;
            System.out.println("Los minutos que faltan para alcanzar el fin de semana viernes son: " +minutos);
        }
        else if (dianumerico == 3)
        {
            aux = hora * 60;
            minutos = aux + minutos;
            minutos = minutosdia - minutos;
            minutos = minutos + minutosviernes;
            System.out.println("Los minutos que faltan para alcanzar el fin de semana viernes son: " +minutos);
        }
        else if (dianumerico == 4)
        {
            aux = hora * 60;
            minutos = aux + minutos;
            minutos = minutosviernes - minutos;            
            System.out.println("Los minutos que faltan para alcanzar el fin de semana viernes son: " +minutos);
        }
        s.close();
    }
}
