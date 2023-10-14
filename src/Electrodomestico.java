
public class Electrodomestico {
    // Atributos
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    // Constantes
    private static final double PRECIO_BASE_POR_DEFECTO = 100.0;
    private static final String COLOR_POR_DEFECTO = "blanco";
    private static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
    private static final double PESO_POR_DEFECTO = 5.0;
    private static final String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

    // Constructor por defecto
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE_POR_DEFECTO;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        this.peso = PESO_POR_DEFECTO;
    }
    // Constructor con el precio y peso por parametro, el resto por defecto.
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = COLOR_POR_DEFECTO;
        this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
        this.peso = peso;
    }
    // Constructor con todos los atributos por parametro.
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = validarColor(color);
        this.consumoEnergetico = validarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     * Valida si el color proporcionado al constructor de Electrodomestico es uno de los colores válidos, sino establece el color por defecto.
     */
    private String validarColor(String color) {
        for (String col : COLORES_DISPONIBLES) {
            if (col.equalsIgnoreCase(color)) {
                return col;
            }
        }
        return COLOR_POR_DEFECTO;
    }
    
    /**
     *Verifica si consumoEnergetico está dentro del rango válido, es decir, si es una letra entre 'A' y 'F'.
     */
    private char validarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            return consumoEnergetico;
        }
        return CONSUMO_ENERGETICO_POR_DEFECTO;
    }

}
