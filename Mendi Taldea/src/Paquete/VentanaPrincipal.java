package Paquete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal extends JPanel{
    private JPanel panel;
    private JTabbedPane tabbedPane1;
    private JTextField JTnombre;
    private JTextField JTapellido;
    private JTextField JTtelf;
    private JTextField JTemail;
    private JTextField JTdni;
    private JTextField JTcuota;
    private JButton JBguardar;
    private JLabel JLcuota;
    private JLabel JLdni;
    private JLabel JLemail;
    private JLabel JLtelf;
    private JLabel JLapellido;
    private JLabel JLnombre;
    private JLabel JLtitulo;
    private JTextField JTusuario;
    private JPasswordField JPpass;
    private JButton actualizarButton;
    private JLabel JLusuario;
    private JLabel JLpass;
    private JTextField JTpresidente;
    private JTextField JTpresiFecha;
    private JTextField JTvicepresidete;
    private JTextField JTvicepresiFecha;
    private JTextField JTsecretario;
    private JTextField JTsecretarioFecha;
    private JTextField JTtesorero;
    private JTextField JTtesoreroFecha;
    private JTextField JTvocal1;
    private JTextField JTvocal1Fecha;
    private JTextField JTvocal2;
    private JTextField JTvocal2Fecha;
    private JTextField JTvocal3;
    private JTextField JTvocal3Fecha;
    private JTextField JTvocal4;
    private JTextField JTvocal4Fecha;
    private JTextField JTvocal5;
    private JTextField JTvocal5Fecha;
    private JButton JBguardarjunta;
    private JLabel JLpresidente;
    private JLabel JLvicepresidente;
    private JLabel JLsecretario;
    private JLabel JLtesorero;
    private JLabel JLvocal1;
    private JLabel JLvocal2;
    private JLabel JLvocal3;
    private JLabel JLvocal4;
    private JLabel JLcargo5;


    static final List<Socio> socios = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


    }

}
