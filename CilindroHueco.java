package PaqueteCirculo;

public class CilindroHueco extends Cilindro {
    private double radioInterno;

    public CilindroHueco(double radioExterno, double radioInterno, double altura) {
        super(radioExterno, altura);
        this.radioInterno = radioInterno;
    }

    @Override
    public double getArea() {
        return super.getArea() + 2 * Math.PI * radioInterno * altura;
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() - Math.PI * radioInterno * radioInterno * altura;
    }

    public double getAreaInterna() {
        return 2 * Math.PI * radioInterno * (radioInterno + altura);
    }
}