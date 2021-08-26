// Validando si es un número primo usando una función.

// A partir de un array unidimensional de 4 elementos, mostrarlo a partir de una función y hacer el incremento
// (la suma de sus elementos)

import java.util.Scanner;
public class Funcion_primo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int num;
        boolean resultado=false;
        System.out.println("Por favor ingrese un número:");
        num = s.nextInt();
        if (num < 0)
            {
                System.out.println("El número es negativo, por favor ingrese uno positivo.");
            }
        else
            {
                resultado = primo(num);
                if (resultado)
                    {
                        System.out.println("El número " +num +" SI es un número Primo");
                    }
                else { System.out.println("El número " +num +" NO es un número Primo"); }
            }
        s.close();       
    }

    public static boolean primo(int a)
    {
        boolean esprimo=false;
        for(int i=2; i<= a; i++)
            {
                if (a %2 != 0 && a %3 !=0)                        
                    {
                        esprimo = true;
                    }                        
            }
        return esprimo;     
    }
}
