package riri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RiriLogExample {
    private static Logger logger = LoggerFactory.getLogger(RiriLogExample.class);

    public void doSomeLogging() {
        logger.trace("Riri: Esto es un TRACE");
        logger.debug("Riri: Esto es un DEBUG"); // inicialmente configurado para que logue a apartir de este nivel
        logger.info("Riri: Esto es un INFO");
        logger.warn("Riri: Esto es un WARN");
        logger.error("Riri: Esto es un ERROR");
    }
}
