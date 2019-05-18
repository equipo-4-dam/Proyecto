package Paquete;

import javax.swing.table.AbstractTableModel;

public class CuotaModel extends AbstractTableModel {

    private String[] columnas = {
            "Nombre",
            "Apellido",
            "Tipo de cuota",
            "Precio cuota",
            "Fecha de pago",
            "Estado cuota"};


    public CuotaModel() {

    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.socios.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Socio s = VentanaPrincipal.socios.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return s.getNombre();
            case 1:
                return s.getApellidos();
            case 2:
                return s.getTipoCuota().getNombre();
            case 3:
                return s.getTipoCuota().getCantidad();
            case 4:
                return s.getFechaPago();
            case 5:
                return s.isPagado() ? "PAGADO" : "NO PAGADO";
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

