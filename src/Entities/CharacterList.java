package Entities;

import java.util.*;

public class CharacterList {

    private List<SuperHero> characterList = new LinkedList<>();

    public List<SuperHero> getCharacterList() { return characterList; }

    public void AddToList(SuperHero SuperHero) { characterList.add(SuperHero);}

    public void printCharacterList(SuperHero SuperHero){
        for(SuperHero s : getCharacterList()){
            System.out.print("Character : " +s.getAlias());
//            System.out.print("Secret Name : " +s.getAliasSecret());
//            System.out.print("Entities.Biography : " +s.getBiography());
//            System.out.print("Super Power(s) : " +s.getSuperPower());
        }
    }

}
