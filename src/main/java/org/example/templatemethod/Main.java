/*
* Implémenter le Pattern Template Method
👉 Contexte : Vous devez concevoir un système de génération de rapports qui peut produire des rapports PDF et HTML.
* */

package org.example.templatemethod;

import org.example.templatemethod.solution.HTMLReportGenerator;
import org.example.templatemethod.solution.PDFReportGenerator;
import org.example.templatemethod.solution.ReportGenerator;

public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReport = new PDFReportGenerator();
        pdfReport.generateReport();

        ReportGenerator htmlReport = new HTMLReportGenerator();
        htmlReport.generateReport();
    }
}
