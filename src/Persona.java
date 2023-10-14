public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private String sexo;
    private int peso;
    private int altura;
    private static String SEXO_POR_DEFECTO = "Masculino";

    // Constructor con todos los atributos como parámetros
    public Persona(String nombre, int edad, int dni, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Constructor que toma solo el nombre, la edad y el sexo como parámetros
    // Establece los valores predeterminados para los demás atributos
    public Persona(String nombre, int edad, String sexo)
    {
        this(nombre, edad, 0, sexo, 0, 0); // Llama al constructor con todos los atributos
    }

    // Constructor por defecto
    public Persona() 
    {
        this("", 0, 0, SEXO_POR_DEFECTO, 0, 0); // Llama al constructor con todos los atributos
    }

}
