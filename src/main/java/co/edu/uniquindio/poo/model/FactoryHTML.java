package co.edu.uniquindio.poo.model;

public class FactoryHTML extends FactoryReporte {
    @Override
    public Reporte crearReporte() {
        return new ReportHTML();
    }
}
