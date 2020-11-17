package actividad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Gui extends JFrame implements ActionListener{
    //Elementos Graficos
    private JButton agenda, crear, eliminar;
    private JTextField valor1,valor2;
    public TextArea result;
    AddressBook addressBook = new AddressBook();
    ManejoAgenda manejoAgenda = new ManejoAgenda();
    public static void main(String[] args) {
        //Se establece los valores predeterminador de la ventana
        Gui Frame = new Gui();
        Frame.setSize(500,330);
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
        JLabel text = new JLabel("Numero");
        JLabel text2 = new JLabel("Nombre");
        JLabel aux = new JLabel("");
        result = new TextArea();
        valor1 = new JTextField(20);
        valor2 = new JTextField(20);
        agenda = new JButton("Agenda");
        crear = new JButton("Crear");
        eliminar = new JButton("Eliminar");
        agenda.addActionListener(this);
        crear.addActionListener(this);
        eliminar.addActionListener(this);
        //agrega los elementos al panel
        window.add(text);
        window.add(text2);
        window.add(valor1);
        window.add(valor2);
        window.add(agenda);
        window.add(crear);
        window.add(eliminar);
        window.add(aux);
        window.add(result);
        //Establece un tamaño a los elementos graficos indicados
        text.setPreferredSize(new Dimension(240,20));
        agenda.setPreferredSize(new Dimension(150,20));
        crear.setPreferredSize(new Dimension(150,20));
        eliminar.setPreferredSize(new Dimension(150,20));
        aux.setPreferredSize(new Dimension(500,0));
        load();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //accion del boton agenda
        if (e.getSource().equals(agenda)) {
            load();
            result.setText(manejoAgenda.list(addressBook.directorio));
        }
        //accion del boton crear
        if (e.getSource().equals(crear)){
            if (!valor1.getText().isEmpty() && !valor2.getText().isEmpty()) {
                try {
                    result.setText(manejoAgenda.create(valor1.getText(),valor2.getText()));
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(null,"No se pudo crear el contacto");
                }
            }
        }
        //accion del boton eliminar
        if (e.getSource().equals(eliminar)){
            if (!valor1.getText().isEmpty()) {
                try {
                    result.setText(manejoAgenda.delete(valor1.getText(), addressBook.directorio));
                } catch (IOException ioException) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el contacto"+e.toString());
                }
            }
        }
    }
    //metodo para
    public void load(){
        try {
            result.setText(addressBook.load());
        } catch (IOException ioException) {
            result.setText(ioException.toString());
        }
    }
}
