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


    public CuotaModel(){
        VentanaPrincipal.cuotas = CuotaDB.recogidaCuotas();
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.cuotas.size();
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
                return s.getCuotas().get(s.getCuotas().size() - 1).getFecha_pago();
            case 5:
                return s.getCuotas().get(s.getCuotas().size() - 1).isPagado() == 0 ? "NO PAGADO" : "PAGADO";
        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}

