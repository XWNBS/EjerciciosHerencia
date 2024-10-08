package PaqueteCirculo;

public class Circulo {
    private double radio;  

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {  
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }
}