package Paquete;

import com.github.lgooddatepicker.components.CalendarPanel;
import com.github.lgooddatepicker.components.DatePicker;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.*;
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
    private JTable JTactividadesOrganizadas;
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
    private JButton JBeliminarDatosCuota;
    private JButton JBguardarDatosCuota;

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
    private JPanel JPmodificarLogin;

    //Listas
    private static List<TipoCuota> tipoCuotas = TipoCuotaDB.recogidaTipoCuota();
    private static List<Socio> socios = SocioDB.recogidaSocios();
    private static List<Cargo> cargos = new ArrayList<>();
    private static List<TipoActividad> tipoActividades = new ArrayList<>();
    private static List<Actividad> actividades = new ArrayList<>();
    private static List<Socio> miembrosJunta = SocioDB.recogidaSociosVentanaJunta();

    //obejtos temporales editar
    private int idSocio = -1;
    private int idTipoCuota = -1;
    private int idTipoActividad = -1;
    private int idCargo = -1;
    private int idJunta = -1;


    public static void main(String[] args) {

        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /////////////////////////////////////CUSTOM CREATE/////////////////////////////////////////////////
    //     Tabla personalizada para crear esto en el form hay que seleccionar custom create         ///
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Se redefinen las tablas y para ellas se cargarán sus modelos personalizados que se cargaran
     * en la VentanaPrincipal en la seccion de seleccion de pestañas
     */
    private void createUIComponents() {

        //Se modela un spinner para marcar la edad mínima al insertar un nuevo Tipo de Cuota
        SpinnerModel sm = new SpinnerNumberModel(4, 4, 60, 1);
        spinner1 = new JSpinner(sm);

        tabbedPane = new JTabbedPane();

        //Define una tabla, y para ella el modelo personalizado para cada tabla

        ////// Se redefinen las tablas///////
        JTtipoCuotas = new JTable();

        JTsocios = new JTable();

        JTtipoActividad = new JTable();

        JTmostrarDatosJunta = new JTable();

        JTcargos = new JTable();

        JTestadoCuotas = new JTable();

        JTactividadesOrganizadas = new JTable();

        JTmostrarCargosJunta = new JTable();

        JTpanelInferiorMiembrosJunta = new JTable();

        JTpanelInferiorMiembrosJunta.setModel(new JuntaModel());

    }

    //Getters y Setters
    public static List<TipoCuota> getTipoCuotas() {
        return tipoCuotas;
    }

    public static void setTipoCuotas(List<TipoCuota> tipoCuotas) {
        VentanaPrincipal.tipoCuotas = tipoCuotas;
    }

    public static List<Socio> getSocios() {
        return socios;
    }

    public static void setSocios(List<Socio> socios) {
        VentanaPrincipal.socios = socios;
    }

    public static List<Cargo> getCargos() {
        return cargos;
    }

    public static void setCargos(List<Cargo> cargos) {
        VentanaPrincipal.cargos = cargos;
    }

    public static List<TipoActividad> getTipoActividades() {
        return tipoActividades;
    }

    public static void setTipoActividades(List<TipoActividad> tipoActividades) {
        VentanaPrincipal.tipoActividades = tipoActividades;
    }

    public static List<Actividad> getActividades() {
        return actividades;
    }

    public static void setActividades(List<Actividad> actividades) {
        VentanaPrincipal.actividades = actividades;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }

    public JPanel getJPmodificarLogin() {
        return JPmodificarLogin;
    }

    public static List<Socio> getMiembrosJunta() {
        return miembrosJunta;
    }

    public static void setMiembrosJunta(List<Socio> miembrosJunta) {
        VentanaPrincipal.miembrosJunta = miembrosJunta;
    }

    /**
     * Se utiliza para escribir el codigo que ejecutan los elementos con los que interactuan
     * los usuarios y administradores
     */
    public VentanaPrincipal() {

        ///////////////////////////////BOTONES DE GUARDAR/////////////////////////////////////

        /////////////////Boton que guarda el nuevo cargo en BD////////////////////////
        JBguardarNuevoCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JTanyadirTipoCargo.getText().equals("")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Es necesario rellenar los campos",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    boolean guardado;

                    Cargo cargo = new Cargo(
                            JTanyadirTipoCargo.getText());

                    if (idCargo != -1) {
                        cargo.setIdCargo(idCargo);
                        guardado = CargoDB.editarCargo(cargo);
                    } else {
                        guardado = CargoDB.guardarCargo(cargo);
                    }

                    if (guardado) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Se ha guardado correctamente",
                                "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);

                        JTcargos.setModel(new CargoModel());
                    }
                }
            }
        });

        ///////////////Boton que guarda el nuevo Tipo de cuota en BD////////////////
        JBguardarDatosTipoCuota.addActionListener(new ActionListener() {
            @Override

            //todo falta validar los datos
            public void actionPerformed(ActionEvent e) {

                if (JTanyadirCantidadTipoCuota.getText().equals("") || JTanyadirNombreTipoCuota.getText().equals("")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Es necesario rellenar los campos",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    boolean guardado;

                    TipoCuota tipoCuota = new TipoCuota(
                            Integer.parseInt(JTanyadirCantidadTipoCuota.getText()),
                            Integer.parseInt(spinner1.getValue().toString()),
                            JTanyadirNombreTipoCuota.getText());

                    if (idTipoCuota != -1) {

                        tipoCuota.setId_cuota(idTipoCuota);
                        guardado = TipoCuotaDB.editarTipoCuota(tipoCuota);
                    } else {
                        guardado = TipoCuotaDB.guardarTipoCuota(tipoCuota);
                    }

                    if (guardado) {
                        JOptionPane.showMessageDialog(null,
                                "Se ha guardado correctamente",
                                "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);

                        JTtipoCuotas.setModel(new TipoCuotaModel());
                    }
                }
            }
        });

        //////////Boton que guarda el nuevo Tipo de actividad en BD////////////////
        JBguardarTipoActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //VALIDACIONES
               /* String tipoActividad = JTanyadirTipoActividad.getText();

                //todo revisar estas validaciones
                if (!tipoActividad.matches("[A-Za-z]+"))
                    JOptionPane.showMessageDialog(null, "Error");
                */
                if (JTanyadirTipoActividad.getText().equals("")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Es necesario rellenar los campos",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {

                    boolean guardado;

                    TipoActividad tipoActividad = new TipoActividad(JTanyadirTipoActividad.getText());

                    if (idTipoActividad != -1) {

                        tipoActividad.setId_tipo(idTipoActividad);
                        guardado = TipoActividadDB.editarTipoActividad(tipoActividad);
                    } else {
                        guardado = TipoActividadDB.guardarTipoActividad(tipoActividad);
                    }

                    if (guardado) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Se ha guardado correctamente",
                                "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);

                        JTtipoActividad.setModel(new TipoActividadModel());
                    }
                }
            }
        });

        //////////////Boton que guarda el nuevo socio en BD///////////////////////
        JBguardarDatosSocio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int edad = Period.between(DPfechaNacimientoSocio.getDate(), LocalDate.now()).getYears();
                boolean menor = edad < 18;

                Socio socioResponsable = null;

                int filaSeleccionada = JTsocios.getSelectedRow();

                if (menor) {

                    if (filaSeleccionada < 0) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Este Socio es menor de edad selecciona de la lista de socios su Responsable",
                                "Aviso",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        int confirmacion = JOptionPane.showConfirmDialog(
                                null,
                                "Responsable elegido: " + VentanaPrincipal.socios.get(filaSeleccionada).getNombre() +
                                        " " + VentanaPrincipal.socios.get(filaSeleccionada).getApellidos() + " " +
                                        " ¿está conforme?",
                                "AVISO",
                                JOptionPane.YES_NO_OPTION);

                        if (confirmacion == 0) {
                            socioResponsable = VentanaPrincipal.socios.get(filaSeleccionada);
                        }
                    }
                }

                if (!menor || socioResponsable != null) {

                    if (JTnombreSocio.getText().equals("") || JTapellidoSocio.getText().equals("") ||
                            JTdniSocios.getText().equals("") || JTtelefonoSocio.getText().equals("") ||
                            JTemailSocio.getText().equals("")) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Es necesario rellenar los campos",
                                "Error",
                                JOptionPane.WARNING_MESSAGE);
                    } else {

                        boolean guardado;

                        Socio socio = new Socio(
                                JTnombreSocio.getText(),
                                JTapellidoSocio.getText(),
                                DPfechaNacimientoSocio.getDate(),
                                JTdniSocios.getText(),
                                Integer.parseInt(JTtelefonoSocio.getText()),
                                JTemailSocio.getText(),
                                socioResponsable,
                                DPfechaAltaSocio.getDate(),
                                DPfechaBajaSocio.getDate());

                        if (idSocio != -1) {

                            socio.setId_socio(idSocio);
                            guardado = SocioDB.editarSocio(socio);
                        } else {
                            guardado = SocioDB.guardarSocio(socio);
                        }

                        if (guardado) {
                            JOptionPane.showMessageDialog(null,
                                    "Se ha guardado correctamente",
                                    "Aviso",
                                    JOptionPane.INFORMATION_MESSAGE);

                            JTsocios.setModel(new SocioModel());
                        }
                    }
                }
            }
        });

        /////////////Boton que Actualiza si ha pagado la cuota en BD//////////////////
        JBguardarDatosCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (JTanyadirTipoActividad.getText().equals("")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Es necesario rellenar los campos",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    //todo hay que realizar el update table
                    // boolean guardado = Sentencias.guardarCuota(new Cuota
                    //)

                    JTestadoCuotas.setModel(new CuotaModel());
                }
            }
        });

        JBguardarDatosCargoJunta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (DPfechaAltaCargoJunta.getText().equals("")) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Es necesario rellenar los campos",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);

                } else {

                    boolean guardado;
/*
                    Junta junta = new Junta();

                    if (idTipoActividad != -1) {

                        tipoActividad.setId_tipo(idTipoActividad);
                        guardado = TipoActividadDB.editarTipoActividad(tipoActividad);
                    } else {
                        guardado = TipoActividadDB.guardarTipoActividad(tipoActividad);
                    }

                    if (guardado) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Se ha guardado correctamente",
                                "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);

                        JTtipoActividad.setModel(new TipoActividadModel());
                    }

 */
                    JTmostrarCargosJunta.setModel(new JuntaModel());
                }

            }
        });

        /////////////////////////////////BOTONES DE EDITAR//////////////////////////////////

        /////////////Boton que Actualiza socios en BD//////////////////
        JBeditarDatosSocio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = JTsocios.getSelectedRow();

                if (filaSeleccionada < 0) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Debes seleccionar una fila de la tabla para poder editarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);

                } else {

                    Socio socioSeleccionado = socios.get(filaSeleccionada);

                    JTnombreSocio.setText(socioSeleccionado.getNombre());
                    JTapellidoSocio.setText(socioSeleccionado.getApellidos());
                    JTdniSocios.setText(socioSeleccionado.getDni());
                    DPfechaNacimientoSocio.setDate(socioSeleccionado.getFecha());
                    JTtelefonoSocio.setText(String.valueOf(socioSeleccionado.getTelefono()));
                    JTemailSocio.setText(socioSeleccionado.getEmail());
                    DPfechaAltaSocio.setDate(socioSeleccionado.getFechaAlta());
                    DPfechaBajaSocio.setDate(socioSeleccionado.getFechaBaja());

                    //Recoge el id del Socio y compara que no sea igual a -1 para poder hacer el Update
                    idSocio = socioSeleccionado.getId_socio();
                }
            }
        });

        /////////////Boton que Actualiza tipo de cuota en BD//////////////////
        JBeditarDatosTipoCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = JTtipoCuotas.getSelectedRow();

                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Debes seleccionar una fila de la tabla para poder editarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    TipoCuota tipoCuotaSeleccionada = tipoCuotas.get(filaSeleccionada);

                    JTanyadirCantidadTipoCuota.setText(String.valueOf(tipoCuotaSeleccionada.getCantidad()));
                    spinner1.setValue(tipoCuotaSeleccionada.getEdad_limite());
                    JTanyadirNombreTipoCuota.setText(tipoCuotaSeleccionada.getNombre());

                    idTipoCuota = tipoCuotaSeleccionada.getId_cuota();
                }
            }
        });

        /////////////Boton que Actualiza tipo de actividad en BD//////////////////
        JBeditarTipoActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = JTtipoActividad.getSelectedRow();

                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Debes seleccionar una fila de la tabla para poder editarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    TipoActividad tipoActividadSeleccionada = tipoActividades.get(filaSeleccionada);

                    JTanyadirTipoActividad.setText(tipoActividadSeleccionada.getTipo());

                    idTipoActividad = tipoActividadSeleccionada.getId_tipo();
                }
            }
        });

        /////////////Boton que Actualiza cargo en BD//////////////////
        JBeditarCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = JTcargos.getSelectedRow();

                if (filaSeleccionada < 0) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Debes seleccionar una fila de la tabla para poder editarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    Cargo cargoSeleccionado = cargos.get(filaSeleccionada);

                    JTanyadirTipoCargo.setText(cargoSeleccionado.getTipo());

                    idCargo = cargoSeleccionado.getIdCargo();
               }
            }
        });

        //////////////////////////////////////BOTONES DE ELIMINAR//////////////////////////////////////

        /////////////Boton que Elimina socios en BD//////////////////
        JBeliminarDatosSocio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = JTsocios.getSelectedRow();

                if (filaSeleccionada < 0) {

                    JOptionPane.showMessageDialog(null,
                            "Debes seleccionar una fila de la tabla socios para poder eliminarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "Socio Elegido: " + VentanaPrincipal.socios.get(filaSeleccionada).getNombre() +
                                    " " + VentanaPrincipal.socios.get(filaSeleccionada).getApellidos() + " " +
                                    " ¿está completamente seguro de borrarlo?", "AVISO", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == 0) {

                        boolean eliminado = SocioDB.borrarSocio(socios.get(filaSeleccionada).getId_socio());

                        if (eliminado) {

                            JOptionPane.showMessageDialog(null,
                                    "Se ha eliminado el Socio correctamente",
                                    "Aviso",
                                    JOptionPane.WARNING_MESSAGE);

                            socios.get(filaSeleccionada).getTipoCuota().getSocios().remove(socios.get(filaSeleccionada));

                            socios.remove(filaSeleccionada);

                            JTsocios.setModel(new SocioModel());
                        }
                    }
                }
            }
        });

        /////////////Boton que Elimina Tipo de cuotas en BD//////////////////
        JBeliminarDatosTipoCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = JTtipoCuotas.getSelectedRow();

                if (filaSeleccionada < 0) {

                    JOptionPane.showMessageDialog(null,
                            "Debes seleccionar una fila de la tabla para poder eliminarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "Cuota Elegida: " + VentanaPrincipal.tipoCuotas.get(filaSeleccionada).getNombre() +
                                    " ¿está completamente seguro de borrarlo?", "AVISO", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == 0) {

                        boolean eliminado = TipoCuotaDB.borrarTipoCuota(tipoCuotas.get(filaSeleccionada).getId_cuota());

                        if (eliminado) {

                            JOptionPane.showMessageDialog(null,
                                    "Se ha eliminado el Tipo de Cuota correctamente",
                                    "Aviso",
                                    JOptionPane.WARNING_MESSAGE);

                            //tipoCuotas.get(filaSeleccionada).getSocios().remove(tipoCuotas.get(filaSeleccionada));

                            tipoCuotas.remove(filaSeleccionada);

                            JTtipoCuotas.setModel(new TipoCuotaModel());
                        }
                    }
                }
            }
        });

        /////////////Boton que Elimina Tipo de actividades en BD//////////////////
        JBeliminarTipoActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = JTtipoActividad.getSelectedRow();

                if (filaSeleccionada < 0) {

                    JOptionPane.showMessageDialog(null,
                            "Debes seleccionar una fila de la tabla para poder eliminarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "Actividad Elegida: " + VentanaPrincipal.tipoActividades.get(filaSeleccionada).getTipo() +
                                    " \n¿está completamente seguro de borrarlo?", "AVISO", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == 0) {

                        boolean eliminado = TipoActividadDB.borrarTipoActividad(tipoActividades.get(filaSeleccionada).getId_tipo());

                        if (eliminado) {

                            JOptionPane.showMessageDialog(null,
                                    "Se ha eliminado el tipo de actividad correctamente",
                                    "Aviso",
                                    JOptionPane.WARNING_MESSAGE);

                            //tipoCuotas.get(filaSeleccionada).getSocios().remove(tipoCuotas.get(filaSeleccionada));

                            tipoActividades.remove(filaSeleccionada);

                            JTtipoActividad.setModel(new TipoActividadModel());
                        }
                    }
                }
            }
        });

        /////////////Boton que Elimina Cargos en BD//////////////////
        JBeliminarCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int filaSeleccionada = JTcargos.getSelectedRow();

                if (filaSeleccionada < 0) {

                    JOptionPane.showMessageDialog(null,
                            "Debes seleccionar una fila de la tabla para poder eliminarla",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    int confirmacion = JOptionPane.showConfirmDialog(null,
                            "Cargo Elegido: " + VentanaPrincipal.cargos.get(filaSeleccionada).getTipo() +
                                    " \n¿está completamente seguro de borrarlo?", "AVISO", JOptionPane.YES_NO_OPTION);

                    if (confirmacion == 0) {

                        boolean eliminado = CargoDB.borrarCargos(cargos.get(filaSeleccionada).getIdCargo());

                        if (eliminado) {

                            JOptionPane.showMessageDialog(null,
                                    "Se ha eliminado el cargo correctamente",
                                    "Aviso",
                                    JOptionPane.WARNING_MESSAGE);

                            //tipoCuotas.get(filaSeleccionada).getSocios().remove(tipoCuotas.get(filaSeleccionada));

                            cargos.remove(filaSeleccionada);

                            JTcargos.setModel(new CargoModel());
                        }
                    }
                }
            }
        });

        //////////////////////////////////////BOTONES DE ELIMINAR//////////////////////////////////////

        /////////////Boton que limpia los TextField de Socios//////////////////
        JBlimpiarDatosSocio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JTnombreSocio.setText("");
                JTapellidoSocio.setText("");
                JTdniSocios.setText("");
                DPfechaNacimientoSocio.setText("");
                JTtelefonoSocio.setText("");
                JTemailSocio.setText("");
                DPfechaAltaSocio.setText("");
                DPfechaBajaSocio.setText("");
            }
        });

        /////////////Boton que limpia el TextField de Cargos//////////////////
        JBlimpiarCargo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JTanyadirTipoCargo.setText("");
            }
        });

        /////////////Boton que limpia los TextField de TipoCuotas//////////////////
        JBlimpiarDatosTipoCuota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JTanyadirCantidadTipoCuota.setText("");
                spinner1.setValue(4);
                JTanyadirNombreTipoCuota.setText("");
            }
        });

        /////////////Boton que limpia el TextField de TipoActividad//////////////////
        JBlimpiarTipoActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JTanyadirTipoActividad.setText("");
            }
        });

        /////////////Boton que limpia los TextField de Junta//////////////////
        JBlimpiarDatosCargoJunta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //todo: falta campos de ComboBox
                //JCBseleccionarCargoJunta.setSelectedIndex(Integer.parseInt(""));
                DPfechaAltaCargoJunta.setText("");
                DPfechaBajaCargoJunta.setText("");

            }
        });

        JBlimpiarDatosOrganizarActividad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //todo: falta campos de ComboBox
                JTprecioCrearActividad.setText("");

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

        /////////////////Cada una de las pestañas de la parte superior//////////////////////
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                switch (tabbedPane.getSelectedIndex()) {
                    case 0:
                        //pestaña principal

                        break;
                    case 1:
                        //modificar login
                        break;

                    case 2:
                        JTestadoCuotas.setModel(new CuotaModel());

                        break;

                    case 3:
                        JTtipoCuotas.setModel(new TipoCuotaModel());
                        break;

                    case 4:
                        JTmostrarDatosJunta.setModel(new SocioModel());
                        JTmostrarCargosJunta.setModel(new JuntaModel());
                        break;

                    case 5:
                        JTcargos.setModel(new CargoModel());
                        break;

                    case 6:
                        JTsocios.setModel(new SocioModel());
                        break;

                    case 7:

                        break;

                    case 8:
                        JTtipoActividad.setModel(new TipoActividadModel());
                        break;
                }
            }
        });



    }
}






