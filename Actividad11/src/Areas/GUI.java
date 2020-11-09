package Areas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener{
    //Elementos Graficos
    private JButton circulo, triangulo, cuadrado;
    private JTextField valor1,valor2;
    public JLabel area,perimetro;
    public static void main(String[] args) {
        //Se establece los valores predeterminador de la ventana
        GUI Frame = new GUI();
        Frame.setSize(500,240);
        Frame.setResizable(false);
        Frame.setTitle("Area y Perimetro");
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
        JLabel text = new JLabel("Ingrese los valores de la figura que desea sacar el area y perimetro");
        JLabel nota = new JLabel("Nota: En caso del circulo se tomara en cuenta el radio del primer campo");
        JLabel nota2 = new JLabel("Nota: En caso del triangulo ingrese base y altura en ese orden");
        JLabel nota3 = new JLabel("Nota: En caso del cuadrado se tomara en cuenta el lado del primer campo");
        JLabel aux = new JLabel("");
        JLabel aux2 = new JLabel("");
        area = new JLabel("");
        perimetro = new JLabel("");
        valor1 = new JTextField(20);
        valor2 = new JTextField(20);
        circulo = new JButton("Circulo");
        triangulo = new JButton("Triangulo");
        cuadrado = new JButton("Cuadrado");
        circulo.addActionListener(this);
        triangulo.addActionListener(this);
        cuadrado.addActionListener(this);
        //agrega los elementos al panel
        window.add(text);
        window.add(valor1);
        window.add(valor2);
        window.add(circulo);
        window.add(triangulo);
        window.add(cuadrado);
        window.add(nota);
        window.add(nota2);
        window.add(nota3);
        window.add(aux);
        window.add(area);
        window.add(aux2);
        window.add(perimetro);
        //Establece un tamaño a los elementos graficos indicados
        circulo.setPreferredSize(new Dimension(150,20));
        triangulo.setPreferredSize(new Dimension(150,20));
        cuadrado.setPreferredSize(new Dimension(150,20));
        aux.setPreferredSize(new Dimension(500,0));
        aux2.setPreferredSize(new Dimension(500,0));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //variables
        boolean empy1,empy2;
        double v1 = 0, v2 = 0;
        //Exception para verificar si el campo no esta vacio
        try {
            empy1 = false;
            v1 = Double.parseDouble(valor1.getText());
        }catch (NumberFormatException ignored){
            empy1 = true;
        }
        //Exception para verificar si el campo no esta vacio
        try {
            empy2 = false;
            v2 = Double.parseDouble(valor2.getText());
        }catch (NumberFormatException ignored){
            empy2 = true;
        }
        //accion al presionar el boton circulo
        if (e.getSource().equals(circulo)){
            //Obtiene el area y el perimetro del circulo si mo esta vacio el campo
            //caso contrario lanza la leyenda cprrespondiente
            if (!empy1){
                Circulo circulo = new Circulo(v1);
                area.setText(circulo.getArea());
                perimetro.setText(circulo.getPerimetro());
            }
            else{
                area.setText("");
                perimetro.setText("Favor de lenar los campos correctamente");
            }
        }
        //accion al presionar el boton triangulo
        else if (e.getSource().equals(triangulo)){
            //Obtiene el area y el perimetro del triangulo si mo esta vacio el campo
            //caso contrario lanza la leyenda cprrespondiente
            if (!empy1 && !empy2){
                Triangulo triangulo = new Triangulo(v1,v2);
                area.setText(triangulo.getArea());
                perimetro.setText(triangulo.getPerimetro());
            }
            else{
                area.setText("");
                perimetro.setText("Favor de lenar los campos correctamente");
            }
        }
        //accion al presionar el boton cuadrado
        else if (e.getSource().equals(cuadrado)){
            //Obtiene el area y el perimetro del cuadrado si mo esta vacio el campo
            //caso contrario lanza la leyenda cprrespondiente
            if (!empy1){
                Cuadrado cuadrado = new Cuadrado(v1);
                area.setText(cuadrado.getArea());
                perimetro.setText(cuadrado.getPerimetro());
            }
            else{
                area.setText("");
                perimetro.setText("Favor de lenar los campos correctamente");
            }
        }
    }
}
