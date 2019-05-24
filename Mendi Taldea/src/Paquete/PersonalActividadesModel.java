package Paquete;

import javax.swing.table.AbstractTableModel;

public class PersonalActividadesModel extends AbstractTableModel {

    private String[] columnas = {
            "Tipo de actividad",
            "Organizador",
            "Fecha",
            "Dificultad",
            "Precio",
            "Descripción"
    };

    public PersonalActividadesModel() {

        //cargamos datos
        VentanaPrincipal.setActividadesPersonales(ActividadDB.recogidaActividadPersonal());
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.getActividadesPersonales().size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Actividad actividad = VentanaPrincipal.getActividadesPersonales().get(rowIndex);

        switch (columnIndex){
            case 0:
                return actividad.getTipoActividad().getTipo();
            case 1:
                return actividad.getOrganizador();
            case 2:
                return actividad.getFecha();
            case 3:
                return actividad.getDificultad();
            case 4:
                return actividad.getPrecio();
            case 5:
                return actividad.getDescripcion();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

}
