package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmasadorPizzaDelgada implements IAmasador {
    @Override
    public void amasar() {
        Logger.getLogger(AmasadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[@@] Amasando la pizza delgada con masa convencional.");
        // Llamado al microcontrolador específico...
    }
}
