public class Exportacion {
    
    public static double calcularInteresCompuesto(int pTiempo,double pCapital,double pInteres){

        return pCapital*(Math.pow((1+pInteres), pTiempo)-1);       

    }

    public static double calcularInteresSimple(int pTiempo,double pCapital,double pInteres){
        return pCapital*pInteres*pTiempo;
    }

    public static String compararExportacion(int pTiempo,double pCapital,double pInteres){
        double resultado = calcularInteresCompuesto(pTiempo, pCapital, pInteres)-calcularInteresSimple(pTiempo, pCapital, pInteres);

        if(resultado!=0){
            System.out.println("La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $"+resultado);
        }
        else{
            System.out.println("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");
        }

        return "";
    }
}