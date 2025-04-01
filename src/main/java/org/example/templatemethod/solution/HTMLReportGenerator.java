package org.example.templatemethod.solution;

public class HTMLReportGenerator extends ReportGenerator {

    @Override
    public void exportReport() {
        System.out.println("Exporting HTML report.");
    }

    @Override
    public void generateContent() {
        System.out.println("<html><body><h1>Report</h1><p>This is an HTML report.</p></body></html>");
    }
}
