package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

public class Main {
    public static void main(String[] args) {
        FactoryReporte f = new FactoryPDF();
        f.generarReporte();

        FactoryReporte f1 = new FactoryExcel();
        f1.generarReporte();

        FactoryReporte f2 = new FactoryHTML();
        f2.generarReporte();
    }
}