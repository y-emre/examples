package com.htmltoexcel;

import java.io.FileOutputStream;

import com.docraptor.ApiClient;
import com.docraptor.ApiException;
import com.docraptor.Doc;
import com.docraptor.DocApi;

public class HtmlToExcel {
	
	public static boolean htmlToExcel(String html, String excelName) throws ApiException{
		DocApi docraptor = new DocApi();
	    ApiClient client = docraptor.getApiClient();
	    client.setUsername("YOUR_API_KEY_HERE");
		
		try {
		      Doc doc = buildDoc(html, excelName);                                  
		      byte[] create_response = docraptor.createDoc(doc);
		      FileOutputStream file = new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + excelName + ".xlsx");
		      file.write(create_response);
		      file.close();
		      return true;
		} catch (Exception e) {
		      System.err.println(e.getMessage());
		      return false;
		}
	}
	
	private static Doc buildDoc(String html, String excelName) {
		Doc doc = new Doc();
	    doc.setTest(true);                                                   
	    doc.setDocumentContent(html);     
	    doc.setDocumentType(Doc.DocumentTypeEnum.XLSX);                       
	    doc.setName(excelName + ".xlsx");
	    return doc;  
	}
}
