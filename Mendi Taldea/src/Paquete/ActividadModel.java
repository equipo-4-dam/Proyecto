package Paquete;

import javax.swing.table.AbstractTableModel;

public class ActividadModel extends AbstractTableModel {

    private String[] columnas = {
            "Tipo de actividad",
            "Fecha",
            "Dificultad",
            "Precio",
            "Descripción"
    };

    public ActividadModel() {

        //cargamos datos
        VentanaPrincipal.actividades = ActividadDB.recogidaActividad();
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.actividades.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Actividad actividad = VentanaPrincipal.actividades.get(rowIndex);

        switch (columnIndex){
            case 0:
                return actividad.getTipoActividad();
            case 1:
                return actividad.getFecha();
            case 2:
                return actividad.getDificultad();
            case 3:
                return actividad.getPrecio();
            case 4:
                return actividad.getDescripcion();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
