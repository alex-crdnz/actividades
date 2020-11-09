package Areas;

public class Circulo implements Shape{
    //variable encapsulada
    private final double radio;
    //constructor
    public Circulo(Double radio) {
        this.radio = radio;
    }

    //funcionalidades de la interface para el aea y perimetro
    @Override
    public String getArea() {
        return "El Area del Circulo es: "+(3.1416*(Math.pow(radio,2)));
    }

    @Override
    public String getPerimetro() {
        return "El Perimetro del Circulo es: "+(2*(3.1416*radio));
    }
}
