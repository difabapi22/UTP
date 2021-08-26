import java.util.Scanner;

public class Numeroprimos {
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            int num;
            System.out.println("ingresar un numero");
            num= s.nextInt();
            if(num==2 || num==3){
                System.out.println("el numero es primo");
            }
            else {
                if (num%2!=0 && num%3!=0){
                    System.out.println("el numero es primo");
                }
                else{
                    System.out.println("el numero no es primo");
                }
                s.close();
            }
        }
    }
    

