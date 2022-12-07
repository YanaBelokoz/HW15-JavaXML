package Dom;

import Flower.Flower;
import Flower.Growing;
import Flower.Visual;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ReaderFile {

    ArrayList<Flower> readDoc(Document doc){
        doc.getDocumentElement().normalize();
        ArrayList<Flower> flowers = new ArrayList<>();
        NodeList nodeList = doc.getElementsByTagName("Flower");
        for (int i = 0; i < nodeList.getLength() ; i++) {
            Flower flower = new Flower();
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                flower.setSoil(element.getElementsByTagName("Soil").item(0).getTextContent());
                flower.setMultiplying(element.getElementsByTagName("Multiplying").item(0).getTextContent());
                flower.setName(element.getAttributes().getNamedItem("name").getNodeValue());
                flower.setOrigin(element.getAttributes().getNamedItem("origin").getNodeValue());
                flower.setGrowing(getGrowing(element.getElementsByTagName("Growing")));
                flower.setVisual(getVisual(element.getElementsByTagName("Visual")));
                flowers.add(flower);
            }
        }
        return flowers;
    }

    public Growing getGrowing(NodeList nodeList){
        Growing growing = new Growing();
        if(nodeList.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodeList.item(0);
            growing.setLight(Boolean. parseBoolean(element.getElementsByTagName("Light").item(0).getTextContent()));
            growing.setTemp(element.getElementsByTagName("Temp").item(0).getTextContent());
        }
        return growing;
    }

    public Visual getVisual(NodeList nodeList){
        Visual visual = new Visual();
        if(nodeList.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodeList.item(0);
            visual.setColor(element.getElementsByTagName("Color").item(0).getTextContent());
            visual.setLeafColor(element.getElementsByTagName("LeafColor").item(0).getTextContent());
            visual.setSize(element.getElementsByTagName("Size").item(0).getTextContent());
        }
        return visual;
    }
}
