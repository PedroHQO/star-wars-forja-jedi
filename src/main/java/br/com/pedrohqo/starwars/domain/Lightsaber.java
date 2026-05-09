package br.com.pedrohqo.starwars.domain;

public class Lightsaber {
    private KyberCrystal crystal;

    public Lightsaber(KyberCrystal crystal) {
        this.crystal = crystal;
    }

    public void ignite(){
        String color = crystal.getColorCode();
        String reset = KyberCrystal.RESET_COLOR;

        System.out.println("Ligando sabre de Luz...");
        System.out.println("🗡️ [===||=======> " + color + "================================================" + reset);
    }
}
