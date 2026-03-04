package co.edu.uniquindio.poo.model;

public class ReportHTML implements Reporte{
    @Override
    public void generar() {
        System.out.println("Generando reporte en formato HTML...");
    }

    @Override
    public String getTipo() {
        return "HTML";
    }
}
