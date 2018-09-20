package com.htmltoexcel.test;

import com.docraptor.ApiException;
import com.htmltoexcel.HtmlToExcel;

public class Test {
				
	public static void main(String[] args) throws ApiException {
					//html code can be table.
		/*String html = "<body>\n" + 
				"\n" + 
				"<table style=\"width:100%\">\n" + 
				"  <caption>Monthly savings</caption>\n" + 
				"  <tr>\n" + 
				"    <th>Month</th>\n" + 
				"    <th>Savings</th>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>January</td>\n" + 
				"    <td>$100</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>February</td>\n" + 
				"    <td>$50</td>\n" + 
				"  </tr>\n" + 
				"</table>\n" + 
				"\n" + 
				"</body>";
*/
		// OR
		
		String html = "<table style=\"width:100%\">\n" + 
				"  <caption>Monthly savings</caption>\n" + 
				"  <tr>\n" + 
				"    <th>Month</th>\n" + 
				"    <th>Savings</th>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>January</td>\n" + 
				"    <td>$100</td>\n" + 
				"  </tr>\n" + 
				"  <tr>\n" + 
				"    <td>February</td>\n" + 
				"    <td>$50</td>\n" + 
				"  </tr>\n" + 
				"</table>";
		
		
			//This library is a little slow. it can take about 3 seconds.
		if(HtmlToExcel.htmlToExcel(html, "htmltoexcel"))
			System.out.println("Completed successfully");
		else
			System.err.println("ERROR");
	}

}
