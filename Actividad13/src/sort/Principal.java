package sort;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        //instancias de clase
        Metodos metodos = new Metodos();
        //lista creada a partir de un metodo
        List<String> list = metodos.agregarDatos();
        //instancias de clase
        ClaseAnonima claseAnonima = new ClaseAnonima(list);
        Lamda lamda = new Lamda(list);
        MetodoReferencia metodoReferencia = new MetodoReferencia(list);
        //imprime las lista a partir de clases en las instancias
        System.out.println("Lista actual\n"+list);
        System.out.println("Lista Ordenada Alfabeticamente Por Clases Anonimas \n" + claseAnonima.Alfabeticamente() );
        System.out.println("Lista Ordenada Por Longitud Por Clases Anonimas \n" + claseAnonima.longitud()+ "\n\n");
        System.out.println("Lista actual\n"+list);
        System.out.println("Lista Ordenada Alfabeticamente Por Lamda \n" + lamda.Alfabeticamente() );
        System.out.println("Lista Ordenada Por Longitud Por Lamda \n" + lamda.longitud()+ "\n\n");
        System.out.println("Lista actual\n"+list);
        System.out.println("Lista Ordenada Alfabeticamente Por Metodos De Referencia \n" + metodoReferencia.Alfabeticamente() );
        System.out.println("Lista Ordenada Por Longitud Por Metodos De Referencia \n" + metodoReferencia.longitud());
    }

}

