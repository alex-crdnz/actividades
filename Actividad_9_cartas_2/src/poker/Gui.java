package poker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    //Elementos graficos de la Aplicacion
    private JButton shuffle,head,hand,pick,reset;
    private TextArea result;
    //instancia a la clase Deck
    Deck deck = new Deck();
    public static void main(String[] args) throws Exception{
        //Se establece los valores predeterminador de la ventana
        Gui Frame = new Gui();
        Frame.setSize(500,350);
        Frame.setTitle("Actividad 8 Baraja");
        Frame.interfaz();
        Frame.setVisible(true);

    }
    public void interfaz(){
        //Se indica cuando se cierra la applicacion
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //establece un panel a la ventana
        Container window = getContentPane();
        //establece el acomodo o layout de la ventana
        window.setLayout(new FlowLayout());
        //Establece los valores para los elementos graficos
        JLabel titulo = new JLabel("Que Accion Desea Realizar ?");
        JLabel formato = new JLabel("");
        result = new TextArea();
        shuffle = new JButton("Shuffle");
        head = new JButton("Head");
        pick = new JButton("Pick");
        hand = new JButton("Hand");
        reset = new JButton("Reset");
        //Establece la accion al presionar los botones
        shuffle.addActionListener(this);
        head.addActionListener(this);
        pick.addActionListener(this);
        hand.addActionListener(this);
        reset.addActionListener(this);
        //agrega los elementos graficos al panel
        window.add(titulo);
        window.add(formato);
        window.add(shuffle);
        window.add(head);
        window.add(pick);
        window.add(hand);
        window.add(reset);
        window.add(result);
        //Establece un tamaño a los elementos graficos indicados
        formato.setPreferredSize(new Dimension(400,0));
        shuffle.setPreferredSize(new Dimension(200,25));
        head.setPreferredSize(new Dimension(200,25));
        pick.setPreferredSize(new Dimension(200,25));
        hand.setPreferredSize(new Dimension(200,25));
        reset.setPreferredSize(new Dimension(400,25));
    }
    //Metodo que establece la accion de los botones
    @Override
    public void actionPerformed(ActionEvent event) {
        //accion al presionar el boton shuffle
        if (event.getSource().equals(shuffle))
            result.setText(deck.shuffle());
        //accion al presionar el boton head
        else if (event.getSource().equals(head))
            result.setText(deck.head());
        //accion al presionar el boton pick
        else if (event.getSource().equals(pick))
            result.setText(deck.pick());
        //accion al presionar el boton hand
        else if (event.getSource().equals(hand))
            result.setText(deck.hand());
        //accion al presionar el boton reset
        else {
            //restablece la baraja a su acomodo inicial
            Deck restablecer = new Deck();
            deck.baraja= restablecer.aux;
            result.setText("Quedan "+(deck.baraja.size())+" Cartas En Deck");
        }
        //Metodo de exepcion para cuando ya no ahi cartas en el deck
        if (deck.baraja.size()==0) {
            try {
                JOptionPane.showMessageDialog(null, "Se han agotado las cartas");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        }
    }
}