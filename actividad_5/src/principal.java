import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class principal extends JFrame implements ActionListener{
    private JButton boton;
    private JTextField x,y;
    private JLabel texto1,texto2;
    private JLabel suma,resta,mult,div,res;
    public static void main(String[] args) {
        principal inicializar = new principal();
        inicializar.setSize(300,400);
        inicializar.panel();
        inicializar.setVisible(true);
    }
    private void panel(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        texto1 =new JLabel("ingrese el numero 1");
        texto2 =new JLabel("ingrese el numero 2");
        suma = new JLabel("");
        resta = new JLabel("");
        mult = new JLabel("");
        div = new JLabel("");
        res = new JLabel("");
        x=new JTextField("0",10);
        y=new JTextField("0",10);
        ventana.add(texto1);
        ventana.add(texto2);
        ventana.add(x);
        ventana.add(y);
        boton = new JButton("Realizar Operaciones");
        ventana.add(boton);
        boton.addActionListener(this);
        ventana.add(suma);
        ventana.add(resta);
        ventana.add(mult);
        ventana.add(div);
        ventana.add(res);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        operaciones op = new operaciones();
        suma.setText(op.suma(Float.parseFloat(x.getText()),Float.parseFloat(y.getText())));
        resta.setText(op.resta(Float.parseFloat(x.getText()),Float.parseFloat(y.getText())));
        mult.setText(op.multiplicacion(Float.parseFloat(x.getText()),Float.parseFloat(y.getText())));
        div.setText(op.division(Float.parseFloat(x.getText()),Float.parseFloat(y.getText())));
        res.setText(op.residuo(Float.parseFloat(x.getText()),Float.parseFloat(y.getText())));
    }
}
