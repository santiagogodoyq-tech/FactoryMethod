package co.edu.uniquindio.poo.model;

public class FactoryPDF extends FactoryReporte {
    @Override
    public Reporte crearReporte() {
        return new ReportPDF();
    }
}
