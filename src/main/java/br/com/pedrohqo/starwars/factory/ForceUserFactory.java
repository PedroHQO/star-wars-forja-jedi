package br.com.pedrohqo.starwars.factory;

import br.com.pedrohqo.starwars.domain.*;

public class ForceUserFactory {
    public static ForceUser createCharacter(String name, int alignmentChoice, int colorChoice){

        KyberCrystal crystal;
        switch(colorChoice){
            case 1: crystal = KyberCrystal.AZUL; break;
            case 2: crystal = KyberCrystal.VERDE; break;
            case 3: crystal = KyberCrystal.VERMELHO; break;
            case 4: crystal = KyberCrystal.ROXO; break;
            default: crystal = KyberCrystal.VERDE; break;
        }

        Lightsaber saber = new Lightsaber(crystal);

        if(alignmentChoice == 2){
            return new Sith(name, saber);
        }else{
            return new Jedi(name, saber);
        }
    }
}
