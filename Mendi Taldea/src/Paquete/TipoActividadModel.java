package Paquete;

import javax.swing.table.AbstractTableModel;

public class TipoActividadModel extends AbstractTableModel {

    private String[] columnas = {
            "Tipos de actividades"};

    public TipoActividadModel() {

        VentanaPrincipal.setTipoActividades(TipoActividadDB.recogidaTipoActividad());
    }


    @Override
    public int getRowCount() {
        return VentanaPrincipal.getTipoActividades().size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        TipoActividad tp = VentanaPrincipal.getTipoActividades().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return tp.getTipo();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

