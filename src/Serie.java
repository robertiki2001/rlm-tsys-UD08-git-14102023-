
public class Serie {
	//Atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constantes
    private static final int NUMERO_TEMPORADAS_POR_DEFECTO = 3;
    private static final boolean ENTREGADO_POR_DEFECTO = false;
    
    //Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = NUMERO_TEMPORADAS_POR_DEFECTO;
		this.entregado = ENTREGADO_POR_DEFECTO;
		this.genero = "";
		this.creador = "";
	}
	//Constructor con titulo y creador por parametros los demas atributos por defecto.
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = NUMERO_TEMPORADAS_POR_DEFECTO;
		this.entregado = ENTREGADO_POR_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}
	//Constructor con todos los atributos por parametro excepto entregado.
	public Serie(String titulo,int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = ENTREGADO_POR_DEFECTO;
		this.genero = genero;
		this.creador = creador;
	}
    
    
	
	

}
