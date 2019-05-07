package Paquete;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal {

    public static final List<Socio> socios = new ArrayList<>();

    //
    //hola

    private JPanel panel;
    private JLabel JLtitulo;
    private JPanel JPdatos;
    private JTextField JTusuario;
    private JLabel JLusuario;
    private JLabel JLpass;
    private JPasswordField JPpass;
    private JButton JBlogin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
