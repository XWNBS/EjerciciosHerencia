package PaqueteLibro;

class Libro extends Publicacion {
	private int numPaginas;
	private int anioPublicacion;
	
	public Libro(String titulo, float precio, int numPaginas, int anioPublicacion) {
		super(titulo, precio);
		this.numPaginas = numPaginas;
		this.anioPublicacion = anioPublicacion;
	}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Numero de paginas: " +numPaginas);
		System.out.println("Año de publicación: " +anioPublicacion);
	}
}