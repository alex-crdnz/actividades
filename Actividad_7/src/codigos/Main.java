package codigos;
//librerias
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
Nombre: Andres Cardenas
Materia: Computacion en Java
fecha: 04/10/2020
 */
public class Main extends JFrame implements ActionListener {
    //variables de los elementos graficos
    private JTextField Iterar;
    private TextArea result;
    private JButton Bprimos,Bfibonacci,reset;

    public static void main(String[] args) {
        //declara el tamaño y titulo de la ventana por medio de la recursividad
        Main frame = new Main();
        frame.setSize(500,350);
        frame.setTitle("Actividad 7");
        //llama al metodo de interfaz
        frame.interfaz();
        //hace visible los elementos dentro de la ventana
        frame.setVisible(true);

    }
    //metodo que establece y define los elementos graficos
    private void interfaz() {
        //establece cuando cerrar la app
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //establece un panel y el tipo de panel
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        //Establece los elementos graficos y sus asignaciones
        JLabel titulo = new JLabel("Cuantos Numeros deseaa calcular ? ");
        result = new TextArea("");
        Iterar = new JTextField(30);
        Bprimos = new JButton("Sucesion de numeros Primos");
        Bfibonacci = new JButton("Sucesion de Fibonacci");
        reset = new JButton("Reset");
        //añade a los botones la accion al ser presionadas
        Bprimos.addActionListener(this);
        Bfibonacci.addActionListener(this);
        reset.addActionListener(this);
        //añade los elementos al panel
        window.add(titulo);
        window.add(Iterar);
        window.add(Bprimos);
        window.add(Bfibonacci);
        window.add(reset);
        window.add(result);
        //establece la dimension de los botones
        Bprimos.setPreferredSize(new Dimension(230,25));
        Bfibonacci.setPreferredSize(new Dimension(230,25));
        reset.setPreferredSize(new Dimension(230,25));
    }
    //metodo que establece la accion que se tienen que tomar con cada boton o con los botones en general
    @Override
    public void actionPerformed(ActionEvent event) {
        funciones op = new funciones();
        int atributo = Integer.parseInt(Iterar.getText());
        if (event.getSource().equals(Bprimos)){
            result.setText(op.primos(atributo));
        }
        else if (event.getSource().equals(Bfibonacci)){
            result.setText(op.fibonacci(atributo));
        }
        else if (event.getSource().equals(reset))
            result.setText("");
    }
}