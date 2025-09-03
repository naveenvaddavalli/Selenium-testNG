package com.resources;

import java.io.FileOutputStream;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfListeners  implements ITestListener  {

	
	    Document document;
	    PdfWriter writer;

	    @Override
	    public void onStart(ITestContext context) {
	        try {
	            document = new Document();
	            writer = PdfWriter.getInstance(document, new FileOutputStream("TestReport.pdf"));
	            document.open();
	            document.add(new Paragraph("Test Execution Started"));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

//	    @Override
//	    public void onTestSuccess(ITestResult result) {
//	        document.add(new Paragraph("PASS: " + result.getName()));
//	    }
//
//	    @Override
//	    public void onTestFailure(ITestResult result) {
//	        document.add(new Paragraph("FAIL: " + result.getName()));
//	    }
//
//	    @Override
//	    public void onFinish(ITestContext context) {
//	        document.add(new Paragraph("Test Execution Finished"));
//	        document.close();
//	    }
	}


