package PaqueteLibro;

public class Principal {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de páginas: ");
        int numPaginas = scanner.nextInt();
        System.out.print("Año de publicación: ");
        int anioPublicacion = scanner.nextInt();

        Libro libro = new Libro(tituloLibro, precioLibro, numPaginas, anioPublicacion);

        scanner.nextLine();

        System.out.println("\nIngrese los datos del disco:");
        System.out.print("Título: ");
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: ");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración en minutos: ");
        float duracionMinutos = scanner.nextFloat();

        Disco disco = new Disco(tituloDisco, precioDisco, duracionMinutos);

        System.out.println("\nDatos del libro:");
        libro.mostrar();

        System.out.println("\nDatos del disco:");
        disco.mostrar();

        scanner.close();
    }
}