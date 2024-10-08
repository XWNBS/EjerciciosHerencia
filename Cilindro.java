package PaqueteCirculo;

public class Cilindro extends Circulo {
    protected double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadio() * (getRadio() + altura);
    }

    public double getVolumen() {
        return Math.PI * getRadio() * getRadio() * altura;
    }
}