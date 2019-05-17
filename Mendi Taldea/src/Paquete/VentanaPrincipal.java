package Paquete;

import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
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
    private JComboBox JSPEdadTipoCuota;
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
    private JTextField JTtelefonoSocio;
    private JLabel JLtituloTelefonoSocio;
    private JTextField JTemailSocio;
    private JLabel JLtituloEmailSocio;
    private JButton JBlimpiarDatosSocio;
    private DatePicker DPfechaNacimientoSocio;
    private JLabel JLtituloFechaAltaSocio;
    private JLabel JLtituloFechaBajaSocio;
    private DatePicker DPfechaAltaSocio;
    private DatePicker DPfechaBajaSocio;
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
    private JSpinner spinner1;
    private JLabel JLtituloFechaPagoCuota;
    private DatePicker JDPfechaPagadoCuota;

    //modelos para las putas tablas
    DefaultTableModel modeloCargos;
    DefaultTableModel modeloTipoCuotas;
    DefaultTableModel modeloTipoActividad;

    //Listas
    public static List<Socio> socios = new ArrayList<>();
    public static List<Cargo> cargos = new ArrayList<>();
    public static List<Cuota> cuotas = new ArrayList<>();
    public static List<TipoActividad> tipoActividades = new ArrayList<>();
    public static List<TipoCuota> tipoCuotas = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /////////////////////////////////////CUSTOM CREATE/////////////////////////////////////////////////

    //Tabla personalizada para crear esto en el form hay que seleccionar custom create
    private void createUIComponents() {

        //Se modela un spinner para marcar la edad mínima al insertar un nuevo Tipo de Cuota
        SpinnerModel sm = new SpinnerNumberModel(4, 4, 60, 1);
        spinner1 = new JSpinner(sm);

        /*
        Define una tabla, y para ella el modelo personalizado para cada pestaña
         */

        //////VENTANA SOCIO///////
        JTsocios = new JTable();
        JTsocios.setModel((new SocioModel()));

        //////VENTANA TIPO_ACTIVIDAD///////
        JTtipoActividad = new JTable();
        JTtipoActividad.setModel(new TipoActividadModel());

        ///////VENTANA TIPO_CUOTA///////
        JTtipoCuotas = new JTable();
        JTtipoCuotas.setModel(new TipoCuotaModel());

        ///////VENTANA CARGO///////
        JTcargos = new JTable();
        JTcargos.setModel(new CargoModel());

        ///////VENTANA CUOTA///////
        JTcuotas = new JTable();
        JTcuotas.setModel(new CuotaModel());

    }

    //////////////////////////////////////////////////////BOTONES DE AÑADIR/////////////////////////////////////////////

    public VentanaPrincipal() {

                            //////////////////VENTANA CARGO////////////////////////
        JBguardarNuevoCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean guardado = Sentencias.guardarCargo(new Cargo(JTanyadirTipoCargo.getText()));

                if (guardado) {

                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    JTcargos.setModel(new CargoModel());
                }
            }
        });

                /////////////////////////////VENTANA TIPO_CUOTA/////////////////////////////
        /*JBguardarDatosTipoCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //mirar------> al al cambiar el constructor con fecha_nac
                boolean guardado = Sentencias.guardarTipoCuota(
                        new TipoCuota(Integer.parseInt(JTanyadirCantidadTipoCuota.getText()),
                                Integer.parseInt(spinner1.getValue().toString()),
                                JTanyadirNombreTipoCuota.getText()));

                //todo:poner try/catch para el parseInt y no poder meter letras

                if (guardado) {

                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    JTtipoCuotas.setModel(new TipoCuotaModel());
                }
            }

        });

         */


        //////////////////////////Boton de la ventana Tipo Actividad ///////////////////////////////////////////////
        JBguardarTipoActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                boolean guardado = Sentencias.guardarTipoActividad(new TipoActividad(JTanyadirTipoActividad.getText()));

                if (guardado) {
                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    JTtipoActividad.setModel(new TipoActividadModel());
                }
            }
        });

        //////////////////////////Boton de la ventana Socios ///////////////////////////////////////////////
        JBguardarDatosSocio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int resp = 2;
                //todo: es necesario poner un if para comprobar los datos de los TX y no de problemas com null
                boolean guardado = Sentencias.guardarSocio(new Socio(
                        JTnombreSocio.getText(),
                        JTapellidoSocio.getText(),
                        DPfechaNacimientoSocio.getDate(),
                        JTdniSocios.getText(),
                        Integer.parseInt(JTtelefonoSocio.getText()),
                        JTemailSocio.getText(),
                        resp,
                        DPfechaAltaSocio.getDate(),
                        DPfechaBajaSocio.getDate()

                        //todo:enviarle new cuota al constructor de socio y de rebote en constructor de cuotas
                        //todo:tiene que crear un objeto de tipo tipo_cuota


                        //new Cuota(socios.size(),this)
                ));

                if (guardado) {
                    JOptionPane.showMessageDialog(null, "Se ha guardado correctamente",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    JTsocios.setModel(new SocioModel());

                }
            }
        });

        JBguardarDatosCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               // boolean guardado = Sentencias.guardarCuota(new Cuota
                        //)



            }
        });

        /*
        JCBpagadoCuota.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(JCBpagadoCuota.isSelected()){
                    JDPfechaPagadoCuota.isEnabled();

                } else {

                }

            }
        });
        */



    }
}






