package Paquete;

import javax.swing.table.AbstractTableModel;

public class CargoModel extends AbstractTableModel {

    private String[] columnas = {
            "Cargos"};

    public CargoModel() {
        //cargamos datos
        VentanaPrincipal.cargos = CargoDB.recogidaCargos();
    }


    @Override
    public int getRowCount() {
        return VentanaPrincipal.cargos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Cargo c = VentanaPrincipal.cargos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return c.getTipo();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

