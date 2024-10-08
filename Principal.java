package PaqueteNombre;

public class Principal {

	public static void main(String[] args) {
		Direccion direccion = new Direccion();
		System.out.println("Introduciendo un nuevo nombre");
		direccion.nuevo_nombre();
		System.out.println("Introduciendo un nueva direccion");
		direccion.nueva_direccion();
		System.out.println("Introduciendo informacion completa");
		direccion.mostrar();
	}

}
