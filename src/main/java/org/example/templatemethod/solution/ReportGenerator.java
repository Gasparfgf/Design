package org.example.templatemethod.solution;

public abstract class ReportGenerator {

    public void generateReport() {
        prepareReport();
        generateContent();
        exportReport();
    }

    public abstract void exportReport();

    public abstract void generateContent();

    private void prepareReport() {
        System.out.println("Preparing report...");
    }
}
