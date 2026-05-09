package br.com.pedrohqo.starwars.domain;

public abstract class ForceUser {
    private String name;
    private Lightsaber lightsaber;

    public ForceUser(String name, Lightsaber lightsaber) {
        this.name = name;
        this.lightsaber = lightsaber;
    }

    public String getName() {
        return name;
    }

    public Lightsaber getLightsaber() {
        return lightsaber;
    }

    public abstract void useForce();
}
