import java.util.Random;

public class Password 
{
	//Atributos
    private int longitud;
    private String contraseña;
    
    //Constructor por defecto
    public Password() 
    {
        this.longitud = 8;
        generarContraseña();
    }
    
   //Constructor para generar una contraseña aleatorio de con la longitud que nosotros queramos
    public Password(int longitud) 
    {
        this.longitud = longitud;
        generarContraseña();
    }
    //Genera una contraseña con valores alfanumericos aleatorios
    private void generarContraseña() 
    {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < longitud; i++) 
        {
            int index = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(index);
            builder.append(caracter);
        }

        contraseña = builder.toString();
    }

    public String getContraseña() 
    {
        return contraseña;
    }

    public int getLongitud()
    {
        return longitud;
    }

    public static void main(String[] args)
    {
        Password contraseñaPredeterminada = new Password();
        System.out.println("Contraseña predeterminada: " + contraseñaPredeterminada.getContraseña());

        Password contraseñaPersonalizada = new Password(12); 
        System.out.println("Contraseña personalizada: " + contraseñaPersonalizada.getContraseña());
    }
}
