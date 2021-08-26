public class lecturadatos {
    public static void main (String [] args){
        String linea;

        System.out.print("Ingrese un numero");
        linea = System.console().readLine();
        int var1;
        var1 = Integer.parseInt(linea);

        System.out.print("Ingrese otro numero");
        linea = System.console().readLine();
        int var2;
        var2 = Integer.parseInt(linea);

        int total;
        total = (2 * var1 )+var2;

        System.out.print ("El primer numero es:"+ var1);
        System.out.print ("El segundo numero es:"+ var1);
        System.out.print ("El deble primer numero es:"+ total);
    }
}
