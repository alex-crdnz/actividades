package codigos;

public class funciones {

    //metodo para sacar n cantidad de numeros primos devuelva la cadena de los numeros concatenada
    public String primos(int serie) {
<<<<<<< HEAD
        long [] num_primos = new long [serie];
=======
        int [] num_primos = new int[serie];
>>>>>>> master
        int primo,cant_primos=0;
        for (int x = 1;cant_primos!=serie;x++){
            primo=0;
            for (int cont = 1; cont <=x; cont++) {
                if(x%cont == 0)
                    primo++;
            }
            if(primo ==2) {
                num_primos[cant_primos] = x;
                cant_primos++;
            }
        }
        return resultado(num_primos);
    }
    //metodo para sacar la secuencia de n cantidad de fibonacci devuelva la cadena de los numeros concatenada
    public String fibonacci(int x){
<<<<<<< HEAD
        long [] sucesion_fibunacci = new long[x];
=======
        int [] sucesion_fibunacci = new int[x];
>>>>>>> master
        if (x > 0)
            sucesion_fibunacci[0]=0;
        if (x > 1)
            sucesion_fibunacci[1]=1;
        if (x > 2){
            for (int pos = 2;pos<x;pos++)
                sucesion_fibunacci[pos]=sucesion_fibunacci[pos-1]+sucesion_fibunacci[pos-2];
        }
        return resultado(sucesion_fibunacci);
    }
    //metodo que concatena el arreglo llenado por los metodos anteriores separandolos con , y saltos de linea cada 15 iteraciones
<<<<<<< HEAD
    public String resultado(long [] serie) {
        StringBuilder cadena = new StringBuilder();
        int salto = 0;
        for (long cont : serie) {
=======
    public String resultado(int [] serie) {
        StringBuilder cadena = new StringBuilder();
        int salto = 0;
        for (int cont : serie) {
>>>>>>> master
            cadena.append(cont).append(", ");
            salto++;
            if (salto == 15) {
                cadena.append("\n");
                salto = 0;
            }
        }
        return cadena.toString();
    }
}