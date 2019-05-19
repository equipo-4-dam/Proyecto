package Paquete;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class SocioModel extends AbstractTableModel {

    private String[] columnas = {
            "Nombre",
            "Apellidos",
            "Dni",
            "Fecha de Nacimiento",
            "Telefono",
            "Email",
            "Fecha de Alta",
            "Fecha de Baja"};

    public SocioModel() {

        //cargamos datos
        VentanaPrincipal.setSocios(SocioDB.recogidaSocios());
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.getSocios().size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Socio s = VentanaPrincipal.getSocios().get(rowIndex);

        switch (columnIndex) {

            case 0:
                return s.getNombre();

            case 1:
                return s.getApellidos();

            case 2:
                return s.getDni();

            case 3:
                return s.getFecha();

            case 4:
                return s.getTelefono();

            case 5:
                return s.getEmail();

            case 6:
                return s.getFechaAlta();

            case 7:
                return s.getFechaBaja();

        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
