package Entities;

import SuperPowers.SuperPower;

public class SuperHero extends ComicBookCharacter{

    public SuperHero(String alias, String aliasSecret, SuperPower superPower) {
        super(alias, aliasSecret, superPower);
    }

    public SuperHero(String alias) {
        super(alias);
    }

    @Override
    public String encounter(SuperHero sh) {
        String outcome = (this.getAlias() + " high-fives " + sh.getAlias());
        return outcome;
    }

    @Override
    public String encounter(SuperVillian sv) {
        String outcome = (this.getAlias() + " battles " + sv.getAlias() + " using " + this.getSuperPower().getUserFriendlyName());
        return outcome;
    }
}

