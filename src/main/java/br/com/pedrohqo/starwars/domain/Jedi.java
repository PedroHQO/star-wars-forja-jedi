package br.com.pedrohqo.starwars.domain;

public class Jedi extends  ForceUser{

    public Jedi(String name, Lightsaber lightsaber) {
        super(name, lightsaber);
    }

    @Override
    public void useForce() {
        System.out.println("Usando o truque mental Jedi!");
    }
}
