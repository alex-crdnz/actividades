package sort;

import java.util.Comparator;
import java.util.List;

public class ClaseAnonima {

    private List<String> lista;

    //constructor que inicializa una lista
    public ClaseAnonima(List<String> lista) {
        this.lista = lista;
    }

    //metodo de clase anonima que ordena alfabeticamente
    public List<String> Alfabeticamente(){
        Comparator<String> comparatorAlfa = new Comparator<String>() {
            @Override
            public int compare(String v1, String v2) {
                return v1.compareTo(v2);
            }
        };
        lista.sort(comparatorAlfa);
        return lista;
    }

    //metodo de clase anonima que ordena por longitud
    public List<String> longitud(){
        Comparator<String> comparatorLongitud = new Comparator<String>() {

            @Override
            public int compare(String v1, String v2) {
                return Integer.compare(v1.length(), v2.length());
            }
        };
        lista.sort(comparatorLongitud);
        return lista;
    }
}
