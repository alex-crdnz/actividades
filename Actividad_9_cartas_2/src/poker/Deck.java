package poker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    //atributos de tipo lista para agregar las cartas
    ArrayList<Object> baraja = new ArrayList<>();
    ArrayList<Object> aux = new ArrayList<>();

    public Deck (){
        //declaracion de variables
        String p,c,v;
        //establece aleatoriamente el color de la baraja negro o rejo
        int d =(new Random().nextInt(2));
        if (d==1) c="Rojo";
        else c = "Negro";
        //ciclo for para agregar las 52 cartas
        for (int i=1;i <= 52;i++){
            //condicionales para cambiar los valores determinados por sus respectivas letras en la baraja
            if (i==1 || i==14||i==27||i==40)
                v="A";
            else if (i==11 || i==24||i==37||i==50)
                v="J";
            else if (i==12 || i==25||i==38||i==51)
                v="Q";
            else if (i==13 || i==26||i==39||i==52)
                v="K";
            //condicional que reasigna el valor para tener los valores en un rango del 2 al 10
            else {
                if (i<15)
                    v = Integer.toString(i);
                else if (i<28)
                    v = Integer.toString((i-13));
                else if (i<41)
                    v = Integer.toString((i-26));
                else
                    v = Integer.toString((i-39));
            }
            //condicionales para establecer el palo de la carta
            if (i<=13)
                p="Tréboles";
            else if(i <= 26)
                p="Corazones";
            else if (i <= 39)
                p = "Picas";
            else
                p = "Diamantes";
            //instancia a la clase Cards con los valores del constructor
            Cards carta = new Cards(p,c,v);
            //agrega la carta a los atributos de tipo ArrayList
            baraja.add("Palo: "+carta.Palo+", Color: "+carta.Color+", Valor: "+carta.Valor);
            aux.add("Palo: "+carta.Palo+", Color: "+carta.Color+", Valor: "+carta.Valor);
        }
    }
    //metodo para barajar el deck con las cartas actuales
    public String shuffle(){
        if (baraja.size()==0)
            return "Deck Vacio";
        else {
            Collections.shuffle(baraja);
            return "Se mezclo el deck";
        }
    }
    //Metodo para mostrar la carta del final y quitarla de la lista
    public String head(){
        if (baraja.size()==0)
            return "Quedan "+ 0 +" Cartas En Deck";
        else {

            String cadena = (String) baraja.get(baraja.size() - 1);
            baraja.remove(baraja.get(baraja.size() - 1));
            return cadena + "\nQuedan " + baraja.size() + " Cartas En Deck";
        }
    }
    //Metodo para mostrar una carta aleatoria y quitarla de la lista
    public String pick(){
        if (baraja.size()==0)
            return "Quedan "+ 0 +" Cartas En Deck";
        else {
            int random = (new Random().nextInt(baraja.size()));
            String cadena = (String) baraja.get(random);
            baraja.remove(random);
            return cadena + "\nQuedan " + baraja.size() + " Cartas En Deck";
        }
    }
    //Metodo para mostrar las 5 cartas del final y quitarlas de la lista
    public String hand(){
        StringBuilder cadena = new StringBuilder();
        int ciclo = Math.min(baraja.size(), 5);
        for (int cont = 0;cont<ciclo;cont++){
            cadena.append(baraja.get(baraja.size()-1)).append("\n");
            baraja.remove(baraja.size()-1);
        }
        return cadena+"Quedan "+baraja.size()+" Cartas En Deck";
    }

}