package sort;

import java.util.List;

public class Lamda {

    private List<String> lista;

    //constructor que inicializa una lista
    public Lamda(List<String> lista) {
        this.lista = lista;
    }

    //metodo de Lamda que ordena alfabeticamente
    public List<String> Alfabeticamente(){
        lista.sort((v1, v2) -> v1.compareTo(v2));
        return lista;
    }

    //metodo de Lamda que ordena por longitud
    public List<String> longitud(){
        lista.sort((v1, v2) -> Integer.compare(v1.length(), v2.length()));
        return lista;
    }
}
