package com.htmltopdf.test;

import com.htmltopdf.HtmlToPdf;

public class Test {
				
	public static void main(String[] args) {
//html code can be table, list, text, link, etc.(body elements) it can't be script, style, etc(head elements).
		String html = "<body>\n" + 
				"\n" + 
				"<h2>Cell that spans two rows:</h2>\n" + 
				"<table style=\"width:100%\">\n" + 
				"  <tr>\n" + 
				"    <th>Name:</th>\n" + 
				"    <td>James Fox</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <th rowspan=\"2\">Telephone:</th>\n" + 
				"    <td>55577854</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>55577855</td>\n" + 
				"  </tr>\n" + 
				"</table>\n" + 
				"\n" + 
				"</body>";

		// OR
		/*
		String html = "<h2>Cell that spans two rows:</h2>\n" + 
				"<table style=\"width:100%\">\n" + 
				"  <tr>\n" + 
				"    <th>Name:</th>\n" + 
				"    <td>James Fox</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <th rowspan=\"2\">Telephone:</th>\n" + 
				"    <td>55577854</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>55577855</td>\n" + 
				"  </tr>\n" + 
				"</table>";
		*/
		if(HtmlToPdf.htmlToPdf(html, "htmltopdf"))
			System.out.println("Completed successfully");
		else
			System.err.println("ERROR");
	}

}
