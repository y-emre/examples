package com.htmltopdf;

import java.io.FileOutputStream;
import java.io.StringReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;

public class HtmlToPdf {
	
	public static boolean htmlToPdf(String html, String pdfName){
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + pdfName + ".pdf"));
			document.open();
			HTMLWorker htmlWorker = new HTMLWorker(document);
			htmlWorker.parse(new StringReader(html));
			document.close();
			return true;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}

}
