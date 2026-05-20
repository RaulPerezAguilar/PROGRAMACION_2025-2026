package EJ16;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class EJ16 {
    public static void main(String[] args) throws Exception {
        try {

            // === FASE 1: Crear documento vacío ===
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Documento nuevo (vacío)
            Document documento = builder.newDocument();

            // === FASE 2: Crear estructura XML ===

            // Crear raíz <videojuego>
            Element raiz = documento.createElement("videojuego");

            // Añadir raíz al documento
            documento.appendChild(raiz);

            // Crear <pantalla>
            Element pantalla = documento.createElement("pantalla");

            // Atributo de pantalla
            pantalla.setAttribute("resolucion", "1080p");

            // Texto interno
            pantalla.setTextContent("Full HD");

            // Añadir pantalla a la raíz
            raiz.appendChild(pantalla);

            // Crear <audio>
            Element audio = documento.createElement("audio");

            // Atributo de audio
            audio.setAttribute("volumen", "80");

            // Texto interno
            audio.setTextContent("false");

            // Añadir audio a la raíz
            raiz.appendChild(audio);

            // === FASE 3: Guardar XML en archivo ===
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Formato bonito
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            // Origen (DOM)
            DOMSource origen = new DOMSource(documento);

            // Destino (archivo)
            StreamResult destino = new StreamResult(new File("juego_config.xml"));

            // Guardar XML en archivo
            transformer.transform(origen, destino);

            System.out.println("¡Archivo XML generado con éxito!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}