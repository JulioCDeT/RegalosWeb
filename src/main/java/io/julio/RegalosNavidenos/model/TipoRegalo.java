package io.julio.RegalosNavidenos.model;

import lombok.Getter;

public enum TipoRegalo {
    INTERCAMBIO("Intercambio"),
    BROMA("Broma"),
    NAVIDAD("Navidad"),
    SANTOS_REYES("Santos reyes");

    @Getter
    private String strRepresentation;

    TipoRegalo(String strRepresentation) {
        this.strRepresentation = strRepresentation;
    }
}
