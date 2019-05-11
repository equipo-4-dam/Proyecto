package Paquete;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
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

    //modelos para las putas tablas
    DefaultTableModel modeloCargos;


   // static final List<Socio> socios = new ArrayList<>();

    ////////////////////////Cosas de la ventana CARGOS //////////////////////
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
    }
    /////////////////////////////////////////////////////////////////

    /**
     * public void prueba() {
     * <p>
     * Object [] fila = new Object[2];
     * <p>
     * fila[0] =
     * <p>
     * JTsocios.add();
     * }
     **/
    public static void main(String[] args) {

        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Llamada a la funcion para conectarse a la BD
        Connection conectionBD = Conexion.Con();

        if (conectionBD != null) {

            try {
                //Consulta simple
                Statement statement = conectionBD.createStatement();
                System.out.println("1");

                ResultSet resultado = statement.executeQuery("SELECT * FROM CARGOS");

                while (resultado.next()) {


                    System.out.println("Buble");
                    System.out.println(resultado.getString(1) + " " + resultado.getString(2));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }

    //para crear esto en el form hay que seleccionar custom create
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


    }

    private void recargarTablaCargos(List<Cargo> cargos, DefaultTableModel modelo) {

        modelo.setRowCount(0);

        //bucle para meter en la tabla lo que tiene la lista
        for (Cargo cargo : cargos) {

            //model.insertRow(model.getRowCount(),new Object[]{cargo.getIdCargo(),cargo.getTipo()});
            modelo.insertRow(modelo.getRowCount(), new Object[]{cargo.getTipo()});

        }
    }
}
