package Paquete;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaLogin {

    public static final List<Socio> socios = new ArrayList<>();

    private JPanel panel;
    private JPanel JPdatosUsuario;
    private JPanel JPdatosPass;
    private JPanel JPbotonLogin;
    private JTextField JTdatosUsuarioLogin;
    private JTextField JTdatosPassLogin;
    private JButton JBiniciarSesion;
    private JLabel JLtituloUsuario;
    private JLabel JLtituloPass;
    private JPanel JPencabezadoLogin;
    private JLabel JLencabezadoLogin;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new VentanaLogin().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(450,420);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

        JLtituloUsuario = new JLabel(new ImageIcon("usuario.png"));
        JLtituloPass = new JLabel(new ImageIcon("pass.png"));
        JLencabezadoLogin = new JLabel(new ImageIcon("encabezadoLogin.png"));
    }
}
