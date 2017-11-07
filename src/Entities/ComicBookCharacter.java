package Entities;

import SuperPowers.SuperPower;

public abstract class ComicBookCharacter {

    public abstract String encounter(SuperHero sh);
    public abstract String encounter(SuperVillian sv);

    public ComicBookCharacter(String alias, String aliasSecret, SuperPower superPower) {
        this.alias = alias;
        this.aliasSecret = aliasSecret;
        this.superPower = superPower;
    }

    public ComicBookCharacter(String alias){
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
    public String getAliasSecret() {
        return aliasSecret;
    }
    private String alias;
    private String aliasSecret;

    public SuperPower getSuperPower() {
        return superPower;
    }

    private SuperPower superPower;
}
