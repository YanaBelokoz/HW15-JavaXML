package Dom;

import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class CreatorFile {
   private DocumentBuilder documentBuilder;
   private Document document;

   CreatorFile(File xmlFile){
       createBuilder();
       createDoc(xmlFile);
   }

   private void createBuilder(){
       DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

       try {
          documentBuilder = builderFactory.newDocumentBuilder();
       } catch (ParserConfigurationException e){
           e.printStackTrace();
       }

       public void createDoc(File xmlFile){
           try{
               document = documentBuilder.parse(xmlFile);
           } catch (SAXException e){
               e.printStackTrace();
           }
       }

       Document getDocument(){
           return document;
       }
   }
}