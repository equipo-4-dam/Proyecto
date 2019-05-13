package Paquete;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class VentanaPrincipal extends JPanel {
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
    private JPanel JPtipoCargos;
    private JPanel JPanyadirTipoCargo;
    private JTextField JTnuevoCargo;
    private JButton JBanyadirNuevoCargo;
    private JLabel JLtituloCargo;

    //Ventana Tipo de Actividades
    private JPanel JPtipoActividades;
    private JPanel JPanyadirTipoActividad;
    private JTextField JTnuevaActividad;
    private JButton JBanyadirNuevaActividad;
    private JLabel JLtituloNuevaActividad;
    private JLabel JLactividad;
    private JPanel JPactividades;
    private JTable JTBactividades;
    private JPanel JPbotonesActividades;
    private JButton JBverActividad;
    private JButton JBverActividad1;
    private JPanel JPcrearActividad;
    private JPanel JPprecioGuardarActividad;
    private JComboBox JCBtipoActividad;
    private JLabel JLtipoActividad;
    private JPanel JPsocios;

    //Ventana Socios
    private JTable JTsocios;
    private JTable JTcargos;
    private JPanel JPcambiosCuotas;

    //Ventana Cuotas
    private JPanel JPtablaCuotas;
    private JTable JTcuotas;
    private JTextField JTanyadirCuotas;
    private JButton JBanyadirCuotas;
    private JScrollPane JSPtablaCuotas;
    private JLabel JLanyadirCuota;

    //Ventana TipoCuotas
    private JPanel JPcambiosTipoCuotas;
    private JPanel JPtablaTipoCuotas;
    private JTable JTtipoCuotas;
    private JScrollPane JSPtipoCuotas;
    private JTextField JTanyadirTipoCuota;
    private JButton JBanyadirTipoCuota;
    private JLabel JLtipoCuota;
    private JComboBox JCBanyadirEdad;
    private JTextField JTanyadirCantidad;

    //modelos para las putas tablas
    DefaultTableModel modeloCargos;
    DefaultTableModel modeloTipoCuotas;


    // static final List<Socio> socios = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    //Tabla personalizada para crear esto en el form hay que seleccionar custom create
    private void createUIComponents() {

        //Object[][] datos = new Object[][]{{"Santi","gonzalez"},{"irune","nose"}}; ejemplo

        //Creamos la tabla
        JTcargos = new JTable();

        //accedemos al modelo original que es el que recibe los datos del arraylist
        modeloCargos = (DefaultTableModel) JTcargos.getModel();

        //muestra el titulo de la tabla
        modeloCargos.setColumnIdentifiers(new Object[]{"Cargos"});


        //obtenemos la lista de cargos de la base de datos gracias a la funcion recogida Cargos
        List<Cargo> cargos = Sentencias.recogidaCargos();

        //borra el contenido de la tabla le paso los cargos que queremos que pinte con el modelo
        // (que es el contenido dela tabla)
        recargarTablaCargos(cargos, modeloCargos);


        /////////////////////////////VENTANA TIPOCUOTA/////////////////////////////

        JTtipoCuotas = new JTable();

        modeloTipoCuotas = (DefaultTableModel) JTtipoCuotas.getModel();

        modeloTipoCuotas.setColumnIdentifiers(new Object[]{"Tipo de cuotas"});

        List<TipoCuota> tipoCuotas = Sentencias.recogidaTipoCuotas();

        recargarTablaTipoCuotas(tipoCuotas, modeloTipoCuotas);


    }


    ///////////////////////////VENTANA CARGOS/////////////////////////////
    public VentanaPrincipal() {
        JBanyadirNuevoCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean guardado = Sentencias.guardarCargo(new Cargo(JTnuevoCargo.getText()));

                if (guardado) {

                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    //obtenemos la lista de cargos de la base de datos gracias a la funcion recogida Cargos
                    List<Cargo> cargos = Sentencias.recogidaCargos();

                    recargarTablaCargos(cargos, modeloCargos);
                }
            }
        });

        /////////////////////////////VENTANA TIPOCUOTA/////////////////////////////
        JBanyadirTipoCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean guardado = Sentencias.guardarTipoCuota(
                        new TipoCuota(Integer.parseInt(JTanyadirCantidad.getText()),
                                JCBanyadirEdad.getSelectedIndex(),
                                JTanyadirTipoCuota.getText()));

                JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);

                List<TipoCuota> tipoCuotas = Sentencias.recogidaTipoCuotas();

                recargarTablaTipoCuotas(tipoCuotas, modeloTipoCuotas);
            }

        });
    }

    ///////////////////////////////////FUNCIONES PARA RECARGAR LAS TABLAS////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void recargarTablaCargos(List<Cargo> cargos, DefaultTableModel modelo) {

        modelo.setRowCount(0);

        //bucle para meter en la tabla lo que tiene la lista
        for (Cargo cargo : cargos) {

            //model.insertRow(model.getRowCount(),new Object[]{cargo.getIdCargo(),cargo.getTipo()});
            modelo.insertRow(modelo.getRowCount(), new Object[]{cargo.getTipo()});

        }
    }

    private void recargarTablaTipoCuotas(List<TipoCuota> tipoCuotas, DefaultTableModel modeloTipoCuotas) {

        modeloCargos.setRowCount(0);

        for (TipoCuota tipoCuota : tipoCuotas) {
            modeloCargos.insertRow(
                    modeloCargos.getRowCount(),
                    new Object[]{tipoCuota.getCantidad(), tipoCuota.getEdad_limite()});
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
