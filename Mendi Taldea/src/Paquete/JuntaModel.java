package Paquete;

import javax.swing.table.AbstractTableModel;

public class JuntaModel extends AbstractTableModel {

    private String[] columnas = {

            "Nombre",
            "Apellido",
            "DNI",
            "Teléfono",
            "Fecha de alta",
            "Fecha de nombramiento"};

    public JuntaModel() {
        //cargamos datos

        VentanaPrincipal.setMiembrosJunta(SocioDB.recogidaSociosVentanaJunta());
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.getMiembrosJunta().size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Socio s = VentanaPrincipal.getMiembrosJunta().get(rowIndex);

        switch (columnIndex) {
           // case 0:
             //   return s.getTipoCargo().getTipo();
            case 0:
                return s.getNombre();
            case 1:
                return s.getApellidos();
            case 2:
                return s.getDni();
            case 3:
                return s.getFechaAlta();
            case 4:
                return s.getFechaInicioNombramiento();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

