package co.edu.uniquindio.poo.model;

public class FactoryExcel extends FactoryReporte {
    @Override
    public Reporte crearReporte() {
        return new ReportExcel();
    }

}
