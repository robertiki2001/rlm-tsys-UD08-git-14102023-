import java.util.Random;

public class Password 
{
    private int longitud;
    private String contraseña;

    public Password() 
    {
        this.longitud = 8;
        generarContraseña();
    }

    public Password(int longitud) 
    {
        this.longitud = longitud;
        generarContraseña();
    }

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
