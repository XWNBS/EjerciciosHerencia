package PaqueteNombre;

import java.util.Scanner;

class Nombre {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected Scanner scanner;

    public Nombre() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.scanner = new Scanner(System.in);
    }

    public void leer_nombre() {
        System.out.print("Introduce el nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Introduce el primer apellido: ");
        this.primerApellido = scanner.nextLine();
        System.out.print("Introduce el segundo apellido: ");
        this.segundoApellido = scanner.nextLine();
    }

    public void mostrar() {
        System.out.println(nombre + " " + primerApellido + " " + segundoApellido);
    }
}