import java.util.Scanner;
public class boletos2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        
        int[][]a = new int [4][2];
        int cont = 0;
        int total = 0;

        for (cont =0; cont<4; cont++) {
            
            System.out.print(" Digite el precio del boleto  " +(cont + 1)+": ");
            a[cont][0]= s.nextInt();
            System.out.print(" Digite la cantidad de boletos  " +(cont + 1)+": ");
            a[cont][1]= s.nextInt();

            total = total + (a[cont][0] * a[cont][1]);
            s.close();
                        
        }

            for (int i=0; i<4; i++) {
            System.out.println("El subtotal del boleto " +(i+1) + "es :" +(a[i][0] * a[i][1]));
            }

            System.out.println("El precio total de la venta es :" +total);

    }
    }
