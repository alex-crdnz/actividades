import java.text.DecimalFormat;
public class operaciones {
    //Realiza la suma y la devuelve como string
    public String suma(float x,float y){
        x+=y;
        return ("El resultado de la Suma es "+Float.toString(x));
    }
    //Realiza la resta y la devuelve como string
    public String resta(float x,float y){
        x-=y;
        return ("El resultado de la Resta es "+Float.toString(x));
    }
    //Realiza la multiplicacion y la devuelve como string con 2 decimales
    public String multiplicacion(float x,float y){
        x*=y;
        return String.format("El resultado de la Multiplicacion es "+"%.2f",x);
    }
    //Realiza la division y la devuelve como string con 4 decimales
    public String division(float x,float y){
        x/=y;
        return String.format("El resultado de la Division es "+"%.4f",x);
    }
    //Realiza el modulo y la devuelve como string
    public String residuo(float x,float y){
        x%=y;
        return ("El resultado del Modulo es "+Float.toString(x));
    }

}
