package PaqueteLibro;

class Disco extends Publicacion {
	private float duracionMinutos;
	
	public Disco(String titulo, float precio, float duracionMinutos) {
		super(titulo, precio);
			this.duracionMinutos = duracionMinutos;
		}
	
	@Override
	public void mostrar() {
		super.mostrar();
		System.out.println("Duración en minutos: " + duracionMinutos);
	}
}
