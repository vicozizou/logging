import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import riri.RiriLogExample;

public class LogExample {
    private static Logger logger = LoggerFactory.getLogger(LogExample.class);

    public static void main(String args[]) {
        // inicialmente solo debería loguear a partir de los warnings (vea logback.xml linea 16)
        logger.trace("Esto es un TRACE");
        logger.debug("Esto es un DEBUG");
        logger.info("Esto es un INFO");
        logger.warn("Esto es un WARN"); // inicialmente configurado para que logue a apartir de este nivel
        logger.error("Esto es un ERROR");
        // mae fatal no existe

        // ahora llamo a lógica que hace loggin pero de otra clase en otro paquete (vea logack.xml linea 12)
        RiriLogExample riri = new RiriLogExample();
        // esta mae loguea a partir de debug
        riri.doSomeLogging();
    }
}
