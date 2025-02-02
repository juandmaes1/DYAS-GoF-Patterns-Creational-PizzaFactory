package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HorneadorPizzaDelgada implements IHorneador {
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaDelgada.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");
        // Llamado al microcontrolador específico...
    }
}
