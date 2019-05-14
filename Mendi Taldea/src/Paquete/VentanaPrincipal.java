package Paquete;

import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;

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

    private JTable JTcargos;
    private JTable JTtipoActividad;
    private JSpinner spinner1;
    private JPanel JPinsertarTipoCuotas;
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
    private JScrollPane JSPtablaTipoCuotas;
    private JTable JTtipoCuotas;
    private JLabel JLtituloTipoCuotas;
    private JTextField JTanyadirNombreTipoCuota;
    private JButton JBanyadirTipoCuota;
    private JTextField JTanyadirCantidadTipoCuota;
    private JComboBox JCBanyadirEdadTipoCuota;
    private JLabel JLtituloCantidadTipoCuota;
    private JLabel JLtituloTipoCuota;


    //Ventana Socios
    private JPanel JPvisualizarSocios;
    private JPanel JPtablaSocios;
    private JTable JTsocios;
    private JScrollPane JSPtablaSocios;
    private JPanel JPnombreApellidosSocios;
    private JPanel JPotrosDatosSocios;
    private JPanel JPbotonCambiosSocios;
    private JTextField JTnombreSocio;
    private JTextField JTapellidoSocio;
    private JLabel JLtituloNombreSocios;
    private JLabel JLtituloApellidoSocios;
    private JTextField JTdniSocios;
    private JLabel JLtituloDniSocios;
    private JLabel JTtituloFechaNacimientoSocios;
    private JTextField JTdniSocio;
    private JLabel JLtituloTelefonoSocio;
    private JTextField JTemailSocio;
    private JLabel JLtituloEmailSocio;
    private JButton JBlimpiarDatosSocio;
    private DatePicker DPfechaNacimientoSocio;
    private JLabel JLtituloFechaAltaSocio;
    private JLabel JLtituloFechaBajaSocio;
    private DatePicker DPfechaAltaSocio;
    private DatePicker DTfechaBajaSocio;
    private JButton JBeditarDatosSocio;
    private JButton JBeliminarDatosSocio;
    private JButton JBguardarDatosSocio;
    private CalendarPanel JCpanelInferiorCalendario;
    private JTable JTpanelInferiorActividades;
    private JScrollPane JSPpanelInferiorActividades;
    private JTable JTpanelInferiorMiembrosJunta;
    private JScrollPane JSPpanelInferiorMiembrosJunta;
    private JPanel JPinferiorMiembroJunta;
    private JPanel JPinferiorCalendario;
    private JPanel JPinferiorActividades;

    //modelos para las putas tablas
    DefaultTableModel modeloCargos;
    DefaultTableModel modeloTipoCuotas;
    DefaultTableModel modeloTipoActividad;


    // static final List<Socio> socios = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    ///////////////////////////////////////////////////////
    //Tabla personalizada para crear esto en el form hay que seleccionar custom create
    private void createUIComponents() {

        //Object[][] datos = new Object[][]{{"Santi","gonzalez"},{"irune","nose"}}; ejemplo


        /////////////////////////////////////////// Ventana Tipo Cargos /////////////////////////////////////////////
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


        /////////////////////////////VENTANA TIPO_CUOTA/////////////////////////////

        JTtipoCuotas = new JTable();

        modeloTipoCuotas = (DefaultTableModel) JTtipoCuotas.getModel();

        modeloTipoCuotas.setColumnIdentifiers(new Object[]{"Cantidad", "Edad", "Tipo de cuotas"});

        List<TipoCuota> tipoCuotas = Sentencias.recogidaTipoCuotas();

        recargarTablaTipoCuotas(tipoCuotas, modeloTipoCuotas);


        //////////////////////////////////////////// Ventana Tipo Actividad /////////////////////////////////////////
        JTtipoActividad = new JTable();

        modeloTipoActividad = (DefaultTableModel) JTtipoActividad.getModel();

        modeloTipoActividad.setColumnIdentifiers(new Object[]{"Actividades Disponibles"});

        List<TipoActividad> tipoActividades = Sentencias.recogidaTipoActividad();

        recargarTablaTipoActividad(tipoActividades, modeloTipoActividad);

    }


    ///////////////////////////VENTANA CARGOS/////////////////////////////
    ////////////////////////////////////////////

    //////////////////////////////////////////////////////BOTONES DE AÑADIR/////////////////////////////////////////////
    public VentanaPrincipal() {

        ////////////////////////////////Boton de la ventana CARGOS //////////////////////////////////////////////////////
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

        /////////////////////////////VENTANA TIPO_CUOTA/////////////////////////////
        JBanyadirTipoCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean guardado = Sentencias.guardarTipoCuota(
                        new TipoCuota(Integer.parseInt(JTanyadirCantidadTipoCuota.getText()),
                                JCBanyadirEdadTipoCuota.getSelectedIndex(),
                                JTanyadirNombreTipoCuota.getText()));

                if (guardado) {

                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    List<TipoCuota> tipoCuotas = Sentencias.recogidaTipoCuotas();

                    recargarTablaTipoCuotas(tipoCuotas, modeloTipoCuotas);
                }
            }

        });

        //////////////////////////Boton de la ventana Tipo Actividad ///////////////////////////////////////////////
        JBanyadirNuevaActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                boolean guardado = Sentencias.guardarTipoActividad(new TipoActividad(JTnuevaActividad.getText()));

                if (guardado) {

                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    //obtenemos la lista de cargos de la base de datos gracias a la funcion recogida Cargos
                    List<TipoActividad> tActividades = Sentencias.recogidaTipoActividad();

                    recargarTablaTipoActividad(tActividades, modeloTipoActividad);
                }

            }
        });
    }

    ///////////////////////////////////FUNCIONES PARA RECARGAR LAS TABLAS////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////
    //FUNCIONES DE RECARGAR LAS VISUALIZACIONES DE LAS TABLAS
    private void recargarTablaCargos(List<Cargo> cargos, DefaultTableModel modelo) {

        modelo.setRowCount(0);

        //bucle para meter en la tabla lo que tiene la lista
        for (Cargo cargo : cargos) {

            //model.insertRow(model.getRowCount(),new Object[]{cargo.getIdCargo(),cargo.getTipo()});
            modelo.insertRow(modelo.getRowCount(), new Object[]{cargo.getTipo()});

        }
    }

    private void recargarTablaTipoCuotas(List<TipoCuota> tipoCuotas, DefaultTableModel modelo) {

        modelo.setRowCount(0);
        modelo.setColumnCount(3);

        for (TipoCuota tipoCuota : tipoCuotas) {
            modelo.insertRow(
                    modelo.getRowCount(),
                    new Object[]{tipoCuota.getCantidad(), tipoCuota.getEdad_limite(), tipoCuota.getNombre()});
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void recargarTablaTipoActividad(List<TipoActividad> tipoActividades, DefaultTableModel modelo) {

        modelo.setRowCount(0);

        //bucle para meter en la tabla lo que tiene la lista
        for (TipoActividad tipoA : tipoActividades) {

            //model.insertRow(model.getRowCount(),new Object[]{cargo.getIdCargo(),cargo.getTipo()});
            modelo.insertRow(modelo.getRowCount(), new Object[]{tipoA.getTipo()});

        }
    }


}
