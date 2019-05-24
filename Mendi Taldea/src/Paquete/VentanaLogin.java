package Paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    private static VentanaLogin ventanaLogin;
    private static JFrame framelogin;


    public VentanaLogin() {
        JBiniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String user = JTdatosUsuarioLogin.getText();
                String pass = JTdatosPassLogin.getText();

                int idSocio = Login.hacerLogin(new Login(user, pass));

                if (idSocio == -2)
                    JOptionPane.showMessageDialog(
                            null,
                            "Login incorrecto",
                            "AVISO",
                            JOptionPane.ERROR_MESSAGE);
                else if (idSocio == -1)
                    JOptionPane.showMessageDialog(
                            null,
                            "Ha ocurrido un error con la base de datos",
                            "AVISO",
                            JOptionPane.ERROR_MESSAGE);
                else {
                    JFrame frame = new JFrame("VentanaPrincipal");
                    VentanaPrincipal v = new VentanaPrincipal(idSocio);
                    frame.setContentPane(v.getPanel());
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    //v.setIdSociologeado(idSocio);
                    v.getJPmodificarLogin().setVisible(false);
                    framelogin.dispose();
                }
            }
        });
        JTdatosPassLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JBiniciarSesion.doClick();
            }
        });
    }

    public static void main(String[] args) {
        framelogin = new JFrame("Login");
        ventanaLogin = new VentanaLogin();
        framelogin.setContentPane(ventanaLogin.panel);
        framelogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framelogin.pack();
        framelogin.setVisible(true);
        //framelogin.setSize(450,420);
        framelogin.setBounds(550, 200, 450, 420);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        JLtituloUsuario = new JLabel(new ImageIcon("usuario.png"));
        JLtituloPass = new JLabel(new ImageIcon("pass.png"));
        JLencabezadoLogin = new JLabel(new ImageIcon("encabezadoLogin.png"));
    }
}
