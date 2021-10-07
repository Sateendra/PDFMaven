package test;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class NewTest {
	static PDDocument doc;
	String PDFPath = "C:\\Users\\satee\\Desktop\\Sample PDF.pdf";
    String textPath = "C:\\Users\\satee\\Desktop\\sample2.txt";
    
  @Test
  public void f() throws IOException {
	  readPDF(PDFPath,textPath);
	  System.out.println("abc"); 
  }
  
  @SuppressWarnings("deprecation")
public static void readPDF(String pathofPDF, String pathofText) throws IOException {
      //Loading an existing document  
      File file = new File(pathofPDF);  
      PDDocument doc = Loader.loadPDF(file);  
      //Instantiate PDFTextStripper class  
      PDFTextStripper pdfStripper = new PDFTextStripper();  
      //Retrieving text from PDF document  
      String text = pdfStripper.getText(doc);  
      System.out.println("Text in PDF\n---------------------------------");  
      System.out.println(text);  
      //Closing the document  
      doc.close();  
      //Writing the PDF Text to text file
      File DestFile = new File (pathofText);
      FileUtils.writeStringToFile(DestFile, text);
  }
  
}

