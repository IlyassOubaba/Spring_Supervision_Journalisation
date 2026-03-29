package ma.fstkech.service;

import io.micrometer.core.instrument.Metrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemService {
    private static final Logger logger = LoggerFactory.getLogger(DemService.class);

    public String processData() {
        logger.info("Démarrage du traitement des données");

        // Prometheus metric
        Metrics.counter("custom.requests.count").increment();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            logger.error("Erreur dans le traitement", e);
        }

        logger.info("Traitement terminé avec succès");
        return "Traitement effectué";
    }
}