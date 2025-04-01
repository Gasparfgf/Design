package org.example.templatemethod.solution;

public class PDFReportGenerator extends ReportGenerator{
    @Override
    public void exportReport() {
        System.out.println("Exporting pdf report.");
    }

    @Override
    public void generateContent() {
        System.out.println("This is a pdf report for template method");
    }
}
