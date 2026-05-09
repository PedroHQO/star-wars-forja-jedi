package br.com.pedrohqo.starwars.domain;

public enum KyberCrystal {
    AZUL("\u001B[34m"),
    VERDE("\u001B[32m"),
    VERMELHO("\u001B[31m"),
    ROXO("\u001B[35m");

    private final String colorCode;
    public static final String RESET_COLOR = "\u001B[0m";

    KyberCrystal(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode() {
        return colorCode;
    }
}
