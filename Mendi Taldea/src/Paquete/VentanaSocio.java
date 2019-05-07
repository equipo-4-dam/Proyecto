package Paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaSocio {
    private JTextField JTnombre;
    private JTextField JTapellidos;
    private JTextField JTfechaNac;
    private JTextField JTdni;
    private JTextField JTtelefono;
    private JTextField JTemail;
    private JTextField JTfechaAlta;
    private JTextField JTfechaBaja;
    private JPanel JPsocio;
    private JButton JBguardar;
    private JLabel JLpagado;

    public VentanaSocio() {
        JBguardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = JTnombre.getText();
                String apellidos = JTapellidos.getText();
                String fechaNac = JTfechaNac.getText();
                String dni = JTdni.getText();
                int telefono = Integer.parseInt(JTtelefono.getText());
                String email = JTemail.getText();
                String fechaAlta = JTfechaAlta.getText();
                String fechaBaja = JTfechaBaja.getText();

                VentanaPrincipal.socios.add(new Socio(nombre,apellidos,fechaNac,dni,telefono,email,fechaAlta,fechaBaja));
            }
        });
    }
}
