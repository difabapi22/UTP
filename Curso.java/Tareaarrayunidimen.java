import java.util.Scanner;
/* 
A partir de un array unidimensional de 4 elementos, mostrarlo a partir de una
una funcion y el incremento (La suma de los elementos)
*/
public class Tareaarrayunidimen {
    public static void main(String[]args) {  
        double suma = 0;
        double[] notas;
        notas = new double[4]; 
        Scanner s = new Scanner(System.in);
        
        for(int i=0; i<=3; i++){
            System.out.println("Ingresa las notas del ciclo por favor" +i);
            notas[i] = s.nextDouble();
            suma += notas[i]; 
        }
        
        double promedio = 0;
            for(int i=0; i<=3; i++){
            System.out.println("En la posición" +(i + 1) + "se guardo :" +notas [i] +"y la suma es" + suma);                  
        } 
        
        /*
        notas[0] = 4.3;
        notas[1] = 3.3;
        notas[2] = 4.0;
        notas[3] = 2.3;
        
        if (promnotas >= 3.0)
        {
            System.out.println("Aprobo el curso, su nota final es " + );
        }
        else{System.out.println("Reprobo el curso, debe matricularse nuevamente")}
        
    }
        
    public static double calcularPromedionotas (int[]a)
    {
        double promnotas = 0.0;
    }  
       */
}


