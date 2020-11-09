package Areas;

public class Cuadrado implements Shape{
    //variable encapsulada
    private final double lado;
    //constructor
    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    //funcionalidades de la interface para el aea y perimetro
    @Override
    public String getArea() {
        return "El Area del Cuadrado es: "+(Math.pow(lado,2));
    }

    @Override
    public String getPerimetro() {
        return "El Perimetro del Cuadrado es: "+(lado*4);
    }
}
