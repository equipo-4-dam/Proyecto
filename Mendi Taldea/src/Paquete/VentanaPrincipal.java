package Paquete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class VentanaPrincipal extends JPanel{
    private JPanel panel;
    private JTabbedPane tabbedPane;
    private JTextField JTusuario;
    private JPasswordField JPpass;
    private JButton actualizarButton;
    private JLabel JLusuario;
    private JLabel JLpass;
    private JPanel JPcargos;
    private JButton button1;
    private JPanel JPinferior;

    //Ventana Tipo de Cuotas
    private JPanel JPtipoCuotas;
    private JLabel JLcuotaInfantil;
    private JLabel JLcuotaJuvenil;
    private JLabel JLcuotaAdulto;
    private JLabel JLcuotaSenior;
    private JButton JBeliminarCuotaInfantil;
    private JButton JBeditarCuotaInfantil;
    private JButton JBeliminarCuotaJuvenil;
    private JButton JBeditarCuotaJuvenil;
    private JButton JBeliminarCuotaAdulto;
    private JButton JBeditarCuotaAdulto;
    private JButton JBeliminarCuotaSenior;
    private JButton JBeditarCuotaSenior;
    private JPanel JPanyadirTipoCuota;
    private JLabel JLtituloNuevaCuota;
    private JTextField JTnuevoTipoCuota;
    private JSpinner JSPtipoCuotaEdad;
    private JSpinner JSPtipoCuotaEdad1;
    private JLabel JLtextoTipoCuota;
    private JLabel JLtextoTipoCuota1;
    private JLabel JLtextoTipoCuota2;


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
