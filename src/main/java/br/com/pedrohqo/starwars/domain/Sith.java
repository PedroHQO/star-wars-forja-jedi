package br.com.pedrohqo.starwars.domain;

public class Sith extends ForceUser{

    public Sith(String name, Lightsaber lightsaber) {
        super(name, lightsaber);
    }

    @Override
    public void useForce() {
        System.out.println("Lançando relâmpagos da força!");
    }
}
