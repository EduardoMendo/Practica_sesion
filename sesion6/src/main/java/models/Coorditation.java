package models;

/**
 * @author mendo
 * @version 1.0
 * @created 05-sep.-2024 18:21:49
 */
public class Coorditation {

	private int codigo;
	private String nombre;  // Cambié el tipo de 'int' a 'String' para el nombre

	public Coorditation(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// Métodos adicionales como getters y setters pueden ser útiles aquí
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
