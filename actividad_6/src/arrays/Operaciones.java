package arrays;
public class Operaciones {
    //metodo para sacar el promedio a partir de un array
    public float promedio(float calf[]){
        return (calf[0]+calf[1]+calf[2]+calf[3]+calf[4])/calf.length;
    }
    //metodo para asignar la calificacion final a partir del promedio
    public char calfinal (float promedio){
        if (promedio<=50)
            return 'F';
        else if (promedio>50 & promedio<61)
            return 'E';
        else if (promedio>60 & promedio<71)
            return 'D';
        else if (promedio>70 & promedio<81)
            return 'C';
        else if (promedio>80 & promedio<91)
            return 'B';
        else
            return 'A';
    }
}
