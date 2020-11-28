package sort;

import java.util.Comparator;
import java.util.List;

public class MetodoReferencia {
    private List<String> lista;

    //constructor que inicializa una lista
    public MetodoReferencia(List<String> lista) {
        this.lista = lista;
    }
    //metodo de metodo de referencia que ordena alfabeticamente
    public List<String> Alfabeticamente(){
        Comparator<String> comparatorAlfa = String::compareTo;
        lista.sort(comparatorAlfa);
        return lista;
    }

    //metodo de metodo de referencia que ordena por longitud
    public List<String> longitud(){
        Comparator<String> comparatorLongitud = Comparator.comparingInt(String::length);
        lista.sort(comparatorLongitud);
        return lista;
    }
}
