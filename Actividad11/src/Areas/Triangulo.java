package Areas;

public class Triangulo implements Shape {
    //variables encapsuladas
    private final double base,altura;
    //constructor
    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }
    //funcionalidades de la interface para el aea y perimetro
    @Override
    public String getArea() {
        return "El Area del Triangulo es: "+((base*altura)/2);
    }

    @Override
    public String getPerimetro() {
        return "El Perimetro del Triangulo es: "+((Math.sqrt((Math.pow(base/2,2)+Math.pow(altura,2)))*2)+base);
    }
}
