import java.text.DecimalFormat;
public class operaciones {

    public String suma(float x,float y){
        x+=y;
        return ("El resultado de la Suma es "+Float.toString(x));
    }

    public String resta(float x,float y){
        x-=y;
        return ("El resultado de la Resta es "+Float.toString(x));
    }

    public String multiplicacion(float x,float y){
        x*=y;
        return String.format("El resultado de la Multiplicacion es "+"%.2f",x);
    }

    public String division(float x,float y){
        x/=y;
        //x = (float) (Math.round(x * 100) / 100d);
        return String.format("El resultado de la Division es "+"%.4f",x);
    }

    public String residuo(float x,float y){
        x%=y;
        return ("El resultado del Modulo es "+Float.toString(x));
    }

}
