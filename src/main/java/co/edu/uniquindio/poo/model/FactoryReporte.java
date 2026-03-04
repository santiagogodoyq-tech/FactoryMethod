package co.edu.uniquindio.poo.model;

public abstract class FactoryReporte {

    public abstract Reporte crearReporte();

    public void generarReporte() {
        Reporte reporte = crearReporte();
        reporte.generar();
        System.out.println("Tipo: " + reporte.getTipo());
    }
}
