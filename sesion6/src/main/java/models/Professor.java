package models;

/**
 * @author mendo
 * @version 1.0
 * @created 05-sep.-2024 18:21:52
 */
public class Professor {

	private String apellidos;
	private String id;
	private String nombre;
	private String titulo;
	private Coorditation coordinacion;  // Cambiado de public a private para seguir el principio de encapsulamiento

	public Professor() {
		// Constructor podría inicializar valores predeterminados si es necesario
	}

	/**
	 * Obtiene la coordinación asociada a este profesor
	 *
	 * @return la instancia de Coorditation
	 */
	public Coorditation getCoordinacion() {
		return coordinacion;
	}

	/**
	 * Asigna una coordinación a este profesor
	 *
	 * @param coordinacion la instancia de Coorditation a asignar
	 */
	public void setCoordinacion(Coorditation coordinacion) {
		this.coordinacion = coordinacion;
	}

	// Getters y setters adicionales para los otros campos pueden ser útiles aquí

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
