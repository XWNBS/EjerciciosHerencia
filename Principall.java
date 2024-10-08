package PaqueteCirculo;

public class Principal {
public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cilindro cilindro = new Cilindro(5, 10);
        CilindroHueco cilindroHueco = new CilindroHueco(5, 3, 10);

        System.out.println("Círculo - Área: " + circulo.getArea() + ", Circunferencia: " + circulo.getCircunferencia());
        System.out.println("Cilindro - Área: " + cilindro.getArea() + ", Volumen: " + cilindro.getVolumen());
        System.out.println("Cilindro Hueco - Área: " + cilindroHueco.getArea() + ", Volumen: " + cilindroHueco.getVolumen());
    }
}