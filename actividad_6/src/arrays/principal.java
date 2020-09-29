package arrays;
//librerias
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//clase eon la clase Jframe heredada e implementa la interface ActionListener
public class principal extends JFrame implements ActionListener {
    //declaracion de variables privadas de los elementos graficos y el array
    private float [] calificaciones =new float [5];
    private JLabel tname,tcalf,rname,rc1,rc2,rc3,rc4,rc5,rpromedio,rcalf;
    private JTextField name,c1,c2,c3,c4,c5;
    private JButton resultado;
    //metodo principal
    public static void main(String[] args) {
        //establece la ventana y el tamaño de la ventana
        principal demo = new principal();
        demo.setSize(300,450);
        //manda a llamar al metodo interfaz
        demo.interfaz();
        //establece como visible
        demo.setVisible(true);
    }

    private void interfaz() {
        //establece cuando cerrar la aplicacion y el contenedor
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        //establece como objetos todos los elementos graficos para su uso
        tname = new JLabel ("Nombre");
        tcalf = new JLabel ("Ingresa tus calificaciones sobre 100");
        rname = new JLabel ("");
        rc1 = new JLabel ("");
        rc2 = new JLabel ("");
        rc3 = new JLabel ("");
        rc4 = new JLabel ("");
        rc5 = new JLabel ("");
        rpromedio = new JLabel ("");
        rcalf = new JLabel ("");
        name = new JTextField(24);
        c1 = new JTextField(10);
        c2 = new JTextField(10);
        c3 = new JTextField(10);
        c4 = new JTextField(10);
        c5 = new JTextField(21);
        resultado = new JButton("Calcular");
        //añade al panel todos los elementos graficos
        window.add(tname);
        window.add(name);
        window.add(tcalf);
        window.add(c1);
        window.add(c2);
        window.add(c3);
        window.add(c4);
        window.add(c5);
        window.add(resultado);
        window.add(rname);
        window.add(rc1);
        window.add(rc2);
        window.add(rc3);
        window.add(rc4);
        window.add(rc5);
        window.add(rpromedio);
        window.add(rcalf);
        //establece una dimension a los label para que cada uno este en una fila diferente
        rname.setPreferredSize(new Dimension(200,20));
        rc1.setPreferredSize(new Dimension(200,20));
        rc2.setPreferredSize(new Dimension(200,20));
        rc3.setPreferredSize(new Dimension(200,20));
        rc4.setPreferredSize(new Dimension(200,20));
        rc5.setPreferredSize(new Dimension(200,20));
        rpromedio.setPreferredSize(new Dimension(200,20));
        rcalf.setPreferredSize(new Dimension(200,20));
        //establece el boton para que sea escuchado y mande a llamar al metodo action performed
        resultado.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //instancia de la clase operaciones
        Operaciones op = new Operaciones();
        //declara los valores de las calificaciones en la variable calificaciones
        float[] calificaciones ={Float.parseFloat(c1.getText()),Float.parseFloat(c2.getText()),Float.parseFloat(c3.getText()),
                Float.parseFloat(c4.getText()),Float.parseFloat(c5.getText())};
        this.calificaciones=calificaciones;
        //manda a llamar al metodo resultados con los parametros obtenidos de la instacia op y sus metodos
        resultados(name.getText(),op.calfinal(op.promedio(calificaciones)),op.promedio(calificaciones));

    }
    public void resultados(String nombre, char calificacion,float promedio){
        //establece el texto de los elementos de los resultados
        rname.setText("Nombre: "+nombre);
        rc1.setText("Calificación 1: "+calificaciones[0]);
        rc2.setText("Calificación 2: "+calificaciones[1]);
        rc3.setText("Calificación 3: "+calificaciones[2]);
        rc4.setText("Calificación 4: "+calificaciones[3]);
        rc5.setText("Calificación 5: "+calificaciones[4]);
        rpromedio.setText("Promedio: "+promedio);
        rcalf.setText("Calificación final: "+calificacion);
    }
}
