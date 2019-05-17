package Paquete;

import javax.swing.table.AbstractTableModel;

public class TipoCuotaModel extends AbstractTableModel {

    private String[] columnas = {
      "Cantidad",
      "Edad limite",
      "Tipo de cuota"};

    public TipoCuotaModel(){

        VentanaPrincipal.tipoCuotas = TipoCuotaDB.recogidaTipoCuota();
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.tipoCuotas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        TipoCuota tc = VentanaPrincipal.tipoCuotas.get(rowIndex);

        switch (columnIndex){
            case 0:
                return tc.getCantidad();
            case 1:
                return tc.getEdad_limite();
            case 2:
                return tc.getNombre();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
