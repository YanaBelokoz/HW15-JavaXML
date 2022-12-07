package Dom;

import Flower.Flower;

import javax.swing.text.Document;
import java.io.File;
import java.util.ArrayList;

public class ParserFile {
    public static ArrayList<Flower> getFlowerList(File xmlFile, File xsd){
        CreatorFile creatorFile = new CreatorFile(xmlFile);
        Document doc = creatorFile.getDocument();
        ReaderFile reader = null;
        return reader.readDoc(doc);
    }
}
