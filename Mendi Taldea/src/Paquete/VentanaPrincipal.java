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

    //Ventana Junta
    private JLabel JLpresidente;
    private JLabel JLvicepresidente;
    private JLabel JLsecretario;
    private JLabel JLtesorero;
    private JLabel JLvocal1;
    private JLabel JLvocal2;
    private JLabel JLvocal3;
    private JLabel JLvocal4;
    private JLabel JLvocal5;
    private JButton JBeditarPresidente;
    private JButton JBeditarVicepresidente;
    private JButton JBeditarSecretario;
    private JButton JBeditarTesorero;
    private JButton JBeditarVocal1;
    private JButton JBeditarVocal2;
    private JButton JBeditarVocal3;
    private JButton JBeditarVocal4;
    private JButton JBeditarVocal5;
    private JButton JbeliminarPresidente;
    private JButton JBeliminarVicepresidente;
    private JButton JBeliminarSecretario;
    private JButton JBeliminarTesorero;
    private JButton JBeliminarVocal1;
    private JButton JBeliminarVocal2;
    private JButton JBeliminarVocal3;
    private JButton JBeliminarVocal4;
    private JButton JBeliminarVocal5;
    private JButton JBguardarPresidente;
    private JButton JBguardarVicepresidente;
    private JButton JBguardarSecretario;
    private JButton JBguardarTesorero;
    private JButton JBguardarVocal1;
    private JButton JBguardarVocal2;
    private JButton JBguardarVocal3;
    private JButton JBguardarVocal4;
    private JButton JBguardarVocal5;
    private JTextField JTpresidente;
    private JTextField JTvicepresidente;
    private JTextField JTsecretario;
    private JTextField JTtesorero;
    private JTextField JTvocal1;
    private JTextField JTvocal2;
    private JTextField JTvocal3;
    private JTextField JTvocal4;
    private JTextField JTvocal5;
    private JTextField JTfechaAltaPresidente;
    private JTextField JTfechaAltaVicepresidente;
    private JTextField JTfechaAltaSecretario;
    private JTextField JTfechaAltaTesorero;
    private JTextField JTfechaAltaVocal1;
    private JTextField JTfechaAltaVocal2;
    private JTextField JTfechaAltaVocal3;
    private JTextField JTfechaAltaVocal4;
    private JTextField JTfechaAltaVocal5;

    //Ventana Cargos
    private JLabel JLtituloCargos;
    private JLabel JLtituloFechaAlta;
    private JButton JBanyadirTipoCuota;
    private JPanel JPtipoCargos;
    private JPanel JPanyadirTipoCargo;
    private JButton JBeliminarCargoPresidente;
    private JButton JBeliminarCargoVicepresidente;
    private JButton JBeliminarCargoSecretario;
    private JButton JBeliminarCargoTesorero;
    private JButton JBeliminarCargoVocal1;
    private JButton JBeliminarCargoVocal2;
    private JButton JBeliminarCargoVocal3;
    private JButton JBeliminarCargoVocal4;
    private JButton JBeliminarCargoVocal5;
    private JLabel JLcargoPresidente;
    private JLabel JLcargoVicepresidente;
    private JLabel JLcargoSecretario;
    private JLabel JLcargoTesorero;
    private JLabel JLcargoVocal1;
    private JLabel JLcargoVocal2;
    private JLabel JLcargoVocal3;
    private JLabel JLcargoVocal4;
    private JLabel JLcargoVocal5;
    private JLabel JLtituloNuevoCargo;
    private JTextField JTnuevoCargo;
    private JButton JBanyadirNuevoCargo;
    private JLabel JLtituloCargo;

    //Ventana Tipo de Actividades
    private JPanel JPtipoActividades;
    private JPanel JPanyadirTipoActividad;
    private JLabel JLsalidaMonte;
    private JLabel JLalbergueFinde;
    private JLabel JLreunion;
    private JLabel JLcomida;
    private JLabel JLotros;
    private JButton JBeliminarSalidaMonte;
    private JButton JBeliminarAlbergue;
    private JButton JBeliminarReunion;
    private JButton JBeliminarComida;
    private JButton JBeliminarOtros;
    private JTextField JTnuevaActividad;
    private JButton JBanyadirNuevaActividad;
    private JLabel JLtituloNuevaActividad;
    private JLabel JLactividad;


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
