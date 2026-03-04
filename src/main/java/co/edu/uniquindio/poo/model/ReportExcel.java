package co.edu.uniquindio.poo.model;

public class ReportExcel implements Reporte{
    @Override
    public void generar() {
        System.out.println("Generando reporte en formato Excel...");
    }

    @Override
    public String getTipo() {
        return "Excel";
    }
}
