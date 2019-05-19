package Paquete;

import javax.swing.table.AbstractTableModel;

public class TipoCuotaModel extends AbstractTableModel {

    private String[] columnas = {
      "Cantidad",
      "Edad limite",
      "Tipo de cuota"};

    public TipoCuotaModel(){

        VentanaPrincipal.setTipoCuotas(TipoCuotaDB.recogidaTipoCuota());
    }

    @Override
    public int getRowCount() {
        return VentanaPrincipal.getTipoCuotas().size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        TipoCuota tc = VentanaPrincipal.getTipoCuotas().get(rowIndex);

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
