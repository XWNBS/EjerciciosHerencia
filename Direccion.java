package PaqueteNombre;

class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    public Direccion() {
        super();
        this.calle = "";
        this.ciudad = "";
        this.provincia = "";
        this.codigoPostal = "";
    }

    public void nueva_direccion() {
        System.out.print("Introduce la calle: ");
        this.calle = scanner.nextLine();
        System.out.print("Introduce la ciudad: ");
        this.ciudad = scanner.nextLine();
        System.out.print("Introduce la provincia: ");
        this.provincia = scanner.nextLine();
        System.out.print("Introduce el código postal: ");
        this.codigoPostal = scanner.nextLine();
    }

    public void nuevo_nombre() {
        leer_nombre();  
    }
    
    @Override
    public void mostrar() {
    	super.mostrar();
    	System.out.println("Calle: " +calle);
    	System.out.println("Ciudad: " +ciudad);
    	System.out.println("Provincia: " +provincia);
    	System.out.println("Codigo Postal: " +codigoPostal);
    }
}