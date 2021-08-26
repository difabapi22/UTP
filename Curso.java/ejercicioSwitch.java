import java.util.Scanner;

/*
Hacer un programa que dado un dia laboral de la semana (lunes a viernes) y una hora (horas y minutos)
calcule cuantos minutos faltan para el fin de semana (comenzando viernes a las 18h)
*/

public class ejercicioSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int difDia = 0, difHoras = 0;

        System.out.print("Ingrese el dia de la semana: ");
        String dia = sc.nextLine();

        System.out.print("Ingrese la hora del dia: ");
        int hora = sc.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = sc.nextInt();

        switch(dia){
            case "Lunes": difDia = 4;break;
            case "Martes": difDia = 3;break;
            case "Miercoles": difDia = 2;break;
            case "Jueves": difDia = 1;break;
            case "Viernes": difDia = 0;break;
            default: System.out.println("El dia ingresado no se encuentra entre los dias laborales.");break;
        }

        if (hora >=0 && hora < 24){
            difHoras = 18 - hora;
        }
        else{
            System.out.println("Digite una hora correcta");
        }

        if (minutos < 0 || minutos > 60){
            System.out.println("Digite los minutos correctos");
        }
        int minutosRestantes = (difDia*24*60)+(difHoras*60)-minutos;

        System.out.println("Los minutos restantes para el fin de semana son "+minutosRestantes);

        sc.close();
    }
}
