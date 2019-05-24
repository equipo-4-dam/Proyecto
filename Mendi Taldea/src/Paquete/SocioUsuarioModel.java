package Paquete;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SocioUsuarioModel extends AbstractTableModel {

    private List<Socio> sociosVistaUser;

    private String[] columnas = {
            "Nombre",
            "Apellidos"
    };

    public SocioUsuarioModel() {

        //cargamos datos
        sociosVistaUser = SocioDB.recogidaSocioUsuario();
    }

    @Override
    public int getRowCount() {
        return sociosVistaUser.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Socio s = sociosVistaUser.get(rowIndex);

        switch (columnIndex) {

            case 0:
                return s.getNombre();

            case 1:
                return s.getApellidos();

        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

}
