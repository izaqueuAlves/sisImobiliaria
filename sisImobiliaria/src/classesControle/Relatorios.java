/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import com.itextpdf.text.Document;
import javax.persistence.Entity;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.ArrayList;


/**
 *
 * @author jp
 */
@Entity
public class Relatorios {
    public static void gerarRelatorio(ArrayList<String> a, String nome){
        Document doc = new Document();
        int n = a.size();
        
       
          try {
              
              
              FileOutputStream arc = new FileOutputStream(nome);
              PdfWriter.getInstance(doc, arc);
              doc.open();
              
              // adicionando um parágrafo no documento
              for (int i=0; i<n; i++){
                  
                  doc.add(new Paragraph(a.get(i)));
              }
}
          catch(DocumentException | IOException de) {
              System.err.println(de.getMessage());
          }
          doc.close();
      }   
    
}
