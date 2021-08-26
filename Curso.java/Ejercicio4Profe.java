public class Ejercicio4Profe 
{
    public static String saludar(String nombre)
    {
    String saludo ="hola.Bienvenido" + nombre;
    return saludo;
}

public static String error(String nombre)
{
String error = "Disculpe.no pudimos validar tus datos."+  nombre + "es tu usuario ?";
return error;
}

public static void verificar(String usuario,String contraseña)
{
    String usuarioValido="JuanCGoCa";
    String contraseñaValida="Superjc";

    if(usuarioValido.equals(usuario)&& contraseñaValida.equals(contraseña))
    {
        System.out.println(saludar(usuario));
        return;
    }
    System.out.println(error(usuario)); 
}
public static void main(String[] args)
{
String usuario ="Juan";
String contraseña ="jc";

verificar(usuario,contraseña);
}
}