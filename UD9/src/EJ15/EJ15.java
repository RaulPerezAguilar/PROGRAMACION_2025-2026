import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LectorConfiguracion {

    public static void main(String[] args) {
        try {

            // 1. Factoría y constructor
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // 2. Parsear XML
            Document documento = builder.parse(new File("config.xml"));

            documento.getDocumentElement().normalize();

            // 3. Raíz
            Element raiz = documento.getDocumentElement();

            // 4. base-datos
            NodeList listaBaseDatos = raiz.getElementsByTagName("base-datos");
            Node nodoBaseDatos = listaBaseDatos.item(0);

            // 5. hijos
            NodeList hijos = nodoBaseDatos.getChildNodes();

            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());

            System.out.println("--- Listando hijos ---");

            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                System.out.println("Hijo " + i +
                        " -> Tipo: " + hijo.getNodeType() +
                        " | Nombre: " + hijo.getNodeName() +
                        " | Valor: " + hijo.getTextContent());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
