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
    private JPanel JPinferior;

    private JPanel JPtipoCargos;
    private JPanel JPanyadirTipoCargo;
    private JTextField JTnuevoCargo;
    private JButton JBanyadirNuevoCargo;

    //Ventana Tipo de Actividades
    private JPanel JPtipoActividades;
    private JPanel JPanyadirTipoActividad;
    private JTextField JTnuevaActividad;
    private JButton JBanyadirNuevaActividad;

    private JTable JTcargos;
    private JTable JTtipoActividad;
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
    private JButton JBlimpiarDatosTipoCuota;
    private JTextField JTanyadirCantidadTipoCuota;
    private JComboBox JCBanyadirEdadTipoCuota;
    private JLabel JLtituloCantidadTipoCuota;
    private JLabel JLtituloTipoCuota;
    private JButton JBeditarDatosTipoCuota;
    private JButton JBeliminarDatosTipoCuota;
    private JButton JBguardarDatosTipoCuota;


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

   //Panel Inferior
    private CalendarPanel JCpanelInferiorCalendario;
    private JTable JTpanelInferiorActividades;
    private JScrollPane JSPpanelInferiorActividades;
    private JTable JTpanelInferiorMiembrosJunta;
    private JScrollPane JSPpanelInferiorMiembrosJunta;
    private JPanel JPinferiorMiembroJunta;
    private JPanel JPinferiorCalendario;
    private JPanel JPinferiorActividades;
    private JButton JBproponerFechaAdmin;
    private JPanel JPsoloAdminProponerFecha;

    //Ventana Junta
    private JPanel JPbuscarDatosTablaJunta;
    private JPanel JPdatosJunta;
    private JPanel JPmostrarCargosJunta;
    private JTable JTmostrarCargosJunta;
    private JScrollPane JSPmostrarCargosJunta;
    private JTable JTmostrarDatosJunta;
    private JScrollPane JSPbuscarDatosTablaJunta;
    private JComboBox JCBseleccionarCargoJunta;
    private DatePicker DPfechaAltaCargoJunta;
    private DatePicker DPfechaBajaCargoJunta;
    private JLabel JLtituloElegirCargoJunta;
    private JLabel JLtituloFechaAltaCargoJunta;
    private JLabel JLtituloFechaBajaCargoJunta;
    private JButton JBlimpiarDatosCargoJunta;
    private JButton JbactualizarDatosCargoJunta;
    private JButton JBeliminarDatosCargoJunta;
    private JButton JBguardarDatosCargoJunta;
    private JPanel JPbotonesDatosCargoJunta;

    //Ventana Actividades
    private JPanel JPorganizarActividad;
    private JPanel JPactividadesDisponibles;
    private JPanel JPbotonesActividadesDisponibles;
    private JTable table1;
    private JTextArea JTAdescripcionCrearActividad;
    private JComboBox JCBcrearTipoActividad;
    private JComboBox JCBfechaCrearActividad;
    private JComboBox JCBdificultadCrearActividad;
    private JTextField JTprecioCrearActividad;
    private JLabel JLtituloCrearTipoActividad;
    private JLabel JLtituloFechaCrearActividad;
    private JLabel JLtituloDificultadCrearActividad;
    private JLabel JLtituloPrecioCrearActividad;
    private JButton JBapuntarseActividad;
    private JButton JBcancelarActividadCreada;
    private JPanel JPbotonCancelarActividad;
    private JPanel JPapuntarseActividad;

    //Ventana Cuotas
    private JPanel JPbotonesEstadoCuotas;
    private JPanel JPestadoCuotas;
    private JTable JTestadoCuotas;
    private JScrollPane JSPestadoCuotas;
    private JButton JBlimpiarDatosCuota;
    private JButton JBeditarDatosCuota;
    private JButton JBeliminarDatosCuota;
    private JButton JBguardarDatosCuota;
    private JTextField JTnombreCuota;
    private JTextField JTapellidoCuota;
    private JTextField JTtipoCuotaCuotas;
    private JLabel JLtituloNombreCuota;
    private JLabel JLtituloApellidoCuota;
    private JLabel JLtituloTipoCuotaCuotas;
    private JCheckBox JCBpagadoCuota;
    private JLabel JLtituloPagadoCuotas;

    //Ventana Cargos
    private JButton JBlimpiarCargo;
    private JButton JBeditarCargo;
    private JButton JBeliminarCargo;
    private JButton JBguardarNuevoCargo;
    private JTextField JTanyadirTipoCargo;
    private JLabel JLtituloCargo;


    private JButton JBlimpiarDatosOrganizarActividad;
    private JButton JBeditarDatosOrganizarActividad;
    private JButton JBeliminarDatosOrganiarActividad;
    private JButton JBguardarDatosOrganizarActividad;
    private JButton JBlimpiarTipoActividad;
    private JButton JBeditarTipoActividad;
    private JButton JBeliminarTipoActividad;
    private JButton JBguardarTipoActividad;
    private JPanel JPanyadirTipoActividad1;
    private JPanel JPbotonesTipoActividad;
    private JTextField JTanyadirTipoActividad;
    private JLabel JLtituloAnyadirTipoActividad;

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
        JBguardarNuevoCargo.addActionListener(new ActionListener() {
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
        JBguardarDatosTipoCuota.addActionListener(new ActionListener() {
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
        JBguardarTipoActividad.addActionListener(new ActionListener() {
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
