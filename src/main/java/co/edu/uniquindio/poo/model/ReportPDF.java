package co.edu.uniquindio.poo.model;

public class ReportPDF implements Reporte{
    @Override
    public void generar() {
        System.out.println("Generando reporte en formato PDF...");
    }

    @Override
    public String getTipo() {
        return "PDF";
    }
}
