package medicalsoft.Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import medicalsoft.Persona;

public class Ventana extends JFrame {

    JLabel eti1;
    JLabel eti2;

    /*public Ventana(){
        
        super("MedicalSoft");
        setSize(480, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        iniciarComponentes();
    }
    
    private void iniciarComponentes (){
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
            eti1 = new JLabel ("Etiqueta numero 1 :)");
                //eti1.setBounds(2,6,150,100);
            eti2 = new JLabel ("Etiqueta numero 2 :)");
                //eti2.setBounds(2,30,150,100);
                 
                cp.add(eti1);
                cp.add(eti2);
    }
     */
    JLabel[] eti = new JLabel[5];
    Border border = BorderFactory.createLineBorder(Color.black, 1);
    JPanel jpnl = (JPanel) this.getContentPane();

    public Ventana() {

        super("MedicalSoft");
        jpnl.setLayout(null);
        jpnl.setBackground(Color.GRAY);
        setSize(480, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < eti.length; i++) {
            eti[i] = new JLabel();
            eti[i].setBounds(new Rectangle(15, (i + 1) * 40, 120, 25));
            eti[i].setText("Billie Eilish <3 " + (i + 1));
            eti[i].setBorder(border);
            eti[i].setHorizontalAlignment(SwingConstants.CENTER);

            jpnl.add(eti[i], null);
        }

    }

    private void iniciarComponentes(String nombre, String edad, String email, String celular) {

        JPanel etq = new JPanel();

        etq.add(new JLabel("Nombre"));
        etq.add(new JLabel("Edad"));
        etq.add(new JLabel("Correo"));
        etq.add(new JLabel("Celular"));

        Container cp = getContentPane();
        this.getContentPane().add(etq);

    }
}
